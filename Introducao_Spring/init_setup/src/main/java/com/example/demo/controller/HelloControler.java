package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping("/")
    public String helloMessage(){
        return "Hello, DigitalInnovation One";
    }

    @GetMapping("/teste")
    public Integer Calculo(){
        return 10*50;
    }
}
