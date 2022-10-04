package com.example.democqrs.handle.user;

import com.example.democqrs.dto.request.GetUserDetailRequest;
import com.example.democqrs.dto.response.GetUserDetailResponse;
import com.example.democqrs.handle.Handler;
import org.springframework.stereotype.Component;

@Component
public class GetUserIDetailHandler  implements Handler<GetUserDetailRequest, GetUserDetailResponse> {

    @Override
    public GetUserDetailResponse handle(GetUserDetailRequest requestData) {
        return null;
    }
}
