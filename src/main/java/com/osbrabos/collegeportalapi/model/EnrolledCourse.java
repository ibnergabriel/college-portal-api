package com.osbrabos.collegeportalapi.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Entity
public class EnrolledCourse{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToMany
    @JoinColumn(name = "course_id")
    private List<Course> course;

    private LocalDateTime createdAt;

    public EnrolledCourse(Long id, Student student, LocalDateTime createdAt){
        this.id = id;
        this.student = student;
        this.createdAt = createdAt;
    }
}