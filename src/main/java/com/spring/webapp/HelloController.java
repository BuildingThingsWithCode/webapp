package com.spring.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Map the root URL to this method
    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot Web Application!";
    }
}
