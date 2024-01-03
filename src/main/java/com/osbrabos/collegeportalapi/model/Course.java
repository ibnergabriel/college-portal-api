package com.osbrabos.collegeportalapi.model;

import com.osbrabos.collegeportalapi.model.enums.Department;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Department department;

    @ManyToMany(mappedBy = "course")
    private List<EnrolledCourse> enrolledCourses;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    public Course(Long id, String name, Department department, Professor professor) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.professor = professor;
    }
}
