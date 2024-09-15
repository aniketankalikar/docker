package com.advaya.dockervolumes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
public class VolumeController {

    @GetMapping("/")
    public String home(Model model) {
        String data = "Default data from the application";

        // Attempt to read a file from a mounted volume
        try {
            data = new String(Files.readAllBytes(Paths.get("/mnt/data/demo.txt")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.addAttribute("data", data);
        return "index";
    }
}

