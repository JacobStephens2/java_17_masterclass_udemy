package net.jacobstephens.oop.object_oriented_programming;

import java.util.Objects;
import java.util.Scanner;

public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("deluxe");
        extras = new Item[5];
        setPrice(400);
        addToppings();
    }

    @Override
    public void addToppings() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You can add up to %d toppings for no extra cost.\n", extras.length);
        for (int i = 0; i < extras.length; i++) {
            double toppingPrice = 0;
            System.out.printf("Do you want %s? yes or no?\n", toppings[i][0], toppingPrice);
            if (Objects.equals(scanner.nextLine(), "yes")) {
                extras[i] = new Item(toppings[i][0], "topping", toppingPrice);
            }
        }
        for (Item extra : extras) {
            if (extra != null && !Objects.equals(extra.name, "coke")) {
                System.out.printf("You added %s as a topping.\n", extra.getName(), extra.getBasePrice());
            }
        }
    }
}
