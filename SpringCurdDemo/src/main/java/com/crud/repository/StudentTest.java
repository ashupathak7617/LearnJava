package com.crud.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crud.entity.Student;

@SpringBootTest
public class StudentTest {
	
	@Autowired
	   private StudentRepo studentRepository;

 @Test
 
 void saveStudent() {
 	Student student = new Student();
 	//student.setId((long) 100);
 	student.setFirstName("Ashu");
 	student.setLastName("Pathak");
 	student.setEmailId("ashu@gmail.com");
 	studentRepository.save(student);
    
 }
 
 @Test
 @Disabled
 void getAllStudents() {
// 	Student student = new Student();
// 	student.setId((long) 100);
// 	student.setFirstName("Faruk");
// 	student.setLastName("Khan");
// 	student.setEmailId("Mic@gmail.com");
		/*
		 * List<Student> std=studentRepository.getAllStudents();
		 * System.out.println("Student"+std.toString());
		 */
    
 }

 @AfterEach
 void tearDown() {
     System.out.println("tearing down");
    // studentRepository.deleteAll();
 }

 @BeforeEach
 void setUp() {
     System.out.println("setting up");
 }


}
