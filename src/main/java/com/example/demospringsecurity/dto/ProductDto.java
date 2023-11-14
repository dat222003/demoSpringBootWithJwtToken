package com.example.demospringsecurity.dto;

import com.example.demospringsecurity.entity.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private Long id;

    private String name;

    private Double price;

    private Double weight;

    private String image;

    private Integer stock;

    @JsonIgnoreProperties("products")
    private Category category;
}
