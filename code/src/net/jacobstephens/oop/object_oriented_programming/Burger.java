package net.jacobstephens.oop.object_oriented_programming;

import java.util.Objects;
import java.util.Scanner;

public class Burger extends Item {
    private Item[] extras;
    
    public Burger() {
        super("burger", "burger", 300, "regular");
    }

    public Burger(String burgerSize) {
        super("burger", "burger", 300, burgerSize);
        if (!Objects.equals(burgerSize, "regular")) {
            switch(burgerSize) {
                case "custom":
                    extras = new Item[3];
                    break;
                case "deluxe":
                    extras = new Item[5];
                    break;
            }
            addToppings();
        }
    }

    public void addToppings() {
        String[] toppings = { "lettuce", "tomato", "onion", "cheese", "mayo" };
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You can add up to %d toppings.\n", extras.length);
        for (int i = 0; i < extras.length; i++) {
            System.out.printf("Do you want %s? yes or no?\n", toppings[i]);
            extras[i] = new Item();
            if (Objects.equals(scanner.nextLine(), "yes")) {
                extras[i].setName(toppings[i]);
            }
        }
        for (Item extra : extras) {
            if (!Objects.equals(extra.name, "coke")) {
                System.out.printf("You have added %s as a topping.\n", extra.name);
            }
        }
//        extras = new Item[3];
//        extras[0] = new Item("blue cheese", "topping", 20);
//        extras[1] = new Item("bacon", "topping", 30);
//        extras[2] = new Item("caramelized onions", "topping", 10);
//        name = "Blue Cheese Bacon Burger";
//        size = "100g";
//        for (Item extra : extras) {
//            price += extra.getBasePrice();
//        }
    }
}