package com.example.democqrs.handler.user;

import com.example.democqrs.dto.request.user.GetUserDetailRequest;
import com.example.democqrs.dto.response.user.GetUserDetailResponse;
import com.example.democqrs.handler.base.Handler;
import org.springframework.stereotype.Component;

@Component
public class GetUserIDetailHandler  implements Handler<GetUserDetailRequest, GetUserDetailResponse> {

    @Override
    public GetUserDetailResponse handle(GetUserDetailRequest requestData) {
        return null;
    }
}
