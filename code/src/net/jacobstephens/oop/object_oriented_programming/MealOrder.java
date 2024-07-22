package net.jacobstephens.oop.object_oriented_programming;

import java.util.Objects;

// Meals are composed of items, items have subclasses
// (ex. different types of burgers)
public class MealOrder {

    public Burger burger;
    public Item drink;
    public Item side;

    public MealOrder() {
        burger = new Burger();
        drink = new Item();
        side = new Item("fries", "side", 58, "small");
    }

    public MealOrder(String burgerName, String drinkName, String sideName) {
        burger = new Burger(burgerName);
        drink = new Item(drinkName);
        side = new Item(sideName, "side");
    }

    public void addToppings() {
        burger.addToppings();
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

    public double printTotal() {
        double total = 0;
        total += burger.getAdjustedPrice();
        total += drink.getAdjustedPrice();
        total += side.getAdjustedPrice();
        System.out.printf("  The total for this meal is %.2f ₽\n", total);
        return total;
    }

}
