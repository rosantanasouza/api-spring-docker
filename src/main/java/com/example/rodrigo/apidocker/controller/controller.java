package com.example.rodrigo.apidocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping
    public String index() {
        return "Bem-Vindos a api-spring-docker";
    }
}
