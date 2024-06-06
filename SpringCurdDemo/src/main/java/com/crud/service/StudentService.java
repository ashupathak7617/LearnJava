package com.crud.service;

import java.util.List;

import com.crud.DTO.StudentDTO;

public interface StudentService {
	
	public void createOrUpdateStudent(StudentDTO empDTO);
	   
	   public List<StudentDTO> getAllStudent();
	   
	   public void deleteStudent(Long id);
	   
	   public StudentDTO editStudent(Long id);
	   


}
