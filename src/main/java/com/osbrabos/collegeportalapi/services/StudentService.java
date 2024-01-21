package com.osbrabos.collegeportalapi.services;

import com.osbrabos.collegeportalapi.model.Student;
import com.osbrabos.collegeportalapi.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student createStudent(Student data){
        Student student = new Student();
        return studentRepository.save(student);
    }
}
