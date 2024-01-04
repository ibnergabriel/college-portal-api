package com.osbrabos.collegeportalapi.dto;

import com.osbrabos.collegeportalapi.model.Professor;
import com.osbrabos.collegeportalapi.model.enums.Department;
import lombok.Data;

import java.util.List;


public record CourseDTO(
        Long id, String name, Department department, List<EnrolledCourseDTO> enrolledCourses, Professor professor
) {
}
