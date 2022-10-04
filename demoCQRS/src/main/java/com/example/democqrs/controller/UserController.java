package com.example.democqrs.controller;

import com.example.democqrs.base.BaseController;
import com.example.democqrs.base.BaseResponse;
import com.example.democqrs.dto.request.GetUserDetailRequest;
import com.example.democqrs.dto.request.GetUsersRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")
public class UserController extends BaseController {

    @GetMapping("/{id}")
    ResponseEntity<BaseResponse> getUserInfo(@PathVariable("id") String id) {
        GetUserDetailRequest request = new GetUserDetailRequest(id);
        return execute(request);
    }


    @GetMapping("")
    ResponseEntity<BaseResponse> getUsers() {
        GetUsersRequest request = new GetUsersRequest();
        return execute(request);
    }

}
