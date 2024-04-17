package com.it.college.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.it.college.entities.Faculty;
import com.it.college.entities.User;
import com.it.college.model.FacultySaveModel;
import com.it.college.model.LoginModel;
import com.it.college.repositories.FacultyRepo;
import com.it.college.repositories.UserRepo;
import com.it.college.utils.ApiResponse;

import jakarta.validation.Valid;


@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private FacultyRepo facRepo;

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
                return new ApiResponse(HttpStatus.OK, true, op.get(),  "Login Success");
            } else {
                return new ApiResponse(HttpStatus.OK,false, "Invalid Email or Password");
            }
        } catch (Exception e) {
            return new ApiResponse(HttpStatus.OK,false, e.getMessage());
        }
    }

    public ApiResponse saveFaculty(@Valid FacultySaveModel facultySaveModel) {
        // TODO Auto-generated method stub
        try {
            Faculty faculty = new Faculty(facultySaveModel);
            facRepo.save(faculty);
            return new ApiResponse(HttpStatus.CREATED, true, null, "Faculty Saved");
        } catch (Exception e) {
            return new ApiResponse(HttpStatus.OK,false, "Not Saved");
        }
    }

    public ApiResponse listFaculty() {
        // TODO Auto-generated method stub
        try {
            return new ApiResponse(HttpStatus.OK, true, facRepo.findAll(), "Faculty List");
        } catch (Exception e) {
            return new ApiResponse(HttpStatus.OK,false, "Not Found");
        }
    }

}
