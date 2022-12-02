package com.example.GitPractice.service;

import com.example.GitPractice.model.Classmate;
import com.example.GitPractice.repository.ClassmateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassmateService {
    @Autowired
    private ClassmateRepository repository;

    public List<Classmate> getAllClassmate(){
        return repository.findAll();
    }
}
