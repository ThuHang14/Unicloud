package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class OrderHandler implements Handler<OrderRequest, OrderResponse>{
    @Override
    public OrderResponse handle(OrderRequest request) {
        return null;
    }

    @Override
    public String toString() {
        return "Order Handler";
    }
}
