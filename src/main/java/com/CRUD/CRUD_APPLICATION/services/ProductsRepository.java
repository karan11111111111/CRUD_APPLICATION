package com.CRUD.CRUD_APPLICATION.services;

import com.CRUD.CRUD_APPLICATION.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
