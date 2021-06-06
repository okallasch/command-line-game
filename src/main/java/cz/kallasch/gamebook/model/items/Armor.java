package cz.kallasch.gamebook.model.items;

import cz.kallasch.gamebook.model.Enums;

public abstract class Armor extends Item {

    private int armor;
    private int durability;

    public Armor(String name, String description, Enums type, int cost, int armor, int durability) {
        super(name, description, type, cost);
        this.armor = armor;
        this.durability = durability;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
