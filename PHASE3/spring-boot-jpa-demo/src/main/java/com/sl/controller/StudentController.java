package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sl.entity.Student;
import com.sl.repositry.StudentRepositry;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepositry studentRepositry;
	
		
	
	@GetMapping("/list")
	public String listAllStudents(Model model) {
		
		List<Student> students = studentRepositry.findAll();
		
		model.addAttribute("students", students);
		
		return "list-students";
	}
	

}
