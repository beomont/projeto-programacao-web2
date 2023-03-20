package com.example.projetoprogramacaoweb2.model;

import com.example.projetoprogramacaoweb2.model.entity.EditoraEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditoraDTO {
    private Long id;
    private String nome;
    private String descricao;

    public EditoraDTO update(EditoraEntity editoraEntity) {
        this.id = editoraEntity.getId();
        this.nome = editoraEntity.getNome();
        this.descricao = editoraEntity.getDescricao();
        return this;

    }


}
