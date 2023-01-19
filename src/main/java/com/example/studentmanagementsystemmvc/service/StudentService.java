package com.example.studentmanagementsystemmvc.service;

import com.example.studentmanagementsystemmvc.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
