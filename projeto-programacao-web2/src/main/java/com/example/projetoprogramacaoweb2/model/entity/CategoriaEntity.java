package com.example.projetoprogramacaoweb2.model.entity;

import com.example.projetoprogramacaoweb2.model.CategoriaDTO;
import com.example.projetoprogramacaoweb2.model.EditoraDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="categoria")
public class CategoriaEntity {
    @Id
    private Long id;
    @Column(name="nome", nullable=false,length = 100)
    private String nome;


    public CategoriaEntity updateCreate(CategoriaDTO categoriaDTO) {
        this.nome = categoriaDTO.getNome();
        return this;
    }

    public CategoriaEntity update(CategoriaDTO categoriaDTO) {
        this.id = categoriaDTO.getId();
        this.nome = categoriaDTO.getNome();
        return this;
    }

}
