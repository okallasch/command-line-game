package cz.kallasch.gamebook.backend.repository;

import cz.kallasch.gamebook.backend.entity.items.ArmorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArmorRepository extends JpaRepository<ArmorEntity, Long> {

}
