package com.xignitex.cleanarchitecture.demo.gateway;

import com.xignitex.cleanarchitecture.demo.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface PlayerGateway  extends MongoRepository<Player, String> {

    public Player findPlayerByFirstName(String firstName);
}
