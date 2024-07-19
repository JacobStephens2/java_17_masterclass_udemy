package net.jacobstephens.oop.object_oriented_programming;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Bill's Burgers! " +
            "Would you like to customize your meal? (y or n, or q to leave)"
        );
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String response = scanner.nextLine();
            MealOrder meal = new MealOrder();
            switch(response) {
                case "q":
                    System.out.println("Have a good day!");
                    System.exit(0);
                    break;
                case "n":
                    meal.addToppings();
                    break;
                case "y":
                    System.out.println("Would you like a small (s) or large (l) coke?");
                    String drinkChoice = scanner.nextLine();
                    drinkChoice = switch(drinkChoice) {
                        case "s" -> "225";
                        case "l" -> "340";
                        default -> {
                            System.out.println("We'll add a large coke to your order.");
                            yield "340";
                        }
                    };
                    meal.setDrinkSize(drinkChoice);
                    break;
                default:
                    System.out.println("We didn't quite catch that.");
                    continue;
            }
            meal.printItemizedList();
            meal.printTotal();
            System.out.println("Would you like to order another meal? (y or n, or q to leave)");
        }
    }
}
