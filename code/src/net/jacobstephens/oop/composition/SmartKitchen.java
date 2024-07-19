package net.jacobstephens.oop.composition;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(CoffeeMaker coffeeMaker,
        DishWasher dishWasher,
        Refrigerator refrigerator
        ) {
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }
    public void addWater() {
        this.coffeeMaker.hasWorkToDo = true;
    }

    public void pourMilk() {
        this.refrigerator.hasWorkToDo = true;
    }

    public void loadDishwasher() {
        this.dishWasher.hasWorkToDo = true;
    }

    public void doKitchenWork() {
        this.coffeeMaker.brewCoffee();
        this.dishWasher.doDishes();
        this.refrigerator.orderFood();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }
}

