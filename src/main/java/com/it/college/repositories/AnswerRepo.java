package com.it.college.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.college.entities.Answer;

@Repository
public interface AnswerRepo extends JpaRepository<Answer, Integer>{
    
}
