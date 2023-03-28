package com.example.helloworld.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @GetMapping("/hello")
    public String hello(){
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "Olá mundo Spring, hoje é dia" + format.format(new Date());
    }
}
