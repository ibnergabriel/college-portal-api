package com.osbrabos.collegeportalapi.dto;


public record AddressDTO(
        Long id, String country, String state, String city, String street, String postalCode
) {
}
