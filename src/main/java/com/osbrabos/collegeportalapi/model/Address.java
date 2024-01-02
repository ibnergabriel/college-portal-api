package com.osbrabos.collegeportalapi.model;

import jakarta.persistence.*;

@Entity
public record Address(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id, 
    String country, 
    String state, 
    String city, 
    String street,
    String postalCode ) {
} 
