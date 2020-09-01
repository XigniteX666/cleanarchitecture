package com.xignitex.cleanarchitecture.demo.usecase;

import com.xignitex.cleanarchitecture.demo.gateway.PlayerGateway;
import com.xignitex.cleanarchitecture.demo.model.Player;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class GetPlayerInformation implements UseCase<String, Player> {

    @Autowired
    private final PlayerGateway playerGateway;

    @Override
    public Player execute(String id) {
        log.info("Retrieving the player with id:" + id);
        Optional<Player> p1 = playerGateway.findById(id);
        return Player.builder().firstName("Oskar").lastName("Albers").build();
    }
}
