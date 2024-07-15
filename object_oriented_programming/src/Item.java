import java.util.Objects;

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

    public Item() {
        this("Oolong Tea", "drink", 3, "250ml");
    }

    public Item(String type) {
        this("Oolong Tea", type, 3, "250ml");
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return price;
    }

    public void printItem() {
        System.out.printf("%s (%s %s) $%.2f\n", name, size, type, getBasePrice());
    }
}