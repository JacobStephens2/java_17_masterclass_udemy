import java.util.Scanner;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public Car getCar(String fuel) {
        return switch(fuel) {
            case "g" -> new GasPoweredCar(description);
            case "e" -> new ElectricCar(description);
            case "h" -> new HybridCar(description);
            default -> new Car(description);
        };
    }

    public String getDescription() {
        return description;
    }

    public void startPower() {

    }

    public void drive() {
        runPower();
    }

    protected void runPower() {

    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private Scanner scanner;

    public GasPoweredCar(String description) {
        super(description);
        System.out.println("How many cylinders is this car?");
        scanner = new Scanner(System.in);
        cylinders = Integer.parseInt(scanner.nextLine());
        System.out.println(getCylinders() + " cylinders");
    }

    public int getCylinders() {
        return cylinders;
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }
}
