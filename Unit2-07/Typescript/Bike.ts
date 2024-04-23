/**
 * Bike
 * By: Michael Zagon
 * Version: 1.0
 * Since:   2024-04-17
 */

import Vehicle from './Vehicle'

class Bike extends Vehicle {
  private cadence = 0

  // Override Status
  status(): void {
    console.log(
      ` → Color: ${super.getColor()}
    → Max Speed: ${super.getMaxSpeed()}
    → Speed: ${super.getSpeed()}
    → Cadence: ${this.cadence}
  `
    )
  }

  // Getter cadence
  getCadence(): number {
    return this.cadence
  }

  // acceleration
  accelerate(appliedPower: number): void {
    this.cadence = this.cadence + appliedPower
    super.setSpeed(this.cadence * 2)
  }

  // Ring bell
  ringBell(): void {
    console.log('Ding ding!\n')
  }
}

export = Bike
