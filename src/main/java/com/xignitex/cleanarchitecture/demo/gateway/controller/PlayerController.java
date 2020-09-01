package com.xignitex.cleanarchitecture.demo.gateway.controller;

import com.xignitex.cleanarchitecture.demo.model.Player;
import com.xignitex.cleanarchitecture.demo.usecase.UseCase;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @ApiOperation("Returns store information. Multiple stores can be passed.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "API called successfully.", response = Player.class),
            @ApiResponse(code = 400, message = "Bad Request"),})
    @GetMapping(value="/{id}")
    public Player getPlayerInfo(@PathVariable("id") final String id){
        return getPlayerInformation.execute(id);
    }

}
