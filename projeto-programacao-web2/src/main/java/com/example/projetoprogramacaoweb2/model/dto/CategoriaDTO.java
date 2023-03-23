package com.example.projetoprogramacaoweb2.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoriaDTO {
    private Long id;
    @Size(max = 100, message="Tamanho acima do permitido (Max. 100)")
    @NotBlank(message ="Nome deve conter algum valor")
    private String nome;


}
