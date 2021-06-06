package cz.kallasch.gamebook.runtime;

import cz.kallasch.gamebook.model.Enums;
import cz.kallasch.gamebook.model.Location;
import cz.kallasch.gamebook.model.Creature;
import cz.kallasch.gamebook.model.Player;
import cz.kallasch.gamebook.model.items.Sword;

import java.util.Arrays;
import java.util.Scanner;

public class InitialWorld {

    public InitialWorld() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">>>Welcome to the game book app in command line<<<");
        System.out.println("What is your nickname?");
        String name = scanner.nextLine();

        Player player = new Player(name, 10);
        Creature troll = new Creature("Troll", 4);
        Creature spider = new Creature("Pavouk", 7);

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

        player.setActualLocation(begin);

        begin.setLocationList(Arrays.asList(location1, location2));
        location1.setLocationList(Arrays.asList(location2, location9));
        location2.setLocationList(Arrays.asList(location1, location3));
        location3.setLocationList(Arrays.asList(location2, location6, location3,location4));
        location4.setLocationList(Arrays.asList(location3, location5));
        location5.setLocationList(Arrays.asList(location6, location4));
        location6.setLocationList(Arrays.asList(location5, location3, location7));
        location7.setLocationList(Arrays.asList(location6, location8));
        location8.setLocationList(Arrays.asList(location9, location10, location12, location7));
        location9.setLocationList(Arrays.asList(location8));
        location10.setLocationList(Arrays.asList(location8, location11));
        location11.setLocationList(Arrays.asList(location10, location5));
        location12.setLocationList(Arrays.asList(location14, location13));
        location13.setLocationList(Arrays.asList(location12));
        location14.setLocationList(Arrays.asList(location13, location15));
        location15.setLocationList(Arrays.asList(location14, end));

        Sword commonSword = new Sword("Bezny mec", "kus zeleza", Enums.itemType.WEAPON, 10, 2, 100);
        player.setWeapon(commonSword);

        Run run = new Run();
        run.runGame(player);
    }
}
