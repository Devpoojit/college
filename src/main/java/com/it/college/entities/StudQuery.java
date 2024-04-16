package com.it.college.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "queries")
public class StudQuery {
    @Id
    @Column(name = "query_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer queryId;

    @Column(name = "ques", nullable = false)
    private String question;

    @ManyToOne
    @JoinColumn(name = "student", nullable = false)
    private Student student;

    @Column(name = "ask_date", nullable = false)
    private LocalDate askDate;
}
