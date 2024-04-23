/*
* Bike
*
* @author Michael Zagon
* @version 1.0
* @since   2024-04-17
*/

/**
 * Extends Vehicle to Bike.
 */

public class Bike extends Vehicle {

    /**
     * This is the cadence.
     */
    private int cadence;

    /**
     * This is the constructor for Bicycle.
     *
     * @param color this is the color.
     * @param maxSpeed this is the maxSpeed.
     *
     */
    public Bike(String color, int maxSpeed) {
        super(color, maxSpeed);
    }

    /**
     * This sets the appliedPower.
     *
     * @param appliedPower this is the new variable.
     */
    public void accelerate(int appliedPower) {
        this.cadence = this.cadence + appliedPower;
        super.setSpeed(this.cadence * 2);
    }

    /**
     * This is the cadence.
     *
     * @return this returns the cadence.
     */
    public int getCadence() {
        return this.cadence;
    }

    /**
     * This is the ringbell.
     */
    public void ringBell() {
        System.out.println("Ding ding!");
    }

    /**
     * This is the status function.
     */
    public void status() {
        System.out.println(" → Speed: " + super.getSpeed());
        System.out.println(" → MaxSpeed: " + super.getMaxSpeed());
        System.out.println(" → Color: " + super.getColor());
        System.out.println(" → Cadence: " + this.getCadence());
    }
}
