package com.it.college.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.college.entities.User;
import com.it.college.model.LoginModel;
import com.it.college.repositories.UserRepo;
import com.it.college.utils.ApiResponse;


@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    /**
     * 
     * @param loginModel
     * @return
     */
    public ApiResponse loginUser(LoginModel loginModel) {
        try {
            Optional<User> op = userRepo.findByEmailAndPassword(loginModel.getEmail(), loginModel.getPassword());
            if (op.isPresent()) {
                User user = op.get();
                return new ApiResponse(true, op.get(),  "Login Success");
            } else {
                return new ApiResponse(false, "Invalid Email or Password");
            }
        } catch (Exception e) {
            return new ApiResponse(false, e.getMessage());
        }
    }

}
