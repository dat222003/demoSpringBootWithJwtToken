package com.example.demospringsecurity.repository;


import com.example.demospringsecurity.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
