package com.example.inventoryservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RefreshScope  //lam moi scope
public class HomeController {

//    @Value("${test.name}") //test name da cau hinh trong product.properties
//    private String name;

@GetMapping
    public String home(){
    return "homecontroller";
}
}
