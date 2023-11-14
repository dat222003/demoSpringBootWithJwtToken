package com.example.demospringsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;

    private String name;

    private String password;

    public UserDto(String name, String password) {
        this.name = name;
        this.password = password;
        this.id = null;
    }
}
