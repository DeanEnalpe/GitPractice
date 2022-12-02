package com.example.GitPractice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Classmate {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String section;
    @Column
    private Integer age;
    @Column
    private boolean isActive;
}
