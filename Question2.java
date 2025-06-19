// Car class to represent a car in the rental system
class Car {
    // Private member variables
    private String registrationNumber;
    private String model;
    private String brand;
    private boolean isAvailable;

    // Constructor to initialize the car details
    public Car(String registrationNumber, String model, String brand) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.brand = brand;
        this.isAvailable = true; // By default, the car is available
    }

    // Method to check car availability
    public boolean checkAvailability() {
        return isAvailable;
    }

    // Method to rent a car
    public void rentCar() {
        if (isAvailable) {
            isAvailable = false; // Mark the car as rented
            System.out.println("Success! The car with registration number " + registrationNumber + " has been rented.");
        } else {
            System.out.println("Sorry, the car with registration number " + registrationNumber + " is already rented.");
        }
    }

    // Method to return a car
    public void returnCar() {
        if (!isAvailable) {
            isAvailable = true; // Mark the car as available
            System.out.println("The car with registration number " + registrationNumber + " has been successfully returned.");
        } else {
            System.out.println("The car with registration number " + registrationNumber + " was not rented.");
        }
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

// Main class to test the Car Rental Management System
public class Question2 {
    public static void main(String[] args) {
        // Create a few car instances
        Car car1 = new Car("AB1234", "Civic", "Honda");
        Car car2 = new Car("CD5678", "Model S", "Tesla");
        Car car3 = new Car("EF9012", "Corolla", "Toyota");

        // Display car details
        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();
        System.out.println();

        // Check availability of car1
        System.out.println("Is car1 available? " + (car1.checkAvailability() ? "Yes" : "No"));
        System.out.println();

        // Rent car1
        car1.rentCar();
        System.out.println("Is car1 available? " + (car1.checkAvailability() ? "Yes" : "No"));
        System.out.println();

        // Try renting car1 again
        car1.rentCar();
        System.out.println();

        // Return car1
        car1.returnCar();
        System.out.println("Is car1 available? " + (car1.checkAvailability() ? "Yes" : "No"));
        System.out.println();

        // Return car1 again
        car1.returnCar();
        System.out.println();

        // Display updated car details
        car1.displayCarDetails();
        System.out.println();
    }
}

