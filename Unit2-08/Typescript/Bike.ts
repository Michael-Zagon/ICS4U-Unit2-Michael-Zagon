/**
*
* This class creates a bike using methods from vehicles
*
* By: Michael Zagon
* Version: 1.0
* Since:   2024-04-17
*/

import { Vehicle } from './Vehicle'

export class Bike extends Vehicle {
  // Class variables
  private cadence: number
  // # of wheels can't be changed once initialized
  private static readonly NUMBER_WHEELS: number = 2

  // Creates the base bike
  public constructor(startColour: string, startMaxSpeed: number) {
    super(startColour, startMaxSpeed, Bike.NUMBER_WHEELS)
    this.cadence = 0
  }

  // Sets the new cadence to the bike
  public set cadence(newCadence: number) {
    this.cadence = newCadence
  }

  // Gets the current cadence
  public get cadence() {
    return this.cadence
  }

  // Creates a string about the status of the car
  public get status() {
    let statusString = ` -> Speed: ${this.speed}\n`
    statusString += ` -> MaxSpeed: ${this.maxSpeed}\n`
    statusString += ` -> Color: ${this.colour}\n`
    statusString += ` -> Cadence: ${this.cadence}\n`
    statusString += ` -> Number of Wheels: ${this.wheels}`

    return statusString
  }

  // Accelerates the bike, changing cadence
  public accelerate(appliedNumber: number) {
    this.cadence = this.cadence + appliedNumber
    this.speed = this.speed + appliedNumber + appliedNumber
  }

  // Rings the bike's bell
  public ringBell() {
    console.log("Ding ding!\n")
  }
}
