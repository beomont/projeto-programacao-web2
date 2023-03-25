package com.example.projetoprogramacaoweb2.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

@Data
public class LivroDTO {
    private Long id;
    @NotBlank(message ="Nome deve conter algum valor")
    private String nome;
    @Size(max = 13, message = "Tamanho acima do permitido (Max. 13)")
    @NotBlank(message ="ISBN deve conter algum valor")
    private String isbn;
    private CategoriaDTO categoria;
    private EditoraDTO editora;






}
