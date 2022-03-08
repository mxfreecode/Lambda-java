/**
 * 
 */
package com.school.app.repositories;

import org.springframework.stereotype.Repository;

import com.school.app.models.StudentModel;

import org.springframework.data.repository.CrudRepository;

/**
 * @author adminmx
 *
 */
@Repository
public interface StudentRepository extends CrudRepository<StudentModel, Long> {

}
