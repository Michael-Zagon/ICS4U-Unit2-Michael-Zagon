/*
* This class creates a truck using methods from vehicles
*
* @author  Michael Zagon
* @version 1.0
* @since   2024-04-30
*/

/**
 * This is the class.
*/
public class Bike extends AbstractVehicle {
    /**
     * Variable for the class.
     *
     * @param cadence of the bike
    */
    private double cadence;

    /**
     * Creates the base truck.
     *
     * @param startColour the base colour
     * @param startMaxSpeed the maximum speed of the vehicle
    */
    public Bike(String startColour, double startMaxSpeed) {
        super(startColour, startMaxSpeed, 2);
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
        final String lineBreak = "\n";
        String status = " -> Speed: " + this.getSpeed() + lineBreak;
        status += " -> MaxSpeed: " + this.getMaxSpeed() + lineBreak;
        status += " -> Color: " + this.getColour() + lineBreak;
        status += " -> Cadence: " + this.cadence + lineBreak;
        status += " -> # of Wheels: " + this.getWheels() + lineBreak;

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
        if (this.getSpeed() > this.getMaxSpeed()) {
            this.setSpeed(this.getMaxSpeed());
        }
    }

    /**
     * Rings the bike's bell.
    */
    public void ringBell() {
        System.out.println("Ding ding!\n");
    }
}
