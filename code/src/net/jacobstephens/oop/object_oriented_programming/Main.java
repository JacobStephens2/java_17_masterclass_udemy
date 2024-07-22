package net.jacobstephens.oop.object_oriented_programming;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            MealOrder defaultMeal = new MealOrder();

            System.out.printf("\nWelcome to Bill's Burgers!\n");

            System.out.println("Here's a list of items in the default meal.");

            defaultMeal.printItemizedList();

            System.out.println("Would you like to customize this meal? (yes or no)");
            if(Objects.equals(scanner.nextLine(), "yes")) {

                System.out.println("Would you like coke or tea?");
                String drink = scanner.nextLine();

                System.out.printf("Would you like a small or large %s?\n", drink);
                String drinkSize = scanner.nextLine();

                System.out.println("Would you like fries or salad?");
                String side = scanner.nextLine();

                System.out.println("Would you like a regular, custom, or deluxe burger?");
                String burger = scanner.nextLine();

                MealOrder meal = new MealOrder(burger, drink, side);
                meal.setDrinkSize(drinkSize);

                System.out.println("Here's a list of items in your custom meal.");

                meal.printItemizedList();

            }
            System.out.println("Enjoy your meal!");

        } catch (Exception exception){
            System.out.println(exception);
            exception.printStackTrace();
        }
    }

}
