package com.example.calendar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class rootcontroller {
    @GetMapping("/calendar") //localhost:8000/calendar
    public String joinForm(){
        return "index";
    }
}