package com.osbrabos.collegeportalapi.model;

import java.time.LocalDate;
import java.util.Set;

import com.osbrabos.collegeportalapi.model.enums.Gender;
import com.osbrabos.collegeportalapi.model.enums.Graduation;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Student extends Person {

    @Column(name = "enrollment_number", unique = true, nullable = false)
    private String enrollment;

    @Column(name = "student_email")
    private String email;

    @Enumerated(EnumType.STRING)
    private Graduation graduation;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<EnrolledCourse> enrolledCourses;

    public Student(String name, LocalDate dateOfBirth, Gender gender, String phoneNumber, String cpf, Address address, String enrollment, String email, Graduation graduation) {
        super(name, dateOfBirth, gender, phoneNumber, cpf, address);
        this.enrollment = enrollment;
        this.email = email;
        this.graduation = graduation;
    }
}
