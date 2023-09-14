package com.example.calendar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class rootcontroller{
    @GetMapping("/use") //localhost:8000/use
    public String joinForm(){
        return "index";
    }
}