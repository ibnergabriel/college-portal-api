package com.osbrabos.collegeportalapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Professor{
    @Id
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    @Column(name = "professor_email")
    private String email;
    @Column(name = "professor_enrollment",unique = true, nullable = false)
    private String enrollment;
    @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY)
    private List<Course> courses;
}
