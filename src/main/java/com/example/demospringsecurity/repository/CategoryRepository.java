package com.example.demospringsecurity.repository;


import com.example.demospringsecurity.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
