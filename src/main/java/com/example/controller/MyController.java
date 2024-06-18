package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, Spring MVC!");
        return "hello"; // This corresponds to the view name
    }
}
