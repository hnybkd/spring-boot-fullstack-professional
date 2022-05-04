package com.example.demo.student;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @CrossOrigin
    @GetMapping
    public List<Student> getAllStudents () {
        List<Student> students = Arrays.asList(
                new Student(1L, "Jameson", "jameson@example.com", Gender.FEMALE),
                new Student(2L, "Logan", "logan@example.com", Gender.MALE)
        );
        return students;
    }
}
