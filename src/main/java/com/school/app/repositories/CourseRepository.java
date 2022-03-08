/**
 * 
 */
package com.school.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.app.models.CourseModel;

/**
 * @author adminmx
 *
 */
@Repository
public interface CourseRepository extends CrudRepository<CourseModel, Long>{

}
