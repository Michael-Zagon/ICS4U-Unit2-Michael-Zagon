/*
* This class creates a vehicle
*
* @author  Michael Zagon
* @version 1.0
* @since   2024-04-30
*/

/**
 * This is the class.
*/
abstract class AbstractVehicle {
    /**
     * Variable for the class.
     *
     * @param colour of the vehicle
    */
    private String colour = "";

    /**
     * Variables for the class.
     *
     * @param speed of the vehicle
    */
    private double speed;

    /**
     * Variables for the class.
     *
     * @param maxSpeed of the vehicle
    */
    private double maxSpeed;

    /**
     * Variables for the class.
     *
     * @param wheels on the vehicle
    */
    private int wheels;

    /**
     * Creates the base vehicle.
     *
     * @param startColour the base colour
     * @param startMaxSpeed the maximum speed of the vehicle
     * @param startWheels the number of wheels on the vehicle
    */
    AbstractVehicle(String startColour, double startMaxSpeed, int startWheels) {
        this.colour = startColour;
        this.speed = 0;
        this.maxSpeed = startMaxSpeed;
        this.wheels = startWheels;
    }

    /**
     * Gets the colour of the vehicle.
     *
     * @return the current colour
    */
    String getColour() {
        return this.colour;
    }

    /**
     * Gets the speed of the vehicle.
     *
     * @return the current speed
    */
    double getSpeed() {
        return this.speed;
    }

    /**
     * Gets the maximum speed of the vehicle.
     *
     * @return the maximum speed
    */
    double getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Gets the number of wheels on the vehicle.
     *
     * @return the total number of wheels
    */
    int getWheels() {
        return this.wheels;
    }

    /**
     * Creates a string about the status of the vehicle.
     *
     * @return the string about the vehicle's status
    */
    abstract String getStatus();

    /**
     * Sets the colour of the vehicle.
     *
     * @param newColour of the vehicle
    */
    void setColour(String newColour) {
        this.colour = newColour;
    }

    /**
     * Sets the speed of the vehicle.
     *
     * @param newSpeed of the vehicle
    */
    void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * Accelerates the vehicle, which changes the speed.
     *
     * @param accelPower power of the acceleration
     * @param accelTime time of the acceleration
    */
    void accelerate(double accelPower, double accelTime) {
        this.speed = (accelPower * accelTime) + this.speed;
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * Brakes the vehicle, which changes speed.
     *
     * @param brakePower power of the brake
     * @param brakeTime time of the brake
    */
    void brake(double brakePower, double brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
