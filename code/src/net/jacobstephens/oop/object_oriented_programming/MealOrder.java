package net.jacobstephens.oop.object_oriented_programming;

// Meals are composed of items, items have subclasses
// (ex. different types of burgers)
public class MealOrder {

    public Burger burger;
    public Item drink;
    public Item side;

    public MealOrder() {
        burger = new Burger("regular", 8);
        drink = new Item();
        side = new Item("fries", "side", 4, "140g");
    }

    public void addToppings() {
        burger.addToppings();
    }

    public void setDrinkSize(String ml) {
        drink.setSize(ml + "ml");
    }

    public void printItemizedList() {
        System.out.println("Here's a list of the items in your meal");
        burger.printItem();
        drink.printItem();
        side.printItem();
    }

    public void printTotal() {
        double total = 0;
        total += burger.getAdjustedPrice();
        total += drink.getAdjustedPrice();
        total += side.getAdjustedPrice();
        System.out.printf("Your total is $%.2f\n", total);
    }

}
