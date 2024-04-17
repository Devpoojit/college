package com.it.college.model;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacultySaveModel {
    @NotNull(message = "Email is required")
    @NotBlank(message = "Email cannot be empty")
    private String email;

    @NotNull(message = "Password is required")
    @NotBlank(message = "Password cannot be empty")
    private String password;

    @NotNull(message = "Name is required")
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotNull(message = "Branch is required")
    @NotBlank(message = "Branch cannot be empty")
    private String branch;

    @NotNull(message = "Phone is required")
    @NotBlank(message = "Phone cannot be empty")
    @Length(min = 10, max = 10, message = "Phone number must be 10 digits")
    private String phone;
}
