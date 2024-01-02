package com.osbrabos.collegeportalapi.model;

import com.osbrabos.collegeportalapi.model.enums.Gender;
import com.osbrabos.collegeportalapi.model.enums.Graduation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student extends Person {

    @Column(name = "enrollment_number", unique = true, nullable = false)
    private String enrollment;

    @Column(name = "student_email")
    private String email;

    @Enumerated(EnumType.STRING)
    private Graduation graduation;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private List<Course> courses;

    public Student(String name, LocalDate dateOfBirth, Gender gender, String phoneNumber, String cpf, Address address, String enrollment, String email, Graduation graduation) {
        super(name, dateOfBirth, gender, phoneNumber, cpf, address);
        this.enrollment = enrollment;
        this.email = email;
        this.graduation = graduation;
    }
}
