package com.sl.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sl.entity.Student;

@Repository
@Transactional
public class StudentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	// Business Methods
	public List<Student> getAllStudents(){
		
		Query query = this.sessionFactory.getCurrentSession().createQuery("from Student");
		
		List<Student> students = query.list();
		
		return students;		
	}
	

}

