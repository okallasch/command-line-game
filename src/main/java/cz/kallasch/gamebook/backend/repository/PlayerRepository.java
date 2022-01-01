package cz.kallasch.gamebook.backend.repository;

import cz.kallasch.gamebook.backend.entity.world.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {

    @Query("Select c from PlayerEntity c where c.name = :name")
    PlayerEntity findByName(@Param("name") String name);
}
