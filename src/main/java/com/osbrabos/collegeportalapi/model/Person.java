package com.osbrabos.collegeportalapi.model;

import java.time.LocalDate;

import com.osbrabos.collegeportalapi.model.enums.Gender;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "people")
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Tabela por Subclasse - união por chave estrangeira
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String name;

    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String phoneNumber;

    @Column(unique = true, nullable = false)
    private String cpf;

    public Person(String name, LocalDate dateOfBirth, Gender gender, String phoneNumber, String cpf){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.cpf = cpf;
    }
}
