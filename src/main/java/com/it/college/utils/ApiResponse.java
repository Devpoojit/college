package com.it.college.utils;

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

    //Status and Error
    public ApiResponse(Boolean status, String error) {
        this.status = status;
        this.error = error;
    }

    // Status Data and Message
    public ApiResponse(Boolean status, Object data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }
}
