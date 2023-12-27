package com.osbrabos.collegeportalapi.model.entities;

import com.osbrabos.collegeportalapi.model.enums.Degree;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Professor extends Person {

    @Column(unique = true, nullable = false)
    private String enrollment;

    private String email;

    @Enumerated(EnumType.STRING)
    private Degree degree;
}
