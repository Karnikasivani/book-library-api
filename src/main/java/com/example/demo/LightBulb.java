package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LightBulb {
    public void turnOn() {
        System.out.println("Light On!");
    }
}
