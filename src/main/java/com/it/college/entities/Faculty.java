package com.it.college.entities;

import com.it.college.model.FacultySaveModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "faculty")
public class Faculty extends User {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "branch", nullable = false)
    private String branch;

    @Column(name = "phone", nullable = false)
    private String phone;

    public Faculty(FacultySaveModel facultySaveModel) {
        this.setEmail(facultySaveModel.getEmail());
        this.setPassword(facultySaveModel.getPassword());
        this.setRole("ROLE_FACULTY");
        this.setStatus(true);
        this.name = facultySaveModel.getName();
        this.branch = facultySaveModel.getBranch();
        this.phone = facultySaveModel.getPhone();
    }
}
