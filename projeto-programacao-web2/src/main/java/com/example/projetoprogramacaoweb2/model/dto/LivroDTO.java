package com.example.projetoprogramacaoweb2.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class LivroDTO {
    private Long id;
    private String nome;
    private String isbn;
    private CategoriaDTO categoria;
    private EditoraDTO editora;






}
