package com.osbrabos.collegeportalapi.model;

import com.osbrabos.collegeportalapi.model.enums.Degree;
import com.osbrabos.collegeportalapi.model.enums.Gender;
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
public class Professor extends Person {

    @Column(name = "professor_enrollment",unique = true, nullable = false)
    private String enrollment;

    @Column(name = "professor_email")
    private String email;

    @Enumerated(EnumType.STRING)
    private Degree degree;

    @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY)
    private List<Course> courses;

    public Professor(String name, LocalDate dateOfBirth, Gender gender, String phoneNumber, String cpf, Address address, String enrollment, String email, Degree degree) {
        super(name, dateOfBirth, gender, phoneNumber, cpf, address);
        this.enrollment = enrollment;
        this.email = email;
        this.degree = degree;
    }
}
