package com.ua.robot.repository;

import com.ua.robot.domain.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();

}
