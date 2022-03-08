/**
 * 
 */
package com.school.app.models;

import java.util.*;

import javax.persistence.*;


/**
 * @author adminmx
 *
 */
@Entity
@Table(name = "Courses")
public class CourseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	//Relationships
	@ManyToMany(mappedBy="followedCourses")
	
	private List<StudentModel> students = new ArrayList<>();
	

	
	public CourseModel(String name) {
		super();
		this.setName(name);
	}



	public void addStudent(StudentModel studentmodel) {
		students.add(studentmodel);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	
}
