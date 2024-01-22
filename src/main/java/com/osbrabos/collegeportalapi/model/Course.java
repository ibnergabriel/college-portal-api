package com.osbrabos.collegeportalapi.model;

import com.osbrabos.collegeportalapi.model.enums.Department;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Course {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Department department;

    @ManyToMany
    @JoinTable(
            name = "enrolled_courses", // nome da tabela de junção
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "enrolled_course_id")
    )
    private List<EnrolledCourse> enrolledCourses;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;

}
