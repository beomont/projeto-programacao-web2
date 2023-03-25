package com.example.projetoprogramacaoweb2.service;

import com.example.projetoprogramacaoweb2.model.dto.LivroDTO;
import com.example.projetoprogramacaoweb2.model.entity.CategoriaEntity;
import com.example.projetoprogramacaoweb2.model.entity.EditoraEntity;
import com.example.projetoprogramacaoweb2.model.entity.LivroEntity;
import com.example.projetoprogramacaoweb2.model.mapper.LivroMapper;
import com.example.projetoprogramacaoweb2.repository.LivroRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private LivroMapper livroMapper;

    public List<LivroDTO> listar() {
        List<LivroEntity> listaEntities = livroRepository.findAll();
        return livroMapper.updateListaLivroDTO(listaEntities);
    }

    public List<LivroDTO> filtrar(String nome, String isbn) {
        List<LivroEntity> listaEntities = livroRepository.findByNomeOrIsbn(nome, isbn);
        return livroMapper.updateListaLivroDTO(listaEntities);
    }

    public List<LivroDTO> listarPorCategoria(Long idCategoria) {
        CategoriaEntity categoria = new CategoriaEntity();
        categoria.setId(idCategoria);
        List<LivroEntity> listaEntities =  livroRepository.findByCategoria(categoria);
        return livroMapper.updateListaLivroDTO(listaEntities);
    }

    public List<LivroDTO> listarPorEditora(Long idEditora) {
        EditoraEntity editora = new EditoraEntity();
        editora.setId(idEditora);
        List<LivroEntity> listaEntities =  livroRepository.findByEditora(editora);
        return livroMapper.updateListaLivroDTO(listaEntities);
    }


    public LivroDTO pegarUm(Long id) {

        Optional<LivroEntity> livroEntityOp = livroRepository.findById(id);

        if (livroEntityOp.isPresent()) {
            LivroEntity livroEntity = livroEntityOp.get();
            return livroMapper.update(livroEntity);
        }
        throw new EntityNotFoundException("Livro não encontrado");
    }

    public LivroDTO criar(LivroDTO livroDTO) {
        LivroEntity livro = livroMapper.update(livroDTO);
        livro = livroRepository.save(livro);
        return livroMapper.update(livro);
    }

    public LivroDTO editar(LivroDTO livroDTO, Long id) {

        if (livroRepository.existsById(id)) {
            LivroEntity livro = livroMapper.update(livroDTO);
            livro.setId(id);
            livro = livroRepository.save(livro);

            return livroMapper.update(livro);
        }
        throw new EntityNotFoundException("Livro não encontrado!");
    }

    public void deletar(Long id) {
        Optional<LivroEntity> livroEntityOp = livroRepository.findById(id);

        if (livroEntityOp.isPresent()) {
            LivroEntity livroEntity = livroEntityOp.get();
            livroRepository.delete(livroEntity);
            return;
        }
        throw new EntityNotFoundException("Livro não encontrado!");
    }
}
