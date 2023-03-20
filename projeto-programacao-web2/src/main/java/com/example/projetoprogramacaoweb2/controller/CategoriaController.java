package com.example.projetoprogramacaoweb2.controller;

import com.example.projetoprogramacaoweb2.model.CategoriaDTO;
import com.example.projetoprogramacaoweb2.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaDTO> listarTodos(){
        return categoriaService.getCategoriasDTO();
    }

    @GetMapping("/{id}")
    public CategoriaDTO pegarUm(@PathVariable("id") Long id){
        return categoriaService.pegarCategoriaById(id);
    }

    @PostMapping
    public CategoriaDTO criar(@RequestBody CategoriaDTO categoriaDTO){
        return categoriaService.criar(categoriaDTO);
    }

    @PutMapping("/{id}")
    public CategoriaDTO editar(
            @RequestBody CategoriaDTO categoriaDTO,
            @PathVariable("id") Integer id){

        return categoriaService.editar(categoriaDTO, id);
    }

    @DeleteMapping("/{id}")
    public String deletar(
            @PathVariable("id") Long id){
        categoriaService.deletar(id);
        return "Categoria com id [" + id + "] removida com sucesso!";
    }





}
