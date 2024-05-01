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
public class Truck extends AbstractVehicle {
    /**
     * Variable for the class.
     *
     * @param licensePlateNumber the license plate number on the vehicle
    */
    private String licensePlateNumber = "";

    /**
     * Creates the base truck.
     *
     * @param startColour the base colour
     * @param startPlateNumber the base license plate number
     * @param startMaxSpeed the maximum speed of the vehicle
    */
    public Truck(
            String startColour, double startMaxSpeed, String startPlateNumber
    ) {
        super(startColour, startMaxSpeed, 1 + 1 + 1 + 1);
        this.licensePlateNumber = startPlateNumber;
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
        final String lineBreak = "\n";
        String status = " -> Speed: " + this.getSpeed() + lineBreak;
        status += " -> MaxSpeed: " + this.getMaxSpeed() + lineBreak;
        status += " -> Color: " + this.getColour() + lineBreak;
        status += " -> License Plate: " + this.licensePlateNumber + lineBreak;
        status += " -> # of Wheels: " + this.getWheels() + lineBreak;

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
     * Brakes the truck, changing speed.
     *
     * @param brakePower of the brake
     * @param brakeTime of the brake
     * @param airPressure applied to the truck
    */
    public void brake(
            double brakePower, double brakeTime, double airPressure
    ) {
        this.setSpeed(
                this.getSpeed() - (
                    brakePower * brakeTime
                ) - (airPressure * brakeTime)
        );
        if (this.getSpeed() < 0) {
            this.setSpeed(0);
        }
    }
}
