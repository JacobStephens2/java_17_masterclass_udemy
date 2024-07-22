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
        this(name, type, price, "small");
    }

    public Item(String name, String type) {
        this(name, type, 58, "regular");
    }

    public Item(String name) {
        this(name, "drink", 87, "small");
    }

    public Item() {
        this("coke", "drink", 87, "small");
    }

    public String getName() {
        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addToPrice(double price) {
        this.price += price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return getBasePrice();
    }

    public void printItem() {
        System.out.printf("  %s: %s %s, %.2f ₽\n",
            type, size, name, getBasePrice()
        );
    }
}