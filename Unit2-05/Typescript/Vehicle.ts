/**
 * Vehicle class
 *
 * By: Michael Zagon
 * Version: 1.0
 * Since: 2024-04-10
 */

class Vehicle {
  private licensePlate: string
  private color: string
  private readonly numOfDoors: number
  private readonly maxSpeed: number
  private speed = 0

  // Constructor
  constructor(
    licensePlate: string,
    color: string,
    numOfDoors: number,
    maxSpeed: number
  ) {
    this.numOfDoors = numOfDoors
    this.color = color
    this.licensePlate = licensePlate
    this.maxSpeed = maxSpeed
  }

  // Print vehicle info
  status(): void {
    console.log(`
      -> Speed: ${this.speed}
      -> Max Speed: ${this.maxSpeed}
      -> Number of Doors: ${this.numOfDoors}
      -> License Plate: ${this.licensePlate}
      -> Color: ${this.color}
    `)
  }

  // Getter(License plate)
  getLicensePlate(): string {
    return this.licensePlate
  }

  // Setter(License Plate)
  setLicensePlate(licensePlateInput: string): void {
    this.licensePlate = licensePlateInput
  }

  // Getter(color)
  getColor(): string {
    return this.color
  }

  // Setter(color)
  setColor(colorInput: string): void {
    this.color = colorInput
  }

  // Getter(door count)
  getDoorCount(): number {
    return this.numOfDoors
  }

  // Getter(max speed)
  getMaxSpeed(): number {
    return this.maxSpeed
  }

  // Getter(speed)
  getSpeed(): number {
    return this.speed
  }

  // accelerate method
  accelerate(accelerationPower: number, accelerationTime: number): void {
    this.speed += accelerationPower * accelerationTime
    if (!(this.speed < this.maxSpeed)) {
      this.speed = this.maxSpeed
    }
  }

  // break method
  break(accelerationPower: number, accelerationTime: number): void {
    this.speed -= accelerationPower * accelerationTime
    if (!(this.speed >= 0)) {
      this.speed = 0
    }
  }
}

export = Vehicle
