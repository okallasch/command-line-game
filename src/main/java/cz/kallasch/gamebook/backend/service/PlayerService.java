package cz.kallasch.gamebook.backend.service;

import cz.kallasch.gamebook.backend.entity.world.PlayerEntity;
import cz.kallasch.gamebook.backend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    public PlayerEntity getPlayerByName(String name){
        PlayerEntity byName = repository.findByName(name);
        return byName;
    }
}
