package com.osbrabos.collegeportalapi.dto;

import com.osbrabos.collegeportalapi.model.enums.Degree;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ProfessorDTO extends PersonDTO {
    private String enrollment;
    private String email;
    private Degree degree;
    private List<CourseDTO> courses;
}
