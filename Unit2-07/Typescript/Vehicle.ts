/**
 * Vehicle class
 *
 * By: Michael Zagon
 * Version: 1.0
 * Since:   2024-04-17
 */

class Vehicle {
  private color: string
  private readonly maxSpeed: number
  private speed = 0

  // Constructor
  constructor(color: string, maxSpeed: number) {
    this.color = color
    this.maxSpeed = maxSpeed
  }

  // Print vehicle info
  status(): void {
    console.log(`
      -> Speed: ${this.speed}
      -> Max Speed: ${this.maxSpeed}
      -> Color: ${this.color}
    `)
  }

  // Getter(color)
  getColor(): string {
    return this.color
  }

  // Setter(color)
  setColor(colorInput: string): void {
    this.color = colorInput
  }

  // Getter(max speed)
  getMaxSpeed(): number {
    return this.maxSpeed
  }

  setSpeed(speed: number): void {
    this.speed = speed
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
