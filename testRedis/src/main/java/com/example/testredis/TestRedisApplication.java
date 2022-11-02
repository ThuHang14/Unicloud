package com.example.testredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class TestRedisApplication {


    public static void main(String[] args) {
        SpringApplication.run(TestRedisApplication.class, args);
    }

}
