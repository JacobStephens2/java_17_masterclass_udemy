package net.jacobstephens.LinkedList;

import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Town[] towns = new Town[]{
            new Town("Adelaide", 1374),
            new Town("Alice Springs", 2771),
            new Town("Brisbane", 917),
            new Town("Darwin", 3972),
            new Town("Melbourne", 877),
            new Town("Perth", 3923),
        };
        var list = new LinkedList<Town>();
        var iterator = list.listIterator();
        Town startingTown = towns[0];
        iterator.add(towns[0]);
        System.out.println("Adding town with distance " + towns[0].getKmFromSydney());
        for (int i = 1; i < towns.length; i++) {
            iterator.add(towns[i]);
            System.out.println(startingTown.getTown()
                    + " (" + startingTown.getKmFromSydney() + " km from Sydney)"
                    + " to " + towns[i].getTown() + ","
                    + " (" + towns[i].getKmFromSydney() + " km from Sydney)"
            );
            startingTown = towns[i];
        }
        System.out.println("\n" + "LinkedList: ");
        var displayIterator = list.listIterator();
        while (displayIterator.hasNext()) {
            Town town = displayIterator.next();
            System.out.println(town.getTown() + " (" + town.getKmFromSydney() + " km from Sydney)");
        }

    }
}
