package com.sl.app;

import org.springframework.beans.factory.annotation.Autowired;
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
		
		for(Course s: courses) {
			System.out.println("COURSE DETAILS");
			System.out.println(s.getId());
			System.out.println(s.getName());
		}
		
		model.addAttribute("courses", courses);
		
		return "courses"; // display courses.jsp
	}
	
	
	@GetMapping("/students-list")
	public String displayAllStudents(Model model) {
		
	
		Student[] students = restTemplate.getForObject("http://localhost:8080/students/all", Student[].class);
		
		model.addAttribute("students", students);
		
//		for(Student s: students) {
//			System.out.println(s.);
//		}
		
		return "students"; // display students.jsp
	}

}

