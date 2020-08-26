package com.xignitex.cleanarchitecture.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/greeting")
    public String getGreeting(){
        return "Hello world";
    }
}
