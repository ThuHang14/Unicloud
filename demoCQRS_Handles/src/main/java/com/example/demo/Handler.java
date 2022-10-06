package com.example.demo;

public interface Handler<T extends RequestData, I extends ResponseData> {

    I handle(T request);
}
