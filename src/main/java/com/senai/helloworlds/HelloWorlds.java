package com.senai.helloworlds;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlds {

    @GetMapping("/")
    public String hello() {
        return "Hello World!!!";
    }
    
}