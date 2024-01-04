package com.osbrabos.collegeportalapi.dto;

import com.osbrabos.collegeportalapi.model.EnrolledCourse;
import com.osbrabos.collegeportalapi.model.enums.Graduation;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class StudentDTO extends PersonDTO{

    private String enrollment;

    private String email;

    private Graduation graduation;

    private Set<EnrolledCourse> enrolledCourses;
}
