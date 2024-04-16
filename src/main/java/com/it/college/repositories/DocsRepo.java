package com.it.college.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.college.entities.Document;

@Repository
public interface DocsRepo extends JpaRepository<Document, Integer>{
    
}
