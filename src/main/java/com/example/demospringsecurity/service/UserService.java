package com.example.demospringsecurity.service;


import com.example.demospringsecurity.dto.UserDto;
import com.example.demospringsecurity.entity.User;

import java.util.Optional;

public interface UserService extends MyService<UserDto, Long> {
    Optional<User> findByName(String name);
}
