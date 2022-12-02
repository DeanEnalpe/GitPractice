package com.example.GitPractice.repository;

import com.example.GitPractice.model.Classmate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ClassmateRepository extends JpaRepository<Classmate, Long> {
}