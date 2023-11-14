package com.example.demospringsecurity.service;


import com.example.demospringsecurity.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface ProductService extends MyService<ProductDto, Long> {
    Page<ProductDto> getPage(int pageNumber, int pageSize);
}
