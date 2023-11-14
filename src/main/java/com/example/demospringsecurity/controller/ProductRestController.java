package com.example.demospringsecurity.controller;

import com.example.demospringsecurity.dto.ProductDto;
import com.example.demospringsecurity.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductRestController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDto>> home() {
        return ResponseEntity.ok().body(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok().body(productService.findById(id));
    }

    @GetMapping("/{pageNumber}/{pageSize}")
    public ResponseEntity<Page<ProductDto>> getProductPage(@PathVariable Integer pageNumber, @PathVariable Integer pageSize) {
        return ResponseEntity.ok().body(productService.getPage(pageNumber, pageSize));
    }

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        return ResponseEntity.ok().body(productService.save(productDto));
    }

    @PutMapping
    public ResponseEntity<ProductDto> updateProduct(@RequestBody ProductDto productDto) {
        return ResponseEntity.ok().body(productService.update(productDto));
    }
}
