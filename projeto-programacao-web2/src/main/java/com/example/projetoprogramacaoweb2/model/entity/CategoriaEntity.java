package com.example.projetoprogramacaoweb2.model.entity;

import com.example.projetoprogramacaoweb2.model.dto.CategoriaDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name="categoria")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome", nullable=false,length = 100)
    private String nome;
    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY)
    private List<LivroEntity> livros;



}
