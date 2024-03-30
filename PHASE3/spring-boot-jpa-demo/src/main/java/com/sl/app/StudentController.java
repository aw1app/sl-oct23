package com.sl.app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

	@GetMapping("/details")
	public String studentDetails(Model model, int id) {

		Optional<Student> studentFromRepo = studentRepositry.findById(id);

		if (studentFromRepo.isPresent()) {
			Student student = studentFromRepo.get();
			model.addAttribute("student", student);
		}

		return "student-detail";
	}

	@GetMapping("/add-student")
	public String addStudentShowForm(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);

		return "add-student";
	}

	@PostMapping("/add-student")
	public String addStudent(Model model, @ModelAttribute("student") Student student) {

		student = studentRepositry.save(student);

		model.addAttribute("studentId", student.getStudentId());

		return "add-student-success";
	}

	// EDIT FUNCTIONALITY
	@GetMapping("/edit-student")
	public String editStudentShowForm(Model model, int id) {

		Optional<Student> studentFromRepo = studentRepositry.findById(id);

		if (studentFromRepo.isPresent()) {
			Student student = studentFromRepo.get();
			model.addAttribute("student", student);
			return "edit-student";
		} else {
			model.addAttribute("id", id);
			return "no-such-student";
		}

	}

}
