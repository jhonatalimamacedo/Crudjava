package com.jhonata.CrudJava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}