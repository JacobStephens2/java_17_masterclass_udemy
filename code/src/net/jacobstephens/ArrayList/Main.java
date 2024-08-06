package net.jacobstephens.ArrayList;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your grocery list. ");
        ArrayList<String> groceryList = new ArrayList<>();
        while (true) {
            System.out.println("Enter 0 to shutdown, 1 to add items, or 2 to remove items.");
            switch (scanner.nextLine()) {
                case "0":
                    System.out.println("May the bananas be perfectly yellow green.");
                    System.exit(0);
                    break;
                case "1":
                    System.out.println("What items would you like to add to the grocery list? (Enter a comma delimited list without spaces)");
                    String itemsToAddString = scanner.nextLine();
                    String[] itemsToAdd = itemsToAddString.split(",");
                    for (String item : itemsToAdd) {
                        if (groceryList.contains(item)) {
                            System.out.println(item + " is already on the list, so it will not be added again.");
                        } else {
                            groceryList.add(item);
                        }
                    }
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println("Grocery list: " + groceryList);
                    break;
                case "2":
                    System.out.println("What items would you like to remove from the grocery list? (Enter a comma delimited list without spaces)");
                    String itemsToRemoveString = scanner.nextLine();
                    String[] itemsToRemove = itemsToRemoveString.split(",");
                    List<String> listToRemove = List.of(itemsToRemove);
                    groceryList.removeAll(listToRemove);
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println("Grocery list: " + groceryList);
                    break;
            }
        }
    }
}
