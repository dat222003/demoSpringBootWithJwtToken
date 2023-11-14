package com.example.demospringsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
    private String username;
    private String password;

    private String firstName;

    private String lastName;

    private String email;
    private String avatar;
    private String phone;
    private Boolean gender;
    private Timestamp dateOfBirth;

    public CustomerDto toCustomerDto() {
        return new CustomerDto(firstName, lastName, email, avatar, phone, gender, new UserDto(username, password), dateOfBirth);
    }

}
