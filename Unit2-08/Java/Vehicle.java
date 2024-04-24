/*
* This class creates a vehicle
*
* @author Michael Zagon
* @version 1.0
* @since   2024-04-18
*/

/**
 * This is the Vehicle class.
*/
public class Vehicle {
    /**
     * Variable for the class.
     *
     * @param colour of the vehicle
    */
    protected String colour = "";

    /**
     * Variables for the class.
     *
     * @param speed of the vehicle
    */
    protected double speed;

    /**
     * Variables for the class.
     *
     * @param maxSpeed of the vehicle
    */
    protected double maxSpeed;

    /**
     * Variables for the class.
     *
     * @param wheels on the vehicle
    */
    protected int wheels;

    /**
     * Creates the base vehicle.
     *
     * @param initialColour the base colour
     * @param initialMaxSpeed the maximum speed of the vehicle
     * @param initialWheels the number of wheels on the vehicle
    */
    public Vehicle(String initialColour, double initialMaxSpeed,
                    int initialWheels) {
        this.colour = initialColour;
        this.speed = 0;
        this.maxSpeed = initialMaxSpeed;
        this.wheels = initialWheels;
    }

    /**
     * Gets the colour of the vehicle.
     *
     * @return the current colour
    */
    public String getColour() {
        return this.colour;
    }

    /**
     * Gets the speed of the vehicle.
     *
     * @return the current speed
    */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * Gets the maximum speed of the vehicle.
     *
     * @return the maximum speed
    */
    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Gets the number of wheels on the vehicle.
     *
     * @return the total number of wheels
    */
    public int getWheels() {
        return this.wheels;
    }

    /**
     * Creates a string about the status of the vehicle.
     *
     * @return the string about the vehicle's status
    */
    public String getStatus() {
        final String breakLine = "\n";
        String status = " -> Speed: " + this.speed + breakLine;
        status += " -> MaxSpeed: " + this.maxSpeed + breakLine;
        status += " -> Color: " + this.colour + breakLine;
        status += " -> Number of Wheels: " + this.wheels + breakLine;

        return status;
    }

    /**
     * Sets the colour of the vehicle.
     *
     * @param newColour of the vehicle
    */
    public void setColour(String newColour) {
        this.colour = newColour;
    }

    /**
     * Sets the speed of the vehicle.
     *
     * @param newSpeed of the vehicle
    */
    protected void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * Accelerates the vehicle, which changes the speed.
     *
     * @param accelerationPower power of the acceleration
     * @param accelerationTime time of the acceleration
    */
    public void accelerate(double accelerationPower, double accelerationTime) {
        if (accelerationPower > 0 && accelerationTime > 0) {
            this.speed = (accelerationPower * accelerationTime) + this.speed;
            if (this.speed > this.maxSpeed) {
                this.speed = this.maxSpeed;
            }
        } else {
            System.out.print("Acceleration power and "
                                + "time must be positive numbers.");
        }
    }

    /**
     * Brakes the vehicle, which changes speed.
     *
     * @param brakePower power of the brake
     * @param brakeTime time of the brake
    */
    public void brake(double brakePower, double brakeTime) {
        if (brakePower > 0 && brakeTime > 0) {
            this.speed = this.speed - (brakePower * brakeTime);
            if (this.speed < 0) {
                this.speed = 0;
            }
        } else {
            System.out.print("Brake power and time must be positive numbers.");
        }
    }
}
