package org.gopas.gamebook.model;

public class Location {

    private String name;
    private Player player;
    private Creature creature;
    private boolean isItEnd;



    private Location north;
    private Location south;
    private Location west;
    private Location east;


    public Location(String name, Player player, Creature creature) {
        this.name = name;
        this.player = player;
        this.creature = creature;
    }

    public Location(String name) {
        this.name = name;
    }

    public Location getNorth() {
        return north;
    }

    public void setNorth(Location north) {
        this.north = north;
    }

    public Location getSouth() {
        return south;
    }

    public void setSouth(Location south) {
        this.south = south;
    }

    public Location getWest() {
        return west;
    }

    public void setWest(Location west) {
        this.west = west;
    }

    public Location getEast() {
        return east;
    }

    public void setEast(Location east) {
        this.east = east;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public boolean isItEnd() {
        return isItEnd;
    }

    public void setItEnd(boolean itEnd) {
        isItEnd = itEnd;
    }
}
