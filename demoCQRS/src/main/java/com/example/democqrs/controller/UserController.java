package com.example.democqrs.controller;

import com.example.democqrs.controller.base.BaseController;
import com.example.democqrs.controller.base.BaseResponse;
import com.example.democqrs.dto.request.user.GetUserDetailRequest;
import com.example.democqrs.dto.request.user.GetUsersRequest;
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
// ResponseEntity tra ve loi , loi tu custom ?

    @GetMapping("")
    ResponseEntity<BaseResponse> getUsers() {
        GetUsersRequest request = new GetUsersRequest();
        return execute(request);
    }

}
