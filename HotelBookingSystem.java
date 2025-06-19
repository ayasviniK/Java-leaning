class Room {
    // Private attributes (Encapsulation)
    private int roomNumber;
    private String type;
    private double pricePerNight;
    private int nightsBooked;

    // Constructor to initialize room details
    public Room(int roomNumber, String type, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.nightsBooked = 0; // Initially, the room is not booked
    }

    // Getter for room details
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    // Method to book the room
    public void bookRoom(int nights) {
        if (nightsBooked > 0) {
            System.out.println("Room " + roomNumber + " is already booked for " + nightsBooked + " night(s).");
        } else {
            nightsBooked = nights;
            System.out.println("Room " + roomNumber + " booked successfully for " + nights + " night(s).");
        }
    }

    // Method to cancel the booking
    public void cancelBooking() {
        if (nightsBooked == 0) {
            System.out.println("Room " + roomNumber + " is not currently booked.");
        } else {
            System.out.println("Booking for Room " + roomNumber + " has been canceled.");
            nightsBooked = 0; // Reset nightsBooked
        }
    }

    // Method to display room details
    public void displayDetails() {
        System.out.println("Room Details:");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Type: " + type);
        System.out.println("Price per Night: $" + pricePerNight);
        System.out.println("Nights Booked: " + nightsBooked);
        System.out.println("Total Price: $" + (nightsBooked * pricePerNight));
    }
}

// Main class
public class HotelBookingSystem {
    public static void main(String[] args) {
        // Create an instance of the Room class
        Room room = new Room(101, "Suite", 150.0);

        // Display room details
        room.displayDetails();

        // Book the room for 3 nights
        room.bookRoom(3);

        // Attempt to book the room again
        room.bookRoom(2);

        // Display room details after booking
        room.displayDetails();

        // Cancel the booking
        room.cancelBooking();

        // Attempt to book the room again after cancellation
        room.bookRoom(2);

        // Display room details after new booking
        room.displayDetails();
    }
}

