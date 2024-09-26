package net.jacobstephens.oop.object_oriented_programming;

import java.util.Objects;
import java.util.Scanner;

public class Burger extends Item {
    protected Item[] extras;
    protected String[][] toppings = {
            {"lettuce", "30"},
            {"tomato", "40"},
            {"onion", "35"},
            {"cheese", "50"},
            {"mayo", "20"}
    };

    public Burger(String burgerSize) {
        super("regular", "burger", 300, burgerSize);
        if (Objects.equals(burgerSize, "custom")) {
            extras = new Item[3];
            addToppings();
        }
    }

    public void addToppings() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You can add up to %d toppings.\n", extras.length);
        for (int i = 0; i < extras.length; i++) {
            double toppingPrice = Integer.parseInt(toppings[i][1]);
            System.out.printf("Do you want %s? yes or no?\n", toppings[i][0], toppingPrice);
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

    public void printItem() {
        System.out.printf("  %s: %s %s burger, %.2f ₽\n",
                type, size, name, getBasePrice()
        );
    }
}