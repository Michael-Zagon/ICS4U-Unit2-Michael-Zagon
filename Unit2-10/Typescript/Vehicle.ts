/**
*
* This class creates a vehicle
*
* By: Michael Zagon
* Version: 1.0
* Since:   2024-04-30
*/

export abstract class Vehicle {

    // Creates the base vehicle
    constructor(
      // Class variables
      protected _colour: string, protected _maxSpeed: number, protected _wheels: number, protected _speed: number
    ) {}
  
    // Gets the colour of the vehicle
    get colour(): string {
      return this._colour
    }
  
    // Gets the current speed of the vehicle
    get speed(): number {
      return this._speed
    }
  
    // Gets the maximum speed of the vehicle
    get maxSpeed(): number {
      return this._maxSpeed
    }
  
    // Gets the number of wheels on the vehicle
    get wheels(): number {
      return this._wheels
    }
  
    // Creates a string about the status of the car
   abstract get status(): string
  
    // Sets the colour of the vehicle
    set colour(newColour: string) {
      this._colour = newColour
    }
  
    // Accelerates the car, changing the speed
    abstract accelerate(accelPower: number, accelTime: number): void
  
    // Brakes the car, changing the speed
    abstract brake(brakePower: number, brakeTime: number, airPressure: number): void
  }
  
