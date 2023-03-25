package com.example.projetoprogramacaoweb2.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoriaDTO {
    private Long id;
    @NotBlank
    @Size(max = 100, message = "Tamanho acima do permitido (Máx. 100)")
    private String nome;


}
