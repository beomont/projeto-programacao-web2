package com.example.projetoprogramacaoweb2.model.mapper;

import com.example.projetoprogramacaoweb2.model.dto.CategoriaDTO;
import com.example.projetoprogramacaoweb2.model.entity.CategoriaEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoriaMapper {


    public CategoriaDTO update(CategoriaEntity categoriaEntity) {
        CategoriaDTO categoriaDTO = new CategoriaDTO();
        categoriaDTO.setId(categoriaEntity.getId());
        categoriaDTO.setNome(categoriaEntity.getNome());
        return categoriaDTO;
    }

    public CategoriaEntity update(CategoriaDTO categoriaDTO) {
        CategoriaEntity categoriaEntity = new CategoriaEntity();
        categoriaEntity.setId(categoriaDTO.getId());
        categoriaEntity.setNome(categoriaDTO.getNome());
        return categoriaEntity;
    }


    public List<CategoriaEntity> updateListEntity(List<CategoriaDTO> listaDTO ){
        return listaDTO.stream()
                .map(categoriaDTO -> this.update(categoriaDTO))
                .toList();
    }

    public List<CategoriaDTO> updateListDTO(List<CategoriaEntity> listaEntity ){
        return listaEntity.stream()
                .map(categoriaEntity -> this.update(categoriaEntity))
                .toList();
    }



}
