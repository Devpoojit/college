package com.it.college.utils;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    private Boolean status;
    private Object data;
    private String error;
    private String message;
    private HttpStatus responseCode;

    //Status and Error
    public ApiResponse(HttpStatus responseCode, Boolean status, String error) {
        this.status = status;
        this.error = error;
        this.responseCode = responseCode;
    }

    // Status Data and Message
    public ApiResponse(HttpStatus responseCode, Boolean status, Object data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
        this.responseCode = responseCode;
    }
}
