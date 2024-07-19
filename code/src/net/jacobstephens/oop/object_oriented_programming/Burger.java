package net.jacobstephens.oop.object_oriented_programming;

public class Burger extends Item {
    private Item[] extras;
    
    public Burger(String type, double price) {

        switch(type) {
            case "deluxe":
            case "blue cheese":
                this.type = type;
                this.price = price;
                break;
            default:
                type = "regular";
                price = 8;
                break;
        };
    }

    public void addToppings() {
        extras = new Item[3];
        extras[0] = new Item("blue cheese", "topping", 1);
        extras[1] = new Item("bacon", "topping", 1.50);
        extras[2] = new Item("caramelized onions", "topping", 0.50);
        name = "Blue Cheese Bacon Burger";
        size = "100g";
        for (Item extra : extras) {
            price += extra.getBasePrice();
        }
    }
}