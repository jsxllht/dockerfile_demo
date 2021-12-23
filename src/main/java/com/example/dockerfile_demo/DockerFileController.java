package com.example.dockerfile_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DockerFileController {
    @RequestMapping("/hello")
    public String testDockerFile(){
        return "DockerFile";
    }
}