package com.example.intern_demo.service.command.user;

import com.example.intern_demo.entities.user.User;
import com.example.intern_demo.repository.command.user.UserCommandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserCommandServiceImpl implements UserCommandService {

    private final UserCommandRepository userCommandRepository;


    @Override
    public void insert(User user) {
        userCommandRepository.save(user);
    }
}
