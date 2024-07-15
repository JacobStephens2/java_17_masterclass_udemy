// Meals are composed of items, items have subclasses
// (ex. different types of burgers)
public class MealOrder {

    public Burger burger;
    public Item drink;
    public Item side;

    public MealOrder() {
        burger = new Burger();
        drink = new Item();
        side = new Item("Fried Mushrooms", "side", 4, "140g");
    }

    public void addToppings() {
        burger.addToppings();
    }

    public void setDrinkSize(String ml) {
        drink.setSize(ml + "ml");
    }

    public void printItemizedList() {
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
