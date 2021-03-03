package com.anakin.generator.repository;

import com.anakin.generator.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 *@description: Repository Method
 *@author: JPA AUTO
 *@date: Wed Mar 03 18:02:23 CST 2021
 */
public interface StudentRepository extends JpaRepository<Student, Integer>, 
		QuerydslPredicateExecutor<Student> {

	@Modifying
	@Transactional
	@Query("update Student t set " +
	        "t.name = CASE WHEN :#{#student.name} IS NULL THEN t.name ELSE :#{#student.name} END ," +
	        "t.age = CASE WHEN :#{#student.age} IS NULL THEN t.age ELSE :#{#student.age} END ," +
	        "t.classname = CASE WHEN :#{#student.classname} IS NULL THEN t.classname ELSE :#{#student.classname} END " +
	        "where t.id = :#{#student.id}") 
	 void updateIsNotNull(Student student); 
}
