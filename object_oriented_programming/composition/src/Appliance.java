public class Appliance {
    protected boolean hasWorkToDo;

    public Appliance() {
        this.hasWorkToDo = false;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class DishWasher extends Appliance {

    public void doDishes() {
        if (this.hasWorkToDo) {
            System.out.println("Dishes need to be done.");
        } else {
            System.out.print("Dishes do not need to be done");
        }
    }

}

class CoffeeMaker extends Appliance {

    public void brewCoffee() {
        if (this.hasWorkToDo) {
            System.out.println("Coffee needs to be brewed.");
        } else {
            System.out.print("Coffee does not need to be brewed");
        }
    }

}

class Refrigerator extends Appliance {

    public void orderFood() {
        if (this.hasWorkToDo) {
            System.out.println("Food needs to be ordered.");
        } else {
            System.out.print("Food does not need to be ordered");
        }
    }

}

