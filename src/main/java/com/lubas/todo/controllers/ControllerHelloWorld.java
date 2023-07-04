package com.lubas.todo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHelloWorld {
@RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
