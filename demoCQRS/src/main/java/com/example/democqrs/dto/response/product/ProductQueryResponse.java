package com.example.democqrs.dto.response.product;

import com.example.democqrs.dto.response.base.ResponseData;
import com.example.democqrs.entity.Product;
import com.example.democqrs.repository.product.ProductQueryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

public class ProductQueryResponse extends ResponseData {

    private List<Product> products;

    public ProductQueryResponse() {

    }

    public ProductQueryResponse(List<Product> products) {
        this.products = products;
    }
}
