package com.example.democqrs.handle;

import com.example.democqrs.dto.request.RequestData;
import com.example.democqrs.dto.response.ResponseData;

public interface Handler<T extends RequestData, I extends ResponseData> {

    I handle(T requestData);
}
