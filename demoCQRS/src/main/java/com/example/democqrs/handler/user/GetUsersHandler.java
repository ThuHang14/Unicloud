package com.example.democqrs.handler.user;

import com.example.democqrs.dto.request.user.GetUsersRequest;
import com.example.democqrs.dto.response.user.GetUsersResponse;
import com.example.democqrs.handler.base.Handler;
import com.example.democqrs.service.user.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class GetUsersHandler implements Handler<GetUsersRequest, GetUsersResponse> {


    @Autowired
    private UserService userService;

    @Override
    public GetUsersResponse handle(GetUsersRequest requestData) {
        return null;
    }

    public void getInfo(){
        System.out.println("hi");
    }
}
