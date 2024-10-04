package net.jacobstephens.LinkedList;

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
//            System.out.println(startingTown.getTown()
//                    + " (" + startingTown.getKmFromSydney() + " km from Sydney)"
//                    + " to " + towns[i].getTown() + ","
//                    + " (" + towns[i].getKmFromSydney() + " km from Sydney)"
//            );
            boolean keepChecking = true;
            while (keepChecking) {
                System.out.println(
                    "starting town " + startingTown.getKmFromSydney()
                    + " town[i] " + towns[i].getKmFromSydney()
                );
                if (startingTown.getKmFromSydney() < towns[i].getKmFromSydney()) {
                    System.out.println("starting smaller than i, so adding\n");

                    // 1374 to 2771 // true
                    iterator.add(towns[i]);
                    keepChecking = false;
                } else {
                    System.out.println("starting larger than i, so moving cursor back");

                    // list: 1374, 2771
                    // 2771 to 917 // false
                    Town previousTown = iterator.previous();
                    System.out.println("previous town is " + previousTown.getKmFromSydney() + " km from Sydney");
                    if (iterator.hasPrevious()) {
                        System.out.println("iterator has previous");
                        if (previousTown.getKmFromSydney() < towns[i].getKmFromSydney()) {
                            System.out.println("iterator has previous");
                            iterator.add(towns[i]);
                            keepChecking = false;
                        }
                    } else {
                        System.out.println("iterator does not have previous");
                        iterator.add(towns[i]);
                        keepChecking = false;
                    }
                }
            }
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
