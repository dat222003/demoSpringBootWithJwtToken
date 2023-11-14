package com.example.demospringsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;
    private String avatar;
    private String phone;
    private Boolean gender;

    private UserDto userDto;

    private Timestamp dateOfBirth;

    public CustomerDto(String firstName, String lastName, String email, String avatar, String phone, Boolean gender, UserDto userDto, Timestamp dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.avatar = avatar;
        this.phone = phone;
        this.gender = gender;
        this.userDto = userDto;
        this.dateOfBirth = dateOfBirth;
    }
}
