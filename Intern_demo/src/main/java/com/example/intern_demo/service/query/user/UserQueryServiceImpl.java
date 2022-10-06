package com.example.intern_demo.service.query.user;

import com.example.intern_demo.entities.user.User;
import com.example.intern_demo.repository.query.user.UserQueryRepository;
import com.example.intern_demo.util.StringUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserQueryServiceImpl implements UserQueryService {

    private final UserQueryRepository userQueryRepository;

    @Override
    public User getUserById(String id) {
        if (!StringUtil.isText(id)) {
            // throw user not found exception
            return null;
        }
        Optional<User> userOptional = userQueryRepository.findById(id);

        if (!userOptional.isPresent()) {
            // throw user not found exception
        }

        return userOptional.get();
    }
}
