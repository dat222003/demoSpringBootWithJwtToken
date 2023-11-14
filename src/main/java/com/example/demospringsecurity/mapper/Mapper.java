package com.example.demospringsecurity.mapper;


import com.example.demospringsecurity.dto.*;
import com.example.demospringsecurity.entity.Category;
import com.example.demospringsecurity.entity.Customer;
import com.example.demospringsecurity.entity.Product;
import com.example.demospringsecurity.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    private final ModelMapper modelMapper;

    public Mapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Category convertDtoToCategory(CategoryDto categoryDto) {
        return modelMapper.map(categoryDto, Category.class);
    }

    public CategoryDto convertCategoryToDto(Category category) {
        return modelMapper.map(category, CategoryDto.class);
    }

    public Product convertDtoToProduct(ProductDto productDto) {
        return modelMapper.map(productDto, Product.class);
    }

    public ProductDto convertProductToDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }

    public Customer convertDtoToCustomer(CustomerDto customerDto) {
        return modelMapper.map(customerDto, Customer.class);
    }

    public CustomerDto convertCustomerToDto(Customer customer) {
        return modelMapper.map(customer, CustomerDto.class);
    }

    public UserDto convertUserToDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    public User convertDtoToUser(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }

    public User convertRegisterToUser(RegisterDto registerDto) {
        return modelMapper.map(registerDto, User.class);
    }

    public Customer convertRegisterToCustomer(RegisterDto registerDto) {
        return modelMapper.map(registerDto, Customer.class);
    }
}

