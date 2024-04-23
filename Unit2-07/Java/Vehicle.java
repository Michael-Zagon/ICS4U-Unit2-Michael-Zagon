/*
* Vehicle
*
* @author Michael Zagon
* @version 1.0
* @since   2024-04-17
*/

/**
 * This is the class for Vehicle.
 */

public class Vehicle {

    /**
     * This is the color.
     */
    private String color;

    /**
    * This is the maxSpeed.
    */
    private int maxSpeed;

    /**
     * This is the speed.
     */
    private int speed;

    /**
     * This is the Vehicle Constructor.
     *
     * @param color The vehicles color.
     * @param maxSpeed The vehicles max speed.
     *
     */
    public Vehicle(
        String color,
        int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    /**
     * This returns the color.
     *
     * @return this returns the color.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * This gets the color.
     *
     * @param newColor this is the new variable.
     */
    public void setColor(String newColor) {
        this.color = newColor;
    }

    /**
     * This sets the speed.
     *
     * @param newSpeed the new speed.
     */
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * This gets the speed.
     *
     * @return this returns the speed.
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * This gets the max speed.
     *
     * @return this returns the max speed.
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    /**
     * Acceleration function
     * This calculates the acceleration speed.
     *
     * @param accelerationPower this is the acceleration power.
     * @param accelerationTime this is the acceleration time.
     *
     */

    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speed = (accelerationPower * accelerationTime) + this.speed;

        if (speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    /**
     * Breaking function
     * This calculates the breaking speed.
     *
     * @param breakPower this is the breaking power.
     * @param breakTime this is the break time.
     *
     */
    public void breaking(int breakPower, int breakTime) {
        this.speed = this.speed - (breakPower * breakTime);

        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
