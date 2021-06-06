package cz.kallasch.gamebook.runtime;

import cz.kallasch.gamebook.model.Location;
import cz.kallasch.gamebook.model.Player;

import java.util.List;
import java.util.Scanner;

public class Run {

    Scanner scanner = new Scanner(System.in);

    public Run() {

    }

    public void runGame(Player player) {



        while (player.getHealth() > 0) {
            System.out.println("Nacházíš se na: " + player.getActualLocation().getName());
            System.out.println("Dostupné lokace: ");
            getPossibleDirections(player.getActualLocation());
            System.out.print("Vaše volba: ");

            moveToLocation(player.getActualLocation(), player);

        }
    }

    private void moveToLocation(Location location, Player player) {

        boolean retryMenu = true;
        while(retryMenu) {
            try {
                String select = scanner.nextLine();
                Location newLocation = location.getLocationList().get(Integer.parseInt(select) - 1);
                player.setActualLocation(newLocation);
                retryMenu = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Neplatna volba, zkuste to prosim znova");
                retryMenu = true;
            } catch (NumberFormatException e){
                System.out.println("Je treba zadat cislo");
                retryMenu = true;
            }
        }
    }

    private void getPossibleDirections(Location location) {

        List<Location> locations = location.getLocationList();
        int i = 1;
        for (Location possibleLocation : locations) {
            System.out.println(i + "-" + possibleLocation.getName());
            i++;
        }
    }


}