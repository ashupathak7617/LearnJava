package com.crud.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.DTO.StudentDTO;
@Controller
public class StudentControllerr {

	private static final Logger logger = LogManager.getLogger(StudentControllerr.class);

	

	@RequestMapping("/sss")
	   public String createStudent
	         (@ModelAttribute("student") StudentDTO studentDto) {
		   logger.debug("This is a DEBUG statement");
			logger.warn("This is a WARN statementtt");
			logger.error("This is a ERROR statementttt");
	      return "redirect:/list";   


}
}