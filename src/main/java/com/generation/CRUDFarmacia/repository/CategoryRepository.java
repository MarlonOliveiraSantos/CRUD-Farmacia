package com.generation.CRUDFarmacia.repository;

import com.generation.CRUDFarmacia.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	List<Category> findAllByNameContainingIgnoreCase(@Param("name") String name);

	List<Category> findAllByDescriptionContainingIgnoreCase(@Param("description") String description);

	List<Category> findAllByNameContainingAndDescriptionContainingIgnoreCase(@Param("name") String name, @Param("description") String description);
}
