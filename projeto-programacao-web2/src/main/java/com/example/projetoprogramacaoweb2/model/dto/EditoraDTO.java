package com.example.projetoprogramacaoweb2.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EditoraDTO {
    private Long id;
    @NotBlank
    @Size(max = 255, message = "Tamanho acima do permitido (Máx. 255)")
    private String nome;
    private String descricao;



}
