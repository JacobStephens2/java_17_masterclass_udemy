public class Item {
    protected String name;
    protected String type;
    protected double price;
    protected String size;

    public Item() {
        name = "Oolong Tea";
        type = "drink";
        price = 3;
        size = "250 ml";
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return price;
    }

    public void printItem() {

    }
}