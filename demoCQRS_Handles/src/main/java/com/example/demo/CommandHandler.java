package com.example.demo;

import org.springframework.stereotype.Component;

//Thao tác ghi dữ liệu
@Component
public abstract class CommandHandler <T extends RequestData, I extends ResponseData> implements Handler<T, I>{

}
