package cz.kallasch.gamebook.backend.service;

import cz.kallasch.gamebook.backend.repository.ArmorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArmorService {

    @Autowired
    private ArmorRepository repository;
}
