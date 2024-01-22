package com.osbrabos.collegeportalapi.dto;

import com.osbrabos.collegeportalapi.model.enums.Graduation;

import java.time.LocalDate;

public record StudentDTO(String name, LocalDate dateOfBirth, String email, String enrollment){
}
