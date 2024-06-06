package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
