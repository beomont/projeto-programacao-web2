package com.example.projetoprogramacaoweb2.model.entity;

import com.example.projetoprogramacaoweb2.model.dto.EditoraDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="editora")
public class EditoraEntity {
        @Id
        private Long id;
        @Column(name="nome", nullable = false)
        private String nome;
        private String descricao;


}
