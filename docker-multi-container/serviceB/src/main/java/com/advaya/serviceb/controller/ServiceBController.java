package com.advaya.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/serviceB")
@RestController
public class ServiceBController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/hello")
    public String serviceB()
    {
        return "Hello from Service B";
    }

    @GetMapping("/serviceAFromB")
    public String serviceAFromB()
    {
        String response = restTemplate.getForObject("http://service-a-container:8080/serviceA/hello",String.class);

        return "Service B Calling -> "+response;
    }
}
