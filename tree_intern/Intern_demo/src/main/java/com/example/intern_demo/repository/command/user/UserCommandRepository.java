package com.example.intern_demo.repository.command.user;

import com.example.intern_demo.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCommandRepository extends JpaRepository<User, String> {
}
