package com.example.projetoprogramacaoweb2.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="editora")
public class EditoraEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        @Column(name="nome", nullable = false)
        private String nome;
        private String descricao;


}
