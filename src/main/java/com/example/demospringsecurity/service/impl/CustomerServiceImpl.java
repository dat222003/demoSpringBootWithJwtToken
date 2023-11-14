package com.example.demospringsecurity.service.impl;

import com.example.demospringsecurity.dto.CustomerDto;
import com.example.demospringsecurity.dto.UserDto;
import com.example.demospringsecurity.mapper.Mapper;
import com.example.demospringsecurity.repository.CustomerRepository;
import com.example.demospringsecurity.service.CustomerService;
import com.example.demospringsecurity.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    private final UserService userService;

    private final Mapper mapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, UserService userService, Mapper mapper) {
        this.customerRepository = customerRepository;
        this.userService = userService;
        this.mapper = mapper;
    }

    @Override
    public CustomerDto findById(Long id) {
        return mapper.convertCustomerToDto(customerRepository.findById(id).orElse(null));
    }

    @Override
    public CustomerDto save(CustomerDto entity) {
        UserDto userDto = userService.save(entity.getUserDto());
        entity.setUserDto(userDto);
        return mapper.convertCustomerToDto(customerRepository.save(mapper.convertDtoToCustomer(entity)));
    }

    @Override
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerDto> findAll() {
        return customerRepository.findAll().stream().map(mapper::convertCustomerToDto).toList();
    }

    @Override
    public CustomerDto update(CustomerDto entity) {
        return mapper.convertCustomerToDto(customerRepository.save(mapper.convertDtoToCustomer(entity)));
    }
}
