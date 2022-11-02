package com.example.testredis;

import org.springframework.data.repository.CrudRepository;
public interface StudentRepository extends CrudRepository<Student, String> {
}
