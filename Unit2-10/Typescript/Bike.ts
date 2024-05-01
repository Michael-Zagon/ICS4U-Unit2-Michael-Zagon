/**
*
* This class creates a bike using methods from vehicles
*
* By: Michael Zagon
* Version: 1.0
* Since:   2024-04-30
*/

import { Vehicle } from './Vehicle'

export class Bike extends Vehicle {
  // Class variables
  private _cadence: number

  // Creates the base bike
  public constructor(startColour: string, startMaxSpeed: number) {
    super(startColour, startMaxSpeed, 2, 0)
    this._cadence = 0
  }

  // Gets the current cadence
  public get cadence(): number {
    return this._cadence
  }

  // Creates a string about the status of the car
  public get status(): string {
    let statusString = ` -> Speed: ${this.speed}\n`
    statusString += ` -> MaxSpeed: ${this.maxSpeed}\n`
    statusString += ` -> Color: ${this.colour}\n`
    statusString += ` -> Cadence: ${this.cadence}\n`
    statusString += ` -> # of Wheels: ${this.wheels}`

    return statusString
  }

  // Sets the new cadence to the bike
  public set cadence(newCadence: number) {
    this._cadence = newCadence
    this._speed = newCadence + newCadence
  }

  // Accelerates the bike, changing cadence and speed
  public accelerate(appliedNumber: number): void {
    this._cadence = this._cadence + appliedNumber
    this._speed = this._speed + appliedNumber + appliedNumber
    if (this._speed > this._maxSpeed) {
      this._speed = this._maxSpeed
    }
  }

  // Brakes the bike, changing the speed
  public brake(brakePower: number, brakeTime: number): void {
    this._speed = this._speed - (brakePower * brakeTime)
    if (this._speed < 0) {
      this._speed = 0
    }
  }

  // Rings the bike's bell
  public ringBell(): void {
    console.log("Ding ding!\n")
  }
}
