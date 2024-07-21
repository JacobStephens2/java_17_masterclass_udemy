package net.jacobstephens.oop.object_oriented_programming;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try {
            int pauseAfterStatement = 1500;
            int processResponse = 500;
            Scanner scanner = new Scanner(System.in);
            int mealsOrdered = 0;
            double grandTotal = 0.00;
            MealOrder defaultMeal = new MealOrder();

            System.out.printf("\nWelcome to Bill's Burgers!\n");
            Thread.sleep(pauseAfterStatement);

            System.out.println("Here's a list of items in the default meal.");
            Thread.sleep(pauseAfterStatement);

            defaultMeal.printItemizedList();
            Thread.sleep(pauseAfterStatement);

            grandTotal += defaultMeal.printTotal();
            Thread.sleep(pauseAfterStatement);

            System.out.println("Would you like to customize this meal? (yes or no)");
            if(Objects.equals(scanner.nextLine(), "yes")) {
                Thread.sleep(processResponse);

                System.out.println("Would you like coke or tea?");
                String drink = scanner.nextLine();
                Thread.sleep(processResponse);

                String drinkSize = getSizeChoice(drink);
                Thread.sleep(processResponse);

                System.out.println("Would you like fries or salad?");
                String side = scanner.next();
                Thread.sleep(processResponse);

                String sideSize = getSizeChoice(side);
                Thread.sleep(processResponse);

                MealOrder meal = new MealOrder(drink, side, sideSize);
                meal.setDrinkSize(drinkSize);

                System.out.println("Here's a list of items in your custom meal.");
                Thread.sleep(pauseAfterStatement);

                meal.printItemizedList();
                Thread.sleep(pauseAfterStatement);

                grandTotal += meal.printTotal();
                Thread.sleep(pauseAfterStatement);
            } else {
                Thread.sleep(processResponse);
            }
            System.out.printf("Your total is %.2f ₽. Enjoy your meal!\n", grandTotal);
            Thread.sleep(pauseAfterStatement);
        } catch (Exception e){
            System.out.println("We caught an exception.");
        }
    }

    public static String getSizeChoice(String item) {
        System.out.printf("Would you like a small or large %s?\n", item);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
