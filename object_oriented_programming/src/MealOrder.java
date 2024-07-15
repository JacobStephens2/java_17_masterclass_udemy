// Meals are composed of items, items have subclasses
// (ex. different types of burgers)
public class MealOrder {

    public Burger burger;
    public Item drink;
    public Item side;

    public MealOrder() {
        burger = new Burger();
        drink = new Item();
        side = new Item("side");
    }

    public void addToppings() {

    }

    public void setDrinkSize() {

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
