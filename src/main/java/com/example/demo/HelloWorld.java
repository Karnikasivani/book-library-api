package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String fun() {
        return "Hello World!! ";
    }

    @GetMapping("/hi")
    public String fun1() {
        return "Hi World";
    }
}

