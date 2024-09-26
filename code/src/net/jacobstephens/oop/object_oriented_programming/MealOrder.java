package net.jacobstephens.oop.object_oriented_programming;

import java.util.Objects;

// Meals are composed of items, items have subclasses
// (ex. different types of burgers)
public class MealOrder {

    public Item burger;
    public Item drink;
    public Item side;

    public MealOrder() {
        burger = Item.getItem("burger", "regular");
        drink = Item.getItem("drink", "coke");
        side = Item.getItem("side", "fries");
    }

    public MealOrder(String burgerName, String drinkName, String sideName) {
        burger = Item.getItem("burger", burgerName);
        drink = Item.getItem("drink", drinkName);
        side = Item.getItem("side", sideName);
    }

    public void setDrinkSize(String size) {
        double price = 87;
        if(Objects.equals(size, "large")) {
            price = 100;
        }
        drink.setSize(size);
        drink.setPrice(price);
    }

    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("  ---");
    }

    public void printTotal() {
        double total = 0;
        total += burger.getAdjustedPrice();
        total += drink.getBasePrice();
        total += side.getBasePrice();
        System.out.printf("  The total for this meal is %.2f ₽\n", total);
    }

}
