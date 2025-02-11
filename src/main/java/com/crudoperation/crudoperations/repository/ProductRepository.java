package com.crudoperation.crudoperations.repository;

import com.crudoperation.crudoperations.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
