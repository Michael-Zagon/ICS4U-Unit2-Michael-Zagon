/*
* This class creates a truck using methods from vehicles
*
* @author  Michael Zagon
* @version 1.0
* @since   2024-04-18
*/

/**
 * This is the Truck class.
*/
public class Truck extends Vehicle {
    /**
     * Represents the number of wheels on the vehicle.
     * This constant stores the total number of wheels that the vehicle has.
    */
    private static final int NUMBER_OF_WHEELS = 4;

    /**
     * Variable for the class.
     *
     * @param licensePlateNumber the license plate number on the vehicle
    */
    private String licensePlateNumber = "";

    /**
     * Creates the base truck.
     *
     * @param initialColour the base colour
     * @param initialPlateNumber the base license plate number
     * @param initialMaxSpeed the maximum speed of the vehicle
    */
    public Truck(
            String initialColour,
            double initialMaxSpeed,
            String initialPlateNumber
    ) {
        super(initialColour, initialMaxSpeed, NUMBER_OF_WHEELS);
        this.licensePlateNumber = initialPlateNumber;
    }

    /**
     * Gets the license plate number of the vehicle.
     *
     * @return the current licensePlateNumber
    */
    public String getLicensePlateNumber() {
        return this.licensePlateNumber;
    }

    /**
     * Creates a string about the status of the vehicle.
     *
     * @return the string about the vehicle's status
    */
    public String getStatus() {
        final String breakLine = "\n";
        String status = " -> Speed: " + this.getSpeed() + breakLine;
        status += " -> MaxSpeed: " + this.getMaxSpeed() + breakLine;
        status += " -> Color: " + this.getColour() + breakLine;
        status += " -> License Plate: " + this.licensePlateNumber + breakLine;
        status += " -> Number of Wheels: " + this.getWheels() + breakLine;

        return status;
    }

    /**
     * Sets the license plate of the vehicle.
     *
     * @param newPlateNumber of the vehicle.
    */
    public void setLicensePlateNumber(String newPlateNumber) {
        this.licensePlateNumber = newPlateNumber;
    }

    /**
     * Provides air the the wheels of the truck, which changes speed.
     *
     * @param airPressure applied to the truck
    */
    public void applyAir(double airPressure) {
        this.setSpeed(this.getSpeed() - airPressure / 2);
    }
}
