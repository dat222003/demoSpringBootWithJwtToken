package com.example.demospringsecurity.dto;

import com.example.demospringsecurity.entity.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private Long id;

    private String name;

    private String description;

    @JsonIgnoreProperties("category")
    private List<Product> products;
}
