package com.example.projetoprogramacaoweb2.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="editora")
public class EditoraEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name="nome", nullable = false) //length default (255)
        private String nome;
        private String descricao;
        @OneToMany(mappedBy = "editora", fetch = FetchType.LAZY)
        private List<LivroEntity> livros;



}
