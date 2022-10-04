package com.example.democqrs.base;

import com.example.democqrs.dto.request.RequestData;
import com.example.democqrs.dto.response.ResponseData;
import com.example.democqrs.handle.Handler;
import com.example.democqrs.handle.HandlerFactory;
import org.springframework.http.ResponseEntity;

public class BaseController {
    protected ResponseEntity<BaseResponse> execute(RequestData request) {
        Handler handler = HandlerFactory.getHandler(request);
        ResponseData result =  handler.handle(request);
        BaseResponse response = new BaseResponse();
        response.setResponseData(result);
        return ResponseEntity.ok(response);
    }
}
