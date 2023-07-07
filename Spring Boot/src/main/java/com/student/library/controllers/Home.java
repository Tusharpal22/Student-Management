package com.student.library.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Home {
    @GetMapping("/")
    public String home() {
        return "Spring Boot CRUD Operation ";
    }
}
