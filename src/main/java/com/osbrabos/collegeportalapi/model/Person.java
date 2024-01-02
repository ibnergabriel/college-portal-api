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
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Tabela por Subclasse - união por chave estrangeira
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String phoneNumber;

    @Column(unique = true, nullable = false)
    private String cpf;

    @OneToOne
    private Address address;

    protected Person(String name, LocalDate dateOfBirth, Gender gender, String phoneNumber, String cpf, Address address){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.cpf = cpf;
        this.address = address;
    }
}
