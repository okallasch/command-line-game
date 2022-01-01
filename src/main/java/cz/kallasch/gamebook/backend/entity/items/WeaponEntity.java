package cz.kallasch.gamebook.backend.entity.items;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Weapon")
public class WeaponEntity extends ItemEntity {

    private int damage;
    private int criticalDamage;
}
