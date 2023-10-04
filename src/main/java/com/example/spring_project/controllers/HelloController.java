package com.example.spring_project.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

    @GetMapping(value="/")
    public String getHelloWord() {
        return "Hello Word VSCode";
    }
    
    
}
