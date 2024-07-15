import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to Bill's Burgers! ");

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Would you like to customize your meal? (y or n)");
            String customizingMeal = scanner.nextLine();
            if (Objects.equals(customizingMeal, "n")) {
                MealOrder meal = new MealOrder();
                meal.printItemizedList();
                meal.printTotal();
                System.exit(0);
            }

            System.out.println("Sorry, we don't yet know how to customize a meal.\n");
        }

    }
}
