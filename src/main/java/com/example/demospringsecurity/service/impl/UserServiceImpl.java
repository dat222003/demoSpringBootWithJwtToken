package com.example.demospringsecurity.service.impl;


import com.example.demospringsecurity.dto.UserDto;
import com.example.demospringsecurity.entity.User;
import com.example.demospringsecurity.mapper.Mapper;
import com.example.demospringsecurity.repository.UserRepository;
import com.example.demospringsecurity.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final Mapper mapper;

    public UserServiceImpl(UserRepository userRepository, Mapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public UserDto findById(Long id) {
        return mapper.convertUserToDto(userRepository.findById(id).orElse(null));
    }

    @Override
    public UserDto save(UserDto entity) {
        return mapper.convertUserToDto(userRepository.save(mapper.convertDtoToUser(entity)));
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream().map(mapper::convertUserToDto).toList();
    }

    @Override
    public UserDto update(UserDto entity) {
        return mapper.convertUserToDto(userRepository.save(mapper.convertDtoToUser(entity)));
    }


    @Override
    public Optional<User> findByName(String name) {
        return userRepository.findByName(name);
    }
}
