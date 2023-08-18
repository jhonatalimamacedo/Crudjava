package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getGreeting() {
        return "Hello from the service!";
    }
}
