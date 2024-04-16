package com.it.college.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginModel {
    @NotNull(message = "Email is required")
    @NotBlank(message = "Email can't be blank")
    private String email;

    @NotNull(message = "Password is required")
    @NotBlank(message = "Password can't be blank")
    private String password;
}
