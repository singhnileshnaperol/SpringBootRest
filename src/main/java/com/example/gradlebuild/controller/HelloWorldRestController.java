package com.example.gradlebuild.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController
{
    @GetMapping(path = "/hello")
    public String helloWorld()
    {
        return "Hello! World!";
    }
}
