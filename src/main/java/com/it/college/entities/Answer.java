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
@Table(name = "answers")
public class Answer {
    @Id
    @Column(name = "answer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answerId;

    @Column(name = "answer" , nullable = false)
    private String answer;

    @ManyToOne
    @JoinColumn(name = "faculty", nullable = false)
    private Faculty faculty;

    @ManyToOne
    @JoinColumn(name = "query", nullable = false)
    private StudQuery query;

    @Column(name = "answer_date", nullable = false)
    private LocalDate answerDate;
    
}
