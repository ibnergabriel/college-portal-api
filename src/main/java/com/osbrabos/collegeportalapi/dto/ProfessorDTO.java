package com.osbrabos.collegeportalapi.dto;

import java.time.LocalDate;

public record ProfessorDTO(String name, LocalDate dateOfBirth, String email, String enrollment){
}
