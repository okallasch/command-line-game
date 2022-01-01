package cz.kallasch.gamebook.backend.entity.items;

import cz.kallasch.gamebook.backend.entity.enums.Enums;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Armor")
public class ArmorEntity extends ItemEntity {

    @Enumerated
    private Enums.ArmorType type;
    private int armor;
}
