/**
 * 
 */
package com.school.app.models;

import java.util.*;

import javax.persistence.*;

import org.springframework.data.convert.Jsr310Converters.StringToLocalDateConverter;


/**
 * @author adminmx
 *
 */

@Entity
@Table(name = "student")
public class StudentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToMany
	@JoinTable(
		name = "followed_courses",
		joinColumns = @JoinColumn(name = "student_id"),
		inverseJoinColumns = @JoinColumn(name= "course_id")
			
			)
    @JoinColumns({
        @JoinColumn(name="str_course", referencedColumnName="StartCourse", insertable = true ),
        @JoinColumn(name="end_course", referencedColumnName="EndCourse")
    })

	
	private List<CourseModel> followedCourses = new ArrayList<>();


	
	public StudentModel(String name) {
		super();
		this.setName(name);
	}



	public void followCourse(CourseModel coursemodel) {
		followedCourses.add(coursemodel);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
}
