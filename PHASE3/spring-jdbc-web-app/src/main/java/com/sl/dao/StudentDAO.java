package com.sl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sl.entity.Student;

public class StudentDAO {

	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	// Data base access methods

	// 1. List all students from students table
	public List<Student> getAllStudents() {
		return template.query("SELECT * FROM students", new StudentRowMapper());
	}

	// 2. List all students from students table
	public List<Student> getAllStudentsWithFirstName(String fName) {
		return template.query("SELECT * FROM students where first_name='"+fName+"'", new StudentRowMapper());
	}

}

class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student student = new Student();

		student.setFirstName(rs.getString("first_name"));
		student.setLastName(rs.getString("last_name"));
		student.setStudentId(rs.getInt("student_id"));
		student.setDateOfBirth(rs.getDate("date_of_birth"));
		student.setEnrollmentDate(rs.getDate("enrollment_date"));
		student.setSessionName(rs.getString("session_name"));

		return student;
	}

}
