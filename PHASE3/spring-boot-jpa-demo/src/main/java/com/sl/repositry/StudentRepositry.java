package com.sl.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sl.entity.Student;

@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer>{

}
