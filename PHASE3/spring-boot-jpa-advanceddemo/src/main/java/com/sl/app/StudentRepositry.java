package com.sl.app;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer>{
	
	List<Student> findAllByFirstName(String firstName);
	
	
	List<Student> findAllByLastName(String lastName);
	
	List<Student> findAllBySessionName(String sessionName);
	
	void deleteByLastName(String lastName);
	
	
	//Our own SQL
	@Query(value="select * from students where first_name like 'A%'", nativeQuery=true)
	List<Student> findAllWhoseFirstNameStartsWithA();
	
}
