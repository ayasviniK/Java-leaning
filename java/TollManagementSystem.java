import java.util.Scanner;

// Abstract base class Vehicle
abstract class Vehicle {
    // Abstract method to calculate toll charge
    public abstract double calculateTollCharge();
}

// Subclass for Car
class Car extends Vehicle {
    @Override
    public double calculateTollCharge() {
        return 2.0; // Toll charge for a car
    }
}

// Subclass for Truck
class Truck extends Vehicle {
    @Override
    public double calculateTollCharge() {
        return 5.0; // Toll charge for a truck
    }
}

// Subclass for Motorcycle
class Motorcycle extends Vehicle {
    @Override
    public double calculateTollCharge() {
        return 1.0; // Toll charge for a motorcycle
    }
}

// Main class (Driver Program)
public class TollManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept vehicle type from user
        System.out.println("Enter the type of vehicle (Car/Truck/Motorcycle): ");
        String vehicleType = scanner.nextLine();

        // Accept the number of tolls passed
        System.out.println("Enter the number of tolls passed: ");
        int numTolls = scanner.nextInt();

        // Vehicle reference to hold the object
        Vehicle vehicle;

        // Create an appropriate subclass object based on input
        switch (vehicleType.toLowerCase()) {
            case "car":
                vehicle = new Car();
                break;
            case "truck":
                vehicle = new Truck();
                break;
            case "motorcycle":
                vehicle = new Motorcycle();
                break;
            default:
                System.out.println("Invalid vehicle type entered!");
                return; // Exit if invalid type
        }

        // Calculate the total toll charge
        double totalCharge = vehicle.calculateTollCharge() * numTolls;

        // Display the result
        System.out.println("Total toll charge for the " + vehicleType + " is: $" + totalCharge);
    }
}
