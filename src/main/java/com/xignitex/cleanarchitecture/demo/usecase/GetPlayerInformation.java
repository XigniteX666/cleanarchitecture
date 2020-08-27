package com.xignitex.cleanarchitecture.demo.usecase;

import com.xignitex.cleanarchitecture.demo.model.Player;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GetPlayerInformation implements UseCase<String, Player> {

    @Override
    public Player execute(String request) {
        log.info("Retrieving the player with id:" + request);
        return Player.builder().firstName("Oskar").lastName("Albers").build();
    }
}
