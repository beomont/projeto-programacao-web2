package com.example.projetoprogramacaoweb2.service;

import com.example.projetoprogramacaoweb2.model.dto.EditoraDTO;
import com.example.projetoprogramacaoweb2.model.entity.EditoraEntity;
import com.example.projetoprogramacaoweb2.model.mapper.EditoraMapper;
import com.example.projetoprogramacaoweb2.repository.EditoraRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepository;
    @Autowired
    private EditoraMapper editoraMapper;

    public List<EditoraDTO> listarTodos() {
        List<EditoraEntity> listaEntities = editoraRepository.findAll();
        return editoraMapper.updateListDTO(listaEntities);
    }

    public EditoraDTO pegarEditoraById(Long id) {

        Optional<EditoraEntity> editoraEntityOp = editoraRepository.findById(id);

        if (editoraEntityOp.isPresent()) {
            EditoraEntity editoraEntity = editoraEntityOp.get();
            return editoraMapper.update(editoraEntity);
        }
        throw new EntityNotFoundException("Editora não encontrada");
    }

    public EditoraDTO criar(EditoraDTO editoraDTO) {

        //Vem a informação do usuário, converto em Entity
        EditoraEntity editora = editoraMapper.update(editoraDTO);

        //Salvo a categoria em entity na base de dados
        editora = editoraRepository.save(editora);

        //Converto novamente para DTO e retorno para o usuário
        return editoraMapper.update(editora);
    }

    public EditoraDTO editar(EditoraDTO editoraDTO, Long id) {

        if(editoraRepository.existsById(id)){
            EditoraEntity editoraEntity = editoraMapper.update(editoraDTO);
            editoraEntity.setId(id);
            editoraEntity = editoraRepository.save(editoraEntity);

            return editoraMapper.update(editoraEntity);
        }
        throw new EntityNotFoundException("Editora não encontrada");
    }

    public void deletar(Long id) {
        Optional<EditoraEntity> editoraEntityOp = editoraRepository.findById(id);

        if (editoraEntityOp.isPresent()) {
            EditoraEntity editoraEntity = editoraEntityOp.get();
            editoraRepository.delete(editoraEntity);
            return;
        }
        throw new EntityNotFoundException("Editora não encontrada!");
    }


}
