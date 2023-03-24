package com.example.projetoprogramacaoweb2.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroDTO {
    private Long id;
    private String nome;
    private String isbn;
    private CategoriaDTO categoria;
    private EditoraDTO editora;






}
