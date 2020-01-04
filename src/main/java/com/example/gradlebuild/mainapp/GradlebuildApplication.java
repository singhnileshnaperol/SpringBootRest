package com.example.gradlebuild.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.gradlebuild.*"})
public class GradlebuildApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradlebuildApplication.class, args);
    }

}
