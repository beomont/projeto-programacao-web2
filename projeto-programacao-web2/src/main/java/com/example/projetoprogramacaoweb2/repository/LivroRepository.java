package com.example.projetoprogramacaoweb2.repository;

import com.example.projetoprogramacaoweb2.model.entity.CategoriaEntity;
import com.example.projetoprogramacaoweb2.model.entity.EditoraEntity;
import com.example.projetoprogramacaoweb2.model.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    @Query("SELECT l FROM LivroEntity l WHERE UPPER(l.nome) = :nome OR UPPER(l.isbn) = :isbn ")
    List<LivroEntity> findByNomeOrIsbn(@Param("nome") String nome, @Param("isbn")String isbn);

    List<LivroEntity> findByCategoria(CategoriaEntity categoria);

    List<LivroEntity> findByEditora(EditoraEntity editora);




}
