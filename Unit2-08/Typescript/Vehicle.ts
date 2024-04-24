/**
* This class creates a vehicle
*
* By:  Michael Zagon
* Version: 1.0
* Since:   2024-04-18
*/

export class Vehicle {
  // Class variables

  // Vehicle colour
  protected colour: string
  // Current speed of the vehicle
  protected speed: number
  // Maximum speed of the vehicle
  protected maxSpeed: number
  // Total number of wheels
  protected wheels: number

  // Creates the base vehicle
  public constructor(initialColour: string, initialMaxSpeed: number, initialWheels: number) {
    this.colour = initialColour
    this.speed = 0
    this.maxSpeed = initialMaxSpeed
    this.wheels = initialWheels
  }

  // Gets the colour of the vehicle
  public get colour(): string {
    return this.colour
  }

  // Gets the current speed of the vehicle
  public get speed(): number {
    return this.speed
  }

  // Gets the maximum speed of the vehicle
  public get maxSpeed(): number {
    return this.maxSpeed
 }

  // Gets the number of wheels
  public get wheels() {
    return this.wheels
  }

  // Creates a string about the status of the car
  public get status(): string {
    let statusString = 'Status:\n'
    statusString = ` -> Speed: ${this.speed}\n`
    statusString += ` -> MaxSpeed: ${this.maxSpeed}\n`
    statusString += ` -> Color: ${this.colour}\n`
    statusString += ` -> Number of Wheels: ${this.wheels}`

    return statusString
  }

  // Sets the colour of the vehicle
  public set colour(newColour: string) {
    this.colour = newColour
  }

  // Accelerates the car, changing the speed
  public accelerate(accelerationPower: number, accelerationTime: number) {
    if (accelerationPower > 0 && accelerationTime > 0) {
      this.speed = (accelerationPower * accelerationTime) + this.speed
      if (this.speed > this.maxSpeed) {
        this.speed = this.maxSpeed
      }
    } else {
      console.log("Acceleration power and time must be positive numbers.")
    }
  }

  // Brakes the car, changing the speed
  public brake(brakePower: number, brakeTime: number) {
    if (brakePower > 0 && brakeTime > 0) {
      this.speed = this.speed - (brakePower * brakeTime)
      if (this.speed < 0) {
        this.speed = 0
      }
    } else {
      console.log("Brake power and time must be positive numbers.")
    }
  }
}
