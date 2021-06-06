package cz.kallasch.gamebook.model;

import java.util.ArrayList;
import java.util.List;

public class Location {

    private String name;
    private Player player;
    private Creature creature;
    private boolean isItEnd;

    private List<Location> locationList = new ArrayList<>();


    public Location(String name, Player player, Creature creature) {
        this.name = name;
        this.player = player;
        this.creature = creature;
    }

    public Location(String name) {
        this.name = name;
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

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }



}
