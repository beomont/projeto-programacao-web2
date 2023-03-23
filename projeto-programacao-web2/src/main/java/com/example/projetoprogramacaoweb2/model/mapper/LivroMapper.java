package com.example.projetoprogramacaoweb2.model.mapper;

import com.example.projetoprogramacaoweb2.model.dto.LivroDTO;
import com.example.projetoprogramacaoweb2.model.entity.LivroEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LivroMapper {

    public LivroDTO update(LivroEntity livro) {
        LivroDTO livroDTO = new LivroDTO();
        livroDTO.setId(livro.getId());
        livroDTO.setNome(livro.getNome());
        livroDTO.setIsbn(livro.getIsbn());
        return livroDTO;
    }

    public LivroEntity update(LivroDTO livro) {
        LivroEntity livroEntity = new LivroEntity();
        livroEntity.setNome(livro.getNome());
        livroEntity.setIsbn(livro.getIsbn());
        return livroEntity;
    }

    public List<LivroDTO> updateListaLivroDTO(List<LivroEntity> listaLivroEntity) {
        return listaLivroEntity.stream().map(livroEntity -> this.update(livroEntity)).toList();
    }

    public List<LivroEntity> updateListaLivroEntity(List<LivroDTO> listaLivroDTO) {
        return listaLivroDTO.stream().map(livroDTO -> this.update(livroDTO)).toList();
    }

}
