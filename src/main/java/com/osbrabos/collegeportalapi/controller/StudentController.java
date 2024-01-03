package com.osbrabos.collegeportalapi.controller;

import com.osbrabos.collegeportalapi.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osbrabos.collegeportalapi.services.StudentService;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll(){
        List<Student> list = studentService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
