package com.example.demospringsecurity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tbl_customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;
    private String avatar;
    private String phone;
    private Boolean gender;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "dob")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dateOfBirth;

}
