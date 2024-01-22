package com.osbrabos.collegeportalapi.controller;

import com.osbrabos.collegeportalapi.dto.StudentDTO;
import com.osbrabos.collegeportalapi.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.osbrabos.collegeportalapi.services.StudentService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll(){
        List<Student> list = studentService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody StudentDTO studentData){
        Student newStudent = this.studentService.create(studentData);
        return ResponseEntity.ok().body(newStudent);
    }
}
