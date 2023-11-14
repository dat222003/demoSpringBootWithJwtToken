package com.example.demospringsecurity.service.impl;

import com.example.demospringsecurity.dto.CategoryDto;
import com.example.demospringsecurity.mapper.Mapper;
import com.example.demospringsecurity.repository.CategoryRepository;
import com.example.demospringsecurity.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final Mapper mapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, Mapper mapper) {
        this.categoryRepository = categoryRepository;
        this.mapper = mapper;
    }

    @Override
    public CategoryDto findById(Long id) {
        return mapper.convertCategoryToDto(categoryRepository.findById(id).orElse(null));
    }

    @Override
    public CategoryDto save(CategoryDto entity) {
        return mapper.convertCategoryToDto(categoryRepository.save(mapper.convertDtoToCategory(entity)));
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<CategoryDto> findAll() {
        return categoryRepository.findAll().stream().map(mapper::convertCategoryToDto).toList();
    }

    @Override
    public CategoryDto update(CategoryDto entity) {
        return mapper.convertCategoryToDto(categoryRepository.save(mapper.convertDtoToCategory(entity)));
    }
}
