package com.advaya.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/serviceA")
@RestController
public class ServiceAController {


    @GetMapping("/hello")
    public String serviceA()
    {
        return "Hello from Service A";
    }
}