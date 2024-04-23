/*
 * This program is a vehicle class.
 *
 * @author  Michael Zagon
 * @version 1.0
 * @since   2020-01-01
 */

import Truck from './Truck'
import Bike from './Bike'

const bmx = new Bike('Red', 40)

console.log('Created Bmx bike.\nStatus:\n')
bmx.status()

console.log('Set the cadence to 10\n')
bmx.accelerate(10)
bmx.status()

console.log('\nAccelerate by 15:')
bmx.accelerate(15)
bmx.status()

console.log('\nRing bell.')
bmx.ringBell()

const bigTruck = new Truck('HGC-3456F', 'Grey', 200)

console.log('Created a Truck.\nStatus:\n')
bigTruck.status()

console.log('\nAccelerating, 10 of power for ten seconds:')
bigTruck.accelerate(10, 10)
console.log('New speed: ' + String(bigTruck.getSpeed()))

console.log('\nBreaking, 10 of power for 10 sec.')
bigTruck.accelerate(10, 10)
console.log('New speed: ' + String(bigTruck.getSpeed()))

console.log('\nApplyed air pressure of 10:')
bigTruck.airBrake(10)
console.log('New speed: ' + String(bigTruck.getSpeed()))

console.log('\nDone.')
