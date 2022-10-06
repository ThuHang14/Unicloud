package com.example.democqrs.controller;

import com.example.democqrs.dto.request.product.ProductQueryRequest;
import com.example.democqrs.dto.response.product.ProductQueryResponse;
import com.example.democqrs.handler.base.Handler;
import com.example.democqrs.handler.base.HandlerFactory;
import com.example.democqrs.handler.product.ProductQueryHandler;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/user")
public class ProductController {

    private final HandlerFactory handlerFactory;

    @GetMapping
    public ResponseEntity<?> getAllProducts() {

        // query lay thong tin users
        //query lay thong tin sna pham

        ProductQueryRequest request = new ProductQueryRequest();
        Handler handler = handlerFactory.getHandler(request);
        ProductQueryResponse response = (ProductQueryResponse) handler.handle(request);
        return ResponseEntity.ok(response);
    }

    ;

}
