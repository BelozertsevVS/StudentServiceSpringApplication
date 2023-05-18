package com.ua.robot.rest;

import com.ua.robot.domain.Student;
import com.ua.robot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor

public class StudentController {

    private final StudentService studentService;

    @GetMapping("/stud")
    public List<Student> findAll() {
        return studentService.findAll();
    }
}
