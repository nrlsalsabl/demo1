package com.example.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.Product;
import com.example.demo1.repository.ProductRepository;

@RestController

public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping("/ search/{name}")
    void search() {
        repository.save(new Product());
        repository.save(new Product());
    }
    
}