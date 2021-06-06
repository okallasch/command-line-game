package cz.kallasch.gamebook.model.items;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    private String name;
    private int size;
    private List<Item> items = new ArrayList<>();

    public Bag(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Item> getItems() {
        return items;
    }


}
