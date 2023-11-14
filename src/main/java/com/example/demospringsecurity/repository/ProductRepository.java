package com.example.demospringsecurity.repository;


import com.example.demospringsecurity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
