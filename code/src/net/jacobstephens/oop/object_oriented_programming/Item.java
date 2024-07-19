package net.jacobstephens.oop.object_oriented_programming;

public class Item {
    protected String name;
    protected String type;
    protected double price;
    protected String size;

    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public Item(String name, String type, double price) {
        this(name, type, price, "regular");
    }

    public Item(String type, double price) {
        this("item", type, price, "regular");
    }

    public Item() {
        this("Coke", "drink", 3, "225ml");
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return getBasePrice();
    }

    public void printItem() {
        System.out.printf("%s (%s %s) $%.2f\n",
            name, size, type, getBasePrice()
        );
    }
}