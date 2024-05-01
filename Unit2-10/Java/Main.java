/*
* This program uses a vehicle class to make two different vehicles
*
* @author  Michael Zagon
* @version 1.0
* @since   2024-04-30
*/

/**
* This is the program.
*/
final class Main {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Add big truck
        final Truck bigTruck = new Truck("Grey", 200, "HGC-3456F");
        System.out.println("Created a Big Truck.\nStatus:");
        System.out.println(bigTruck.getStatus());

        // Add BMX Bike
        final Bike bmxBike = new Bike("Red", 40);
        System.out.println("Created a BMX Bike.\nStatus:");
        System.out.println(bmxBike.getStatus());

        // Should get an error since Vehicle is an abstract class
        final AbstractVehicle car = new AbstractVehicle("Green", 50, 6);
        System.out.println("Created a Car.\nStatus:");
        System.out.println(car.getStatus());

        // Show the program as done
        System.out.println("\nDone.");
    }
}
