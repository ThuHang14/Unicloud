package com.example.demo;

import org.springframework.stereotype.Component;

//Thao tác đọc dữ liệu
@Component
public abstract class QueryHandler <T extends RequestData, I extends ResponseData> implements Handler<T, I>{

}
