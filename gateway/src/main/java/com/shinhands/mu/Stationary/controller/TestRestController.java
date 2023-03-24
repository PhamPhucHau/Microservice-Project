package com.shinhands.mu.Stationary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRestController {

    @GetMapping("/hello1")
    public String get() {
        return "Hello Thereaaaa!";
    }
}
