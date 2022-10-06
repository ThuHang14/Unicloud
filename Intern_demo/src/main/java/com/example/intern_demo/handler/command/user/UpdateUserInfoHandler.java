package com.example.intern_demo.handler.command.user;

import com.example.intern_demo.entities.user.User;
import com.example.intern_demo.service.command.user.UserCommandService;
import com.example.intern_demo.service.query.user.UserQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UpdateUserInfoHandler {

    private final UserQueryService userQueryService;
    private final UserCommandService userCommandService;

    public void handler() {
        String userId = "userId";
        User user = userQueryService.getUserById(userId);

        User updatedUser = new User();
        userCommandService.insert(updatedUser);


    }

}
