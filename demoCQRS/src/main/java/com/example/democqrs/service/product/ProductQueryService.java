package com.example.democqrs.service.product;

import com.example.democqrs.entity.Product;

import java.util.List;

public interface ProductQueryService {
    List<Product> findByOrderByNameDesc();
}
