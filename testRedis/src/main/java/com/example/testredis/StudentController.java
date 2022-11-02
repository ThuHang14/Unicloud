package com.example.testredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student save = studentRepository.save(student);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable String id,@RequestBody Student student){
        Optional<Student> std = studentRepository.findById(id);
        if(std.isPresent()){
            Student stDB = std.get();
            stDB.setGrade(student.getGrade());
            stDB.setName(student.getName());
            Student update = studentRepository.save(stDB);
            return new ResponseEntity<>(update, HttpStatus.CREATED);
        }
        return null;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable(name = "id") String id) {
        studentRepository.deleteById(id);
        return new ResponseEntity<>("Student with id:" + id + " deleted successfully", HttpStatus.OK);
    }
}
