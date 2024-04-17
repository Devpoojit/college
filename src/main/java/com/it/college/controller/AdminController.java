package com.it.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.college.model.FacultySaveModel;
import com.it.college.services.UserService;
import com.it.college.utils.ApiResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController{

    @Autowired
    private UserService userService;

    @PostMapping("/savefac")
    public ResponseEntity<ApiResponse> saveFaculty(@Valid @RequestBody FacultySaveModel facultySaveModel) {
        ApiResponse response = userService.saveFaculty(facultySaveModel);
        ResponseEntity<ApiResponse> re = new ResponseEntity<ApiResponse>(response.getResponseCode());
        return ResponseEntity.status(response.getResponseCode()).body(response);

    }

    @GetMapping("/listfac")
    public ResponseEntity<ApiResponse> listFaculty() {
        ApiResponse response = userService.listFaculty();
        return ResponseEntity.status(response.getResponseCode()).body(response);

    }
}
