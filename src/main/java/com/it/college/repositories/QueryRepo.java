package com.it.college.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.college.entities.StudQuery;

@Repository
public interface QueryRepo extends JpaRepository<StudQuery, Integer>{
    
}
