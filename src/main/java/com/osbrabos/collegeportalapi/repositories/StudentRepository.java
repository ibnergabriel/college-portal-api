package com.osbrabos.collegeportalapi.repositories;

import com.osbrabos.collegeportalapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
