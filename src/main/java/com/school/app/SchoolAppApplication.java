package com.school.app;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.school.app.models.CourseModel;
import com.school.app.models.StudentModel;
import com.school.app.repositories.CourseRepository;
import com.school.app.repositories.StudentRepository;

@SpringBootApplication
public class SchoolAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(SchoolAppApplication.class, args);
		
		CourseRepository courseRepository =
				configurableApplicationContext.getBean(CourseRepository.class);
		
		StudentRepository studentRepository =
				configurableApplicationContext.getBean(StudentRepository.class);
		
		StudentModel john = new StudentModel("Jhon");
		StudentModel will = new StudentModel("Will");
		StudentModel sam = new StudentModel("Sam");
		List<StudentModel> students = Arrays.asList(john, will, sam);
		
		
		CourseModel maths = new CourseModel("Maths");
		CourseModel science = new CourseModel("Science");
		List<CourseModel> courses = Arrays.asList(maths,science);
		
		
		courseRepository.saveAll(courses);
		
		john.followCourse(science);
		will.followCourse(maths);
		sam.followCourse(science);
		sam.followCourse(maths);
		
		studentRepository.saveAll(students);
		
		
		students.forEach(x -> System.out.println("Students:" + x.getName()));
		courses.forEach(y -> System.out.println("Courses:" + y.getName()));	
	}
	

	
}


