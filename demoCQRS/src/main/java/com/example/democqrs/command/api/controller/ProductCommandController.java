package com.example.democqrs.command.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductCommandController {
    @PostMapping
    public String addProduct(){
        return "add new product";
    }
}
