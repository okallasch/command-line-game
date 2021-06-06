package cz.kallasch.gamebook.model.items;

import cz.kallasch.gamebook.model.Enums;
import cz.kallasch.gamebook.model.items.behavior.AttackAble;

public class Sword extends Weapon implements AttackAble {


    public Sword(String name, String description, Enums.itemType type, int cost, int damage, int durability) {
        super(name, description, type, cost, damage, durability);
    }

    @Override
    public void attack(int targetArmor) {

    }

}
