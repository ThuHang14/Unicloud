package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class CheckoutHandler implements Handler<CheckRequest, CheckResponse> {
    @Override
    public CheckResponse handle(CheckRequest request) {
        return null;
    }

    @Override
    public String toString() {
        return "Checkout Handler";
    }
}
