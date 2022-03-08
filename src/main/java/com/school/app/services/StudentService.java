/**
 * 
 */
package com.school.app.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.models.StudentModel;
import com.school.app.repositories.StudentRepository;

/**
 * @author adminmx
 *
 */
@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public ArrayList<StudentModel> getStudents(){
		return (ArrayList<StudentModel>) studentRepository.findAll();
	}
	
	public StudentModel saveStudent(StudentModel student) {
		return studentRepository.save(student);
	}
}
