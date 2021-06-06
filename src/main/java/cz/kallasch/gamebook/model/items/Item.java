package cz.kallasch.gamebook.model.items;

import cz.kallasch.gamebook.model.Enums;

public abstract class Item {

    private String name;
    private String description;
    private Enums.itemType type;
    private int cost;

    protected Item(String name, String description, Enums.itemType type, int cost) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
