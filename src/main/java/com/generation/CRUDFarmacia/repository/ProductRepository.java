package com.generation.CRUDFarmacia.repository;

import com.generation.CRUDFarmacia.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByPriceBetweenAndNameContainingAndCategoryNameContainingAllIgnoreCase(BigDecimal minPrice, BigDecimal maxPrice, @Param("name") String name, @Param("categoryName") String categoryName);

	List<Product> findAllByNameContainingIgnoreCase(@Param("name") String name);

}
