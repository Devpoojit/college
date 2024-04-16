package com.it.college.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.college.entities.Student;

/**
 * StudentRepo
 */
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

    
}