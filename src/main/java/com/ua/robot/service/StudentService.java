package com.ua.robot.service;

import com.ua.robot.domain.Student;
import com.ua.robot.repository.StudentMysqlRepository;
import com.ua.robot.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> findAll() {
        StudentRepository studentRepository = new StudentMysqlRepository();

        return studentRepository.findAll();
    }
}
