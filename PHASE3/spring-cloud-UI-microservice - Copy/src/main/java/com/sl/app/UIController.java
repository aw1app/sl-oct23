package com.sl.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class UIController {
	
	
	@Autowired
    private RestTemplate restTemplate;
	
	@GetMapping("/courses-list")
	public String displayAllCourses(Model model) {
		
	
		Course[] courses = restTemplate.getForObject("http://localhost:8081/courses/all", Course[].class);
	
		
		model.addAttribute("courses", courses);
		
		return "courses"; // display courses.jsp
	}
	
	
	@GetMapping("/students-list")
	public String displayAllStudents(Model model) {
		
	
		Student[] students = restTemplate.getForObject("http://students-microservices/students/all", Student[].class);
		
		model.addAttribute("students", students);
		

		return "students"; // display students.jsp
	}

}



