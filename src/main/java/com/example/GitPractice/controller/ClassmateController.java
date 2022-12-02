package com.example.GitPractice.controller;

import com.example.GitPractice.model.Classmate;
import com.example.GitPractice.service.ClassmateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/classmate")
@RestController
public class ClassmateController {
    @Autowired
    private ClassmateService classmateService;
    @GetMapping
    public List<Classmate> getAllClassmate(){
        return classmateService.getAllClassmate();
    }
}
