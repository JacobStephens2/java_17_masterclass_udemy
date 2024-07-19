package net.jacobstephens.oop.object_oriented_programming;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to Bill's Burgers! ");
        Scanner scanner = new Scanner(System.in);
        int mealsOrdered = 0;
        double grandTotal = 0.00;
        while(true) {
            System.out.println("Would you like to customize this meal? (y or n, or q to leave)");
            String response = scanner.nextLine();
            MealOrder meal = new MealOrder();
            switch(response) {
                case "q":
                    outputGoodbye(mealsOrdered, grandTotal);
                    break;
                case "n":
                    mealsOrdered++;
                    meal.addToppings();
                    break;
                case "y":
                    mealsOrdered++;
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
            grandTotal += meal.printTotal();
            System.out.printf("Your grand total so far is $%.2f. ", grandTotal);
            System.out.println("Would you like to order another meal? (y or n)");
            if(Objects.equals(scanner.nextLine(), "y")) {
                continue;
            }
            outputGoodbye(mealsOrdered, grandTotal);
        }
    }

    public static void outputGoodbye(int mealsOrdered, double grandTotal) {
        switch (mealsOrdered) {
            case 0:
                System.out.print("Have a good day!");
                break;
            case 1:
                System.out.printf("Your total is $%.2f. ", grandTotal);
                System.out.print("Enjoy your meal!");
                break;
            default:
                System.out.printf("Your grand total is $%.2f. ", grandTotal);
                System.out.printf("Enjoy your %d meals!", mealsOrdered);
        }
        System.exit(0);
    }
}
