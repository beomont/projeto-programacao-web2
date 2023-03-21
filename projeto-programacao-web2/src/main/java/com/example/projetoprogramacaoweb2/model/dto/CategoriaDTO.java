package com.example.projetoprogramacaoweb2.model.dto;

import com.example.projetoprogramacaoweb2.model.entity.CategoriaEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Data
public class CategoriaDTO {
    private Long id;
    @Size(max = 100, message="Tamano acima do permitido (Max. 100)")
    @NotBlank(message ="Nome deve conter algum valor")
    private String nome;


}
