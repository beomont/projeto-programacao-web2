package com.example.projetoprogramacaoweb2.service;

import com.example.projetoprogramacaoweb2.model.dto.CategoriaDTO;
import com.example.projetoprogramacaoweb2.model.entity.CategoriaEntity;
import com.example.projetoprogramacaoweb2.model.mapper.CategoriaMapper;
import com.example.projetoprogramacaoweb2.repository.CategoriaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private CategoriaMapper categoriaMapper;


    public CategoriaDTO pegarCategoriaById(Long id) {

        Optional<CategoriaEntity> categoriaEntityOp = categoriaRepository.findById(id);

        if (categoriaEntityOp.isPresent()) {
            CategoriaEntity categoriaEntity = categoriaEntityOp.get();
            return categoriaMapper.update(categoriaEntity);
        }
        throw new EntityNotFoundException("Categoria não encontrada");
    }

    public CategoriaDTO criar(CategoriaDTO categoriaDTO) {

        //Vem a informação do usuário, converto em Entity
        CategoriaEntity categoria = categoriaMapper.update(categoriaDTO);

        //Salvo a categoria em entity na base de dados
        categoria = categoriaRepository.save(categoria);

        //Converto novamente para DTO e retorno para o usuário
        return categoriaMapper.update(categoria);

    }

    public CategoriaDTO editar(CategoriaDTO categoriaDTO, Long id) {

        if(categoriaRepository.existsById(id)){
            CategoriaEntity categoriaEntity = categoriaMapper.update(categoriaDTO);
            categoriaEntity.setId(id);
            categoriaEntity = categoriaRepository.save(categoriaEntity);

            return categoriaMapper.update(categoriaEntity);
        }
        throw new EntityNotFoundException("Categoria não encontrada");
    }

    public void deletar(Long id) {
        Optional<CategoriaEntity> categoriaEntityOp = categoriaRepository.findById(id);

        if (categoriaEntityOp.isPresent()) {
            CategoriaEntity categoriaEntity = categoriaEntityOp.get();
            categoriaRepository.delete(categoriaEntity);
            return;
        }
        throw new EntityNotFoundException("Categoria não encontrada!");
    }

    public List<CategoriaDTO> listarTodos() {
        List<CategoriaEntity> listaEntities = categoriaRepository.findAll();
        return categoriaMapper.updateListDTO(listaEntities);
    }


}
