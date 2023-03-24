package com.example.projetoprogramacaoweb2.repository;

import com.example.projetoprogramacaoweb2.model.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    @Query("SELECT l FROM LivroEntity l WHERE UPPER(l.nome) LIKE CONCAT('%',:nome,'%') OR UPPER(l.isbn) LIKE CONCACT('%',:isbn, '%')")
    List<LivroEntity> findByNomeOrIsbn(@Param("nome") String nome, @Param("isbn")String isbn);

}
