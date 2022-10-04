package com.example.democqrs.handle.user;

import com.example.democqrs.dto.request.GetUsersRequest;
import com.example.democqrs.dto.response.GetUsersResponse;
import com.example.democqrs.handle.Handler;
import com.example.democqrs.service.UserService;
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
