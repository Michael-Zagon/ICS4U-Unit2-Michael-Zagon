/*
* Vehicle Class
*
* @author Michael Zagon
* @version 1.0
* @since 2024-04-10
*/

/**
 * Vehicle Class.
 */
public class Vehicle {

    /**
    * License plate.
    */
    private String licensePlate;
    /**
    * Color.
    */
    private String color;
    /**
    * Number of Doors.
    */
    private int numOfDoors;
    /**
    * Max Speed.
    */
    private int maxSpeed;
    /**
    * Speed.
    */
    private int speed;

    /**
     * Vehicle Constructor.
     *
     * @param licensePlate - license plate number
     * @param color - color of the car
     * @param numOfDoors - number of doors
     * @param maxSpeed - maximum speed
     */
    public Vehicle(
        String licensePlate,
        String color,
        int numOfDoors,
        int maxSpeed) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.numOfDoors = numOfDoors;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Status method.
     */
    public void status() {
        System.out.println("");
        System.out.println("    -> Speed: " + this.speed);
        System.out.println("    -> Max Speed: " + this.maxSpeed);
        System.out.println("    -> Number of Doors: " + this.numOfDoors);
        System.out.println("    -> License Plate: " + this.licensePlate);
        System.out.println("    -> Color: " + this.color);
        System.out.println("");
    }

    /**
     * GetLicensePlate method.
     *
     * @return licensePlate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * SetLicensePlate method.
     *
     * @param licensePlateInput - new plate
     */
    public void setLicensePlate(String licensePlateInput) {
        this.licensePlate = licensePlateInput;
    }

    /**
     * GetColor method.
     *
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * SetColor method.
     *
     * @param colorInput - set color
     */
    public void setColor(String colorInput) {
        this.color = colorInput;
    }

    /**
     * GetDoorCount method.
     *
     * @return numOfDoors
     */
    public int getDoorCount() {
        return this.numOfDoors;
    }

    /**
     * GetMaxSpeed method.
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * GetSpeed method.
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Accelerate method.
     *
     * @param accelerationPower - power of the acceleration
     * @param accelerationTime - time to accelerate for
     */
    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speed += accelerationPower * accelerationTime;
        if (!(this.speed < this.maxSpeed)) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * Brake method.
     *
     * @param accelerationPower - power
     * @param accelerationTime - brake time
     */
    public void brake(int accelerationPower, int accelerationTime) {
        this.speed -= accelerationPower * accelerationTime;
        if (!(this.speed >= 0)) {
            this.speed = 0;
        }
    }
}
