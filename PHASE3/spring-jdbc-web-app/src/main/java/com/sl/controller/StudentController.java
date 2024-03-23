package com.sl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping("/listStudents")
	public String getStudents() {
		
		
		
		return "list-students"; // display list-students.jsp
	}

}
