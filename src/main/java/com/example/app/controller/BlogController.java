package com.example.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BlogController {

    @GetMapping(path = "/")
    public String test() {
        return "aaa";
    }
}
