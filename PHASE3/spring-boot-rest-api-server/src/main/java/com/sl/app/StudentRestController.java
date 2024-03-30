package com.sl.app;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentRestController {
	
	@Autowired
	StudentRepositry studentRepositry;
	
	@GetMapping("/all")
	public List<Student> listAllStudents() {

		List<Student> students = studentRepositry.findAll();		

		return students;
	}
	
	// Challenge : Fetch details of a single student
	@GetMapping("/student/{id}")
	
}
