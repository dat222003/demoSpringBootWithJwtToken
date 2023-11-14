package com.example.demospringsecurity.service;

import java.util.List;

public interface MyService<T, Idt extends Long> {

    T findById(Idt id);

    T save(T entity);

    void deleteById(Idt id);

    List<T> findAll();

    T update(T entity);
}
