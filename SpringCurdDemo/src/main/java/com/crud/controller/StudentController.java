package com.crud.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.DTO.StudentDTO;
import com.crud.service.StudentService;


@Controller
public class StudentController {
	@Autowired
	private StudentService  StudentService;
	
	@GetMapping(value = {"/","/registration"})
	   public String registration(Map<String, Object> model) {
	      model.put("student", new StudentDTO());
	      return "student-add-update";
	   }
	   
	   @PostMapping("/home")
	   public String createStudent
	         (@ModelAttribute("student") StudentDTO studentDto) {
	      StudentService.createOrUpdateStudent(studentDto);
	      return "redirect:/list";   
	   }
	   
	   @GetMapping("/list")
	   public String listOfStudent(Model model) {
	      List<StudentDTO> studentList = StudentService.getAllStudent();
	      model.addAttribute("studentList", studentList);
	      return "student-list";
	   }
	   
	   @PostMapping("/delete")
	   public String deleteStudent(@RequestParam("id") String id) {
	      StudentService.deleteStudent(Long.parseLong(id));
	      return "redirect:/list";      
	   }
	   
	   @GetMapping("/edit")
	   public String editStudent(
	         @RequestParam("id") String id, Map<String, Object> model) {
	      StudentDTO studentDTO = StudentService
	            .editStudent(Long.parseLong(id));
	      model.put("student", studentDTO);
	      return "student-add-update";
	   }
	   
	   @RequestMapping("/resource")
	    public String hello() {
	        return "hello";
	    }
	   
	   
	}



