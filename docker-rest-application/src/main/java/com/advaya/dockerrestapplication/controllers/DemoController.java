package com.advaya.dockerrestapplication.controllers;


import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showForm()
    {
        return "index";
    }

    @PostMapping("/submit")
    public String processForm(@RequestParam Map<String,String> formData, Model model)
    {
        String name  = formData.get("name");
        String email = formData.get("email");

        model.addAttribute("name", name);
        model.addAttribute("email", email);

        return "result";
    }
}