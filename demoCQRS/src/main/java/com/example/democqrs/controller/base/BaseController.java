package com.example.democqrs.controller.base;

import com.example.democqrs.dto.request.base.RequestData;
import com.example.democqrs.dto.response.base.ResponseData;
import com.example.democqrs.handler.base.Handler;
import com.example.democqrs.handler.base.HandlerFactory;
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
