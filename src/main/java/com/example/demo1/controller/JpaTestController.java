package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.Customer;
import com.example.demo1.repository.CustomerRepository;

@RestController

public class JpaTestController {
    
    @Autowired
    CustomerRepository repository;

    @GetMapping("/init")
    void init() {
        repository.save(new Customer("Jack", "Bauer"));
        repository.save(new Customer("Chloe", "O'Brian"));
        repository.save(new Customer("Kim", "Bauer"));
        repository.save(new Customer("David", "Palmer"));
        repository.save(new Customer("Michelle", "Dessler")); 
        
    }

    @GetMapping("/all")
    List<Customer> all() {
        return  repository.findAll();
        
    }
}
