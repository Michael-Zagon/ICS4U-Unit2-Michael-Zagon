/*
* This class creates a bike using methods from vehicles
*
* @author Michael Zagon
* @version 1.0
* @since   2024-04-18
*/

/**
 * This is the Bike class.
*/
public class Bike extends Vehicle {
    /**
     * Represents the number of wheels on the vehicle.
     * This constant stores the total number of wheels that the vehicle has.
    */
    private static final int NUMBER_OF_WHEELS = 2;

    /**
     * Variable for the class.
     *
     * @param cadence of the bike
    */
    private double cadence;

    /**
     * Creates the base truck.
     *
     * @param initialColour the base colour
     * @param initialMaxSpeed the maximum speed of the vehicle
    */
    public Bike(String initialColour, double initialMaxSpeed) {
        super(initialColour, initialMaxSpeed, NUMBER_OF_WHEELS);
        this.cadence = 0;
    }

    /**
     * Gets the cadence of the bike.
     *
     * @return the current cadence
    */
    public double getCadence() {
        return this.cadence;
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
        status += " -> Cadence: " + this.cadence + breakLine;
        status += " -> Number of Wheels: " + this.getWheels() + breakLine;

        return status;
    }

    /**
     * Sets the cadence of the bike.
     *
     * @param newCadence of the bike
    */
    public void setCadence(double newCadence) {
        this.cadence = newCadence;
        this.setSpeed(newCadence + newCadence);
    }

    /**
     * Accelerates the bike, changing cadence.
     *
     * @param appliedNumber biking power
    */
    public void accelerate(double appliedNumber) {
        this.cadence = this.cadence + appliedNumber;
        this.setSpeed(this.getSpeed() + appliedNumber + appliedNumber);
    }

    /**
     * Rings the bike's bell.
    */
    public void ringBell() {
        System.out.println("Ding ding!\n");
    }
}
