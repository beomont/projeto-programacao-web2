package com.example.projetoprogramacaoweb2.repository;

import com.example.projetoprogramacaoweb2.model.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

}
