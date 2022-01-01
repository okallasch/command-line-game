package cz.kallasch.gamebook.backend.repository;

import cz.kallasch.gamebook.backend.entity.world.ChapterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<ChapterEntity, Long> {

}
