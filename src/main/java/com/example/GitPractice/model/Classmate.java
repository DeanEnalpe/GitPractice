package com.example.GitPractice.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Classmate {
    private Long id;
    private String name;
    private String section;
}
