package cz.kallasch.gamebook.backend.service;

import cz.kallasch.gamebook.backend.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeaponService {

    @Autowired
    private WeaponRepository repository;
}
