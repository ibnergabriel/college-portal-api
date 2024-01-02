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

    @ManyToMany
    @JoinColumn(name = "students_id")
    private List<Student> students;

    @ManyToMany
    @JoinColumn(name = "professors_id")
    private List<Professor> professors;

    public Course(Long id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}
