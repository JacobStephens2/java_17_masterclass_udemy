public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger() {
        super("burger", 8);
    }

    public void addToppings() {
        extra1 = new Item("blue cheese", "topping", 1);
        extra2 = new Item("bacon", "topping", 1.50);
        extra3 = new Item("caramelized onions", "topping", 0.50);
        name = "Blue Cheese Bacon Burger";
        size = "100g";
        price += extra1.getBasePrice();
        price += extra2.getBasePrice();
        price += extra3.getBasePrice();
    }
}