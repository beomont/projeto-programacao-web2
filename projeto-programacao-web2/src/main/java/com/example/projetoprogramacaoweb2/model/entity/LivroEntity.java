package com.example.projetoprogramacaoweb2.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="livro")
public class LivroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="editora", nullable = false)
    private EditoraEntity editora;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="categoria", nullable = false)
    private CategoriaEntity categoria;
    @Column(name="nome", nullable=false)
    private String nome;
    @Column(name="isbn", nullable=false, unique=true, length=13)
    private String isbn;



}
