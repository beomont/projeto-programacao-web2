package com.example.projetoprogramacaoweb2.service;

import com.example.projetoprogramacaoweb2.model.CategoriaDTO;
import com.example.projetoprogramacaoweb2.model.entity.CategoriaEntity;
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


    public CategoriaDTO pegarCategoriaById(Long id) {


        Optional<CategoriaEntity> categoriaEntityOp = categoriaRepository.findById(id);

        if (categoriaEntityOp.isPresent()) {
            CategoriaEntity categoriaEntity = categoriaEntityOp.get();
            return new CategoriaDTO().update(categoriaEntity);
        }
        throw new EntityNotFoundException();
    }

    public CategoriaDTO criar(CategoriaDTO categoriaDTO) {

        //Vem a informação do usuário, converto em Entity
        CategoriaEntity categoria = new CategoriaEntity().updateCreate(categoriaDTO);

        //Salvo a categoria em entity na base de dados
        categoria = categoriaRepository.save(categoria);

        //Converto novamente para DTO e retorno para o usuário
        return new CategoriaDTO().update(categoria);

    }

    public CategoriaDTO editar(CategoriaDTO categoriaDTO, Integer id) {
        //recupero a categoria da base
//        categoriaRepository.findById(id);

        //update dos campos


        //salva no banco novamente
        return null;
    }

    public void deletar(Long id) {

    }

    public List<CategoriaDTO> getCategoriasDTO() {
        List<CategoriaEntity> listaEntities = categoriaRepository.findAll();
        return listaEntities.stream()
                .map(categoriaEntity -> new CategoriaDTO().update(categoriaEntity))
                .toList();
    }


}
