package com.sl.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sl.app.Student;

@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer>{
	

}
