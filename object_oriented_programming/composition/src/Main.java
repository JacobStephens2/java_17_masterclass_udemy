public class Main {
    public static void main(String[] args) {
        CoffeeMaker brewMaster = new CoffeeMaker();
        DishWasher dishWasher = new DishWasher();
        Refrigerator iceBox = new Refrigerator();
        SmartKitchen smartKitchen = new SmartKitchen(brewMaster, dishWasher, iceBox);
        smartKitchen.addWater();
        smartKitchen.pourMilk();
        smartKitchen.loadDishwasher();
        smartKitchen.doKitchenWork();
    }
}
