package com.generation.CRUDFarmacia.repository;

import com.generation.CRUDFarmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findAllByNameContainingIgnoreCase(@Param("name") String nome);

    List<Categoria> findAllByDescriptionContainingIgnoreCase(@Param("description") String descricao);

    List<Categoria> findAllByNameContainingAndDescriptionContainingIgnoreCase(@Param("name") String nome, @Param("description") String descricao);
}
