package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class LoggingService {
    public void logAction(String msg) {
        System.out.println("Log: " + msg);
    }
}
