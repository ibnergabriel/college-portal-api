package com.osbrabos.collegeportalapi.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import com.osbrabos.collegeportalapi.dto.StudentDTO;
import com.osbrabos.collegeportalapi.model.enums.Graduation;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public Student(StudentDTO data){
        this.name = data.name();
        this.dateOfBirth = data.dateOfBirth();
        this.email = data.email();
        this.enrollment = data.enrollment();
    }
}
