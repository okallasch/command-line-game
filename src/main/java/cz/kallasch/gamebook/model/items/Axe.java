package cz.kallasch.gamebook.model.items;

import cz.kallasch.gamebook.model.Enums;
import cz.kallasch.gamebook.model.items.behavior.AttackAble;

public class Axe extends Weapon implements AttackAble {

    public Axe(String name, String description, Enums type, int cost, int damage, int durability) {
        super(name, description, type, cost, damage, durability);
    }

    @Override
    public void attack(int targetArmor) {

    }
}
