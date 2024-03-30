package com.sl.app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Student getStudent(@PathVariable int id) {

		Optional<Student> studentFromRepo = studentRepositry.findById(id);

		if (studentFromRepo.isPresent()) {
			Student student = studentFromRepo.get();
			return student;
		}

		return null;
	}
	
	// Add a student
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		student = studentRepositry.save(student);
		
		return student;
	}

}
