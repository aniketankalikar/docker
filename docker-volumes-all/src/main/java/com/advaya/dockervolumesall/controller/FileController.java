package com.advaya.dockervolumesall.controller;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

@RestController
@RequestMapping("/file")
public class FileController {

    private final String DIRECTORY = "/data";

    @GetMapping("/read")
    public String readFile(@RequestParam String fileName) throws IOException
    {
        Path path = Paths.get(DIRECTORY, fileName);
        if(Files.exists(path))
        {
            return new String(Files.readAllBytes(path));
        }
        else {
            return "File Not Found";
        }
    }

    @PostMapping("/write")
    public String writeFile(@RequestBody Map<String, String> payload) throws IOException {
        String filename = payload.get("filename");
        String content = payload.get("content");
        Path path = Paths.get(DIRECTORY, filename);
        Files.createDirectories(path.getParent());
        Files.write(path, content.getBytes());
        return "File written: " + filename;
    }
}
