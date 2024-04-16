package com.it.college.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.college.entities.Faculty;

@Repository
public interface FacultyRepo extends JpaRepository<Faculty, Integer>{
    
}
