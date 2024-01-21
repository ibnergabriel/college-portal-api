package com.osbrabos.collegeportalapi.model;

import java.time.LocalDate;
import java.util.Set;

import com.osbrabos.collegeportalapi.model.enums.Graduation;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    @Column(name = "student_email")
    private String email;
    @Column(name = "student_enrollment", unique = true, nullable = false)
    private String enrollment;
    @Enumerated(EnumType.STRING)
    private Graduation graduation;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<EnrolledCourse> enrolledCourses;
}
