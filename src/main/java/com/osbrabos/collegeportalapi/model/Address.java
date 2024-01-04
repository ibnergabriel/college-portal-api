package com.osbrabos.collegeportalapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public final class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String state;
    private String city;
    private String street;
    private String postalCode;
}
