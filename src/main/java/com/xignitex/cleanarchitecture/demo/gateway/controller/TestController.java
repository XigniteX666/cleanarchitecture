package com.xignitex.cleanarchitecture.demo.gateway.controller;

import com.xignitex.cleanarchitecture.demo.model.Candidate;
import com.xignitex.cleanarchitecture.demo.usecase.UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UseCase<String, Candidate> CreateCandidate;

    @GetMapping("/test")
    public Candidate getTest(){
        return CreateCandidate.execute("12");
    }

    @GetMapping("/greeting")
    public String getGreeting(){
        return "Hello world";
    }
}
