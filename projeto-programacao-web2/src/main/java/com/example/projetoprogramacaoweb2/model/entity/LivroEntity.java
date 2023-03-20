package com.example.projetoprogramacaoweb2.model.entity;

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
@Table(name="livro")
public class LivroEntity {
    @Id
    private Long id;

    @Column(name="nome", nullable=false)
    private String nome;

    @Column(name="isbn", nullable=false, unique=true, length=13)
    private String isbn;


}
