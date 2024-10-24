package com.example.spring.boot.API.v1.repository;

import com.example.spring.boot.API.v1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository interface for Product entity.
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

