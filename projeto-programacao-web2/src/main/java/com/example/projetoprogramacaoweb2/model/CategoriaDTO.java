package com.example.projetoprogramacaoweb2.model;

import com.example.projetoprogramacaoweb2.model.entity.CategoriaEntity;
import com.example.projetoprogramacaoweb2.model.entity.EditoraEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoriaDTO {
    private Long id;
    private String nome;

    public CategoriaDTO update(CategoriaEntity categoriaEntity) {
        this.id = categoriaEntity.getId();
        this.nome = categoriaEntity.getNome();
        return this;
    }

}
