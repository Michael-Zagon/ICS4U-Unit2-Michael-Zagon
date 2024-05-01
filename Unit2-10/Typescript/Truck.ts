/**
*
* This class creates a truck using methods from vehicles
*
* By: Michael Zagon
* Version: 1.0
* Since:   2024-04-30
*/

import { Vehicle } from './Vehicle'

export class Truck extends Vehicle {
  // Class variables
  private _plateNumber: string

  // Creates the base truck
  public constructor(startColour: string, startMaxSpeed: number, startPlateNumber: string) {
    super(startColour, startMaxSpeed, 4, 0)
    this._plateNumber = startPlateNumber
  }

  // Sets a new plate number to the truck
  public set plateNumber(newPlateNumber: string) {
    this._plateNumber = newPlateNumber
  }

  // Gets the current plate number
  public get plateNumber(): string {
    return this._plateNumber
  }

  // Creates a string about the status of the truck
  public get status(): string {
    let statusString = ` -> Speed: ${this.speed}\n`
    statusString += ` -> MaxSpeed: ${this.maxSpeed}\n`
    statusString += ` -> Color: ${this.colour}\n`
    statusString += ` -> License Plate: ${this.plateNumber}\n`
    statusString += ` -> # of Wheels: ${this.wheels}`

    return statusString
  }

  // Accelerates the truck, changing the speed
  public accelerate(accelPower: number, accelTime: number): void {
    this._speed = (accelPower * accelTime) + this._speed
    if (this._speed > this._maxSpeed) {
      this._speed = this._maxSpeed
    }
  }

  // Brakes the truck, changing speed
  public brake(brakePower: number, brakeTime: number, airPressure: number): void {
    this._speed = this._speed - (brakePower * brakeTime) - (airPressure * brakeTime)
    if (this._speed < 0) {
      this._speed = 0
    }
  }
}
