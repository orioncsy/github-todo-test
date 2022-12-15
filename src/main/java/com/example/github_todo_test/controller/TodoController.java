package com.example.github_todo_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @GetMapping("/")
    public String todoApplication(){
        return "To-do Application!";
    }
}
