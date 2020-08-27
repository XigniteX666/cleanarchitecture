package com.xignitex.cleanarchitecture.demo.controller;

import com.xignitex.cleanarchitecture.demo.model.Player;
import com.xignitex.cleanarchitecture.demo.usecase.UseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
@Validated
@RequiredArgsConstructor
public class PlayerController {

    private final UseCase<String, Player> getPlayerInformation;

    @GetMapping(value="/{id}")
    public Player getPlayerInformation(@PathVariable("id") final String id){
        return getPlayerInformation(id);
    }

    
    @GetMapping("/test")
    public Player getTest(){
        return getPlayerInformation("123");
    }
}
