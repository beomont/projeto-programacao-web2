package com.example.projetoprogramacaoweb2.controller;

import com.example.projetoprogramacaoweb2.model.dto.EditoraDTO;
import com.example.projetoprogramacaoweb2.model.dto.MenssagemDTO;
import com.example.projetoprogramacaoweb2.service.EditoraService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/editoras")
@Slf4j
public class EditoraController {

    @Autowired
    EditoraService editoraService;

    @GetMapping
    public ResponseEntity<Object> listarTodos() {
        try {
//            throw new Exception("Erro teste");
            return ResponseEntity.ok(editoraService.listarTodos());
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new MenssagemDTO(ex.getMessage()));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> pegarUm(@PathVariable("id") Long id) {

        try {
            return ResponseEntity.ok(editoraService.pegarEditoraById(id));
        } catch (EntityNotFoundException ex) {
            log.error(ex.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .body(new MenssagemDTO(ex.getMessage()));
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new MenssagemDTO(ex.getMessage()));
        }

    }

    @PostMapping
    public ResponseEntity<Object> criar(@RequestBody @Valid EditoraDTO editoraDTO) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(editoraService.criar(editoraDTO));
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new MenssagemDTO(ex.getMessage()));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> editar(
            @RequestBody @Valid EditoraDTO editoraDTO,
            @PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(editoraService.editar(editoraDTO, id));
        } catch (EntityNotFoundException ex) {
            log.error(ex.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new MenssagemDTO(ex.getMessage()));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletar(
            @PathVariable("id") Long id) {
        try {
            editoraService.deletar(id);
            return ResponseEntity.ok(new MenssagemDTO("Categoria com id [" + id + "] removida com sucesso! "));
        } catch (EntityNotFoundException ex) {
            log.error(ex.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new MenssagemDTO(ex.getMessage()));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new MenssagemDTO(ex.getMessage()));
        }
    }

}
