/**
 * 
 */
package com.school.app.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.app.models.StudentModel;
import com.school.app.services.StudentService;

/**
 * @author adminmx
 *
 */
@Controller
@RequestMapping("/home")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	
	@GetMapping()
	public ArrayList<StudentModel> getStudents(){
		return studentService.getStudents();
	}
	
	@PostMapping()
	public StudentModel saveStudent(@RequestBody StudentModel student) {
		return this.studentService.saveStudent(student);
	}

}