package org.gopas.gamebook;

import org.gopas.gamebook.model.Creature;
import org.gopas.gamebook.model.Location;
import org.gopas.gamebook.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(">>>Welcome to the game book app in command line<<<");
        System.out.println("What is your nickname?");
        String name = scanner.nextLine();

        Player player = new Player(name, 10);
        Creature troll = new Creature("Troll", 4);
        Creature spider = new Creature("Pavouk", 7);


        // creating location

        Location begin = new Location("Begin", player, null);
        Location location1 = new Location("lokace 1");
        Location location2 = new Location("lokace 2");
        Location location3 = new Location("lokace 3");
        Location location4 = new Location("lokace 4");
        Location location5 = new Location("lokace 5");
        Location location6 = new Location("lokace 6");
        Location location7 = new Location("lokace 7");
        Location location8 = new Location("lokace 8");
        Location location9 = new Location("lokace 9", null, troll);
        Location location10 = new Location("lokace 10");
        Location location11 = new Location("lokace 11");
        Location location12 = new Location("lokace 12");
        Location location13 = new Location("lokace 13", null, spider);
        Location location14 = new Location("lokace 14");
        Location location15 = new Location("lokace 15");
        Location end = new Location("end");
        end.setItEnd(true);

        begin.setEast(location1);

        location1.setSouth(location2);

        location2.setSouth(location3);

        location3.setNorth(location2);
        location3.setSouth(location4);
        location3.setEast(location6);

        location4.setEast(location5);

        location5.setNorth(location6);

        location6.setWest(location3);
        location6.setNorth(location7);

        location7.setEast(location8);

        location8.setNorth(location9);
        location8.setEast(location12);
        location8.setSouth(location10);

        location10.setNorth(location8);
        location10.setSouth(location11);

        location11.setNorth(location10);
        location11.setWest(location5);

        location12.setEast(location13);
        location12.setSouth(location14);

        location14.setEast(location15);

        location15.setNorth(end);

        List<Location> locationList = new ArrayList<>();
        locationList.add(begin);
        locationList.add(location1);
        locationList.add(location2);
        locationList.add(location3);
        locationList.add(location4);
        locationList.add(location5);
        locationList.add(location6);
        locationList.add(location7);
        locationList.add(location8);
        locationList.add(location9);
        locationList.add(location10);
        locationList.add(location11);
        locationList.add(location12);
        locationList.add(location13);
        locationList.add(location14);
        locationList.add(location15);
        locationList.add(end);

        for (Location location : locationList) {
            if (location.getPlayer() != null) {

                if (location.isItEnd()) {
                    System.out.println("Blahopřeji vyhrál si");
                    break;
                }
                if (player.getHealth() > 0) {
                    getDirections(location);
                    changeLocation(location, player);
                }
            }
        }
    }


    private static void getDirections(Location location) {
        if (location.getCreature() != null) {
            Creature creature = location.getCreature();
            System.out.println("Usmrtil tě " + creature.getName() + ", Konec hry ");
            Player player = location.getPlayer();
            player.setHealth(0);
        } else {
            System.out.println("Nacházíš se na lokaci  " + location.getName());
            if (location.getNorth() != null) {
                System.out.println("Můžeš jít na sever (S)");
            }
            if (location.getEast() != null) {
                System.out.println("Můžeš jít na východ (V)");
            }
            if (location.getWest() != null) {
                System.out.println("Můžeš jít na západ (Z)");
            }
            if (location.getSouth() != null) {
                System.out.println("Můžeš jít na jih (J)");
            }
        }
    }


    private static void changeLocation(Location location, Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kam se chceš vydat?");
        String step = scanner.nextLine();

        switch (step) {
            case "S":
                if (location.getNorth() != null) {
                    location.getNorth().setPlayer(player);
                    break;
                } else {
                    System.out.println("Neplatná volba, zkus to znova");
                    break;
                }
            case "V":
                if (location.getEast() != null) {
                    location.getEast().setPlayer(player);
                    break;
                } else {
                    System.out.println("Neplatná volba, zkus to znova");
                    break;
                }
            case "Z":
                if (location.getWest() != null) {
                    location.getWest().setPlayer(player);
                    break;
                } else {
                    System.out.println("Neplatná volba, zkus to znova");
                    break;
                }
            case "J":
                if (location.getSouth() != null) {
                    location.getSouth().setPlayer(player);
                    break;
                } else {
                    System.out.println("Neplatná volba, zkus to znova");
                    break;
                }
            case "exit":
                location.getPlayer().setHealth(0);
                break;
            default:
                System.out.println("Neplatná volba, zkus to znova");
                break;
        }


    }
}
