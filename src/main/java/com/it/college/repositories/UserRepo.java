package com.it.college.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.college.entities.User;
import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
    Optional<User> findByEmailAndPassword(String email, String password);
}
