package com.example.democqrs.handler.product;

import com.example.democqrs.dto.request.product.ProductQueryRequest;
import com.example.democqrs.dto.response.product.ProductQueryResponse;
import com.example.democqrs.entity.Product;
import com.example.democqrs.handler.base.Handler;
import com.example.democqrs.repository.product.ProductQueryRepository;
import com.example.democqrs.service.product.ProductQueryService;
import com.example.democqrs.service.product.ProductQueryServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ProductQueryHandler implements Handler<ProductQueryRequest, ProductQueryResponse> {

    private final ProductQueryService productQueryService;

    @Override
    public ProductQueryResponse handle(ProductQueryRequest requestData) {
        List<Product> products = productQueryService.findByOrderByNameDesc();
        return new ProductQueryResponse(products);
    }

}
