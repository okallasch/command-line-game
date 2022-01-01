package cz.kallasch.gamebook.backend.service;

import cz.kallasch.gamebook.backend.entity.world.ChapterEntity;
import cz.kallasch.gamebook.backend.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository repository;

    public ChapterEntity findChapterById(Long id){
        Optional<ChapterEntity> byId = repository.findById(id);
        return byId.orElse(null);
    }
}
