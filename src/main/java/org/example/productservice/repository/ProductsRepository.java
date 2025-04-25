package org.example.productservice.repository;

import org.example.productservice.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long> {

}
