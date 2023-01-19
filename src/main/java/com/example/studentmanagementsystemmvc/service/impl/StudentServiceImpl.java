package com.example.studentmanagementsystemmvc.service.impl;

import com.example.studentmanagementsystemmvc.entity.Student;
import com.example.studentmanagementsystemmvc.repository.StudentRepository;
import com.example.studentmanagementsystemmvc.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
