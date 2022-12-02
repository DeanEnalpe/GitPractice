package com.example.GitPractice.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Classmate {
    private String firstName;
    private String lastName;
    private Integer age;
}
