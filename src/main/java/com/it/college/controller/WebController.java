package com.it.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.college.model.LoginModel;
import com.it.college.services.UserService;
import com.it.college.utils.ApiResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/web")
public class WebController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<ApiResponse> login(@Valid @RequestBody LoginModel loginModel) {
        ApiResponse response = userService.loginUser(loginModel);
        return ResponseEntity.ok(response);
    }
}
