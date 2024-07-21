package net.jacobstephens.oop.object_oriented_programming;

public class Burger extends Item {
    private Item[] extras;
    
    public Burger() {
        super("burger", "burger", 300, "regular");
    }

    public void addToppings() {
        extras = new Item[3];
        extras[0] = new Item("blue cheese", "topping", 20);
        extras[1] = new Item("bacon", "topping", 30);
        extras[2] = new Item("caramelized onions", "topping", 10);
        name = "Blue Cheese Bacon Burger";
        size = "100g";
        for (Item extra : extras) {
            price += extra.getBasePrice();
        }
    }
}