package com.osbrabos.collegeportalapi.dto;

import java.time.LocalDate;

import com.osbrabos.collegeportalapi.model.Address;
import com.osbrabos.collegeportalapi.model.enums.Gender;

import lombok.Data;

@Data
public class PersonDTO {

    private Long _id;
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String phoneNumber;
    private String cpf;
    private AddressDTO addressDTO;
}
