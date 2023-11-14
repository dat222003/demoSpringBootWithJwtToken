package com.example.demospringsecurity.service.impl;


import com.example.demospringsecurity.dto.ProductDto;
import com.example.demospringsecurity.mapper.Mapper;
import com.example.demospringsecurity.repository.ProductRepository;
import com.example.demospringsecurity.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final Mapper mapper;

    public ProductServiceImpl(ProductRepository productRepository, Mapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    @Override
    public ProductDto findById(Long id) {
        return mapper.convertProductToDto(productRepository.findById(id).orElse(null));
    }

    @Override
    public ProductDto save(ProductDto entity) {
        return mapper.convertProductToDto(productRepository.save(mapper.convertDtoToProduct(entity)));
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductDto> findAll() {
        return productRepository.findAll().stream().map(mapper::convertProductToDto).toList();
    }

    @Override
    public ProductDto update(ProductDto entity) {
        if (productRepository.findById(entity.getId()).isEmpty())
            return null;
        return mapper.convertProductToDto(productRepository.save(mapper.convertDtoToProduct(entity)));
    }

    @Override
    public Page<ProductDto> getPage(int pageNumber, int pageSize) {
        return productRepository.findAll(
                        Pageable.ofSize(pageSize).withPage(pageNumber - 1)
                )
                .map(mapper::convertProductToDto);
    }
}
