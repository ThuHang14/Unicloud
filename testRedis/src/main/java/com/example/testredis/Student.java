package com.example.testredis;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;

@Data
@RedisHash(value = "student")
public class Student {
    @Id
    @Indexed
    private String id;
    private String name;
    private String grade;
}
