package com.osbrabos.collegeportalapi.model.entities;

import com.osbrabos.collegeportalapi.model.enums.Graduation;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Student extends Person{

    @Column(unique = true, nullable = false)
    private String enrollment;

    private String email;

    @Enumerated(EnumType.STRING)
    private Graduation graduation;
}
