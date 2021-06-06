package cz.kallasch.gamebook.model.items;

import cz.kallasch.gamebook.model.Enums;

public abstract class Weapon extends Item {

    private int damage;
    private int durability;


    protected Weapon(String name, String description, Enums.itemType type, int cost, int damage, int durability) {
        super(name, description, type, cost);
        this.damage = damage;
        this.durability = durability;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

}
