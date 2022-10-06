package com.example.intern_demo.repository.query.user;

import com.example.intern_demo.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQueryRepository extends JpaRepository<User, String> {
}
