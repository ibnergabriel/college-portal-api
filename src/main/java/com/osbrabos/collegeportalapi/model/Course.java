package com.osbrabos.collegeportalapi.model;

import com.osbrabos.collegeportalapi.model.enums.Department;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    private Department department;

    private Professor professor;

    private List<Student> students;

}
