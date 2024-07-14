import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How would you describe your car?");
        String description = scanner.nextLine();
        Car starterCar = new Car(description);

        System.out.println("What type of fuel do you want your new car to use?\n"
                + "'g' for gas, 'e' for electric, 'h' for hybrid, or another fuel?"
        );
        String fuel = scanner.nextLine();
        Car car = starterCar.getCar(fuel);

        System.out.println("This car is a " + car.getDescription() + " " + car.getClass().getSimpleName() + ".");

        car.startPower();
    }
}
