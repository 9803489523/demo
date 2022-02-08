package com.example.demo.controllers;

import com.example.demo.domain.Exercise;
import com.example.demo.repos.ExerciseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;


@Controller
public class DbController {
    @Autowired
    private ExerciseRepo exerciseRepo;

    @GetMapping
    public String hello(Map<String,Object> model){
        Iterable<Exercise> exercises=exerciseRepo.findAll();
        model.put("exercises",exercises);
        return "main";
    }

}
