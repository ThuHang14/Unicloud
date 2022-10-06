package com.example.democqrs.handler.base;

import com.example.democqrs.dto.request.base.RequestData;
import com.example.democqrs.dto.response.base.ResponseData;

public interface Handler<T extends RequestData, I extends ResponseData> {

    I handle(T requestData);
}
