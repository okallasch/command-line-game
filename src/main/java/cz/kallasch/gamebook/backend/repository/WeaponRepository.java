package cz.kallasch.gamebook.backend.repository;

import cz.kallasch.gamebook.backend.entity.items.WeaponEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponRepository extends JpaRepository<WeaponEntity, Long> {

}
