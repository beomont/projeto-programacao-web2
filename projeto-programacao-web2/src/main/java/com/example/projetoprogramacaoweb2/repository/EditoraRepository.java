package com.example.projetoprogramacaoweb2.repository;

import com.example.projetoprogramacaoweb2.model.entity.EditoraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoraRepository extends JpaRepository<EditoraEntity, Long> {

}
