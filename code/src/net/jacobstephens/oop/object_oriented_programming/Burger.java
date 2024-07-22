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
                    setPrice(400);
                    break;
            }
            addToppings();
        }
    }

    public void addToppings() {
        String[][] toppings = {
            {"lettuce", "30"},
            {"tomato", "40"},
            {"onion", "35"},
            {"cheese", "50"},
            {"mayo", "20"}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You can add up to %d toppings.\n", extras.length);
        for (int i = 0; i < extras.length; i++) {
            double toppingPrice = Integer.parseInt(toppings[i][1]);
            if (Objects.equals(size, "deluxe")) {
                toppingPrice = 0;
            }
            System.out.printf("Do you want %s for %.2f ₽? yes or no?\n", toppings[i][0], toppingPrice);
            if (Objects.equals(scanner.nextLine(), "yes")) {
                extras[i] = new Item(toppings[i][0], "topping", toppingPrice);
            }
        }
        for (Item extra : extras) {
            if (extra != null && !Objects.equals(extra.name, "coke")) {
                System.out.printf("You added %s as a topping (%.2f ₽).\n", extra.getName(), extra.getBasePrice());
                addToPrice(extra.getBasePrice());
            }
        }
    }
}