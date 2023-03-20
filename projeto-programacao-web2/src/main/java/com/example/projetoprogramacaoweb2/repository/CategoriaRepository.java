package com.example.projetoprogramacaoweb2.repository;

import com.example.projetoprogramacaoweb2.model.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity,Long> {

}
