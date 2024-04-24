/*
* This program is a vehicle class.
*
* @author Michael Zagon
* @version 1.0
* @since   2024-04-18
*/

import { Truck } from "./Truck"
import { Bike } from "./Bike"

const bmx = new Bike('Red', 40)

console.log('Created Bmx bike.\nStatus:')
console.log(bmx.status)

console.log('\nSet the cadence to 10')
bmx.cadence = 10
bmx.speed = 20
console.log(bmx.status)

console.log('\nAccelerate by 15:')
bmx.accelerate(15)
console.log(bmx.status)

console.log('\nRinging bell.')
bmx.ringBell()

const bigTruck = new Truck('Grey', 200, 'HGC-3456F')

console.log('Created a Truck.\nStatus:')
console.log(bigTruck.status)

console.log('\nAccelerating, 10 of power for ten seconds:')
bigTruck.accelerate(10, 10)
console.log('New speed: ' + bigTruck.speed)

console.log('\nBreaking, 10 of power for 10 sec.')
bigTruck.accelerate(10, 10)
console.log('New speed: ' + bigTruck.speed)

console.log('\nApplyed air pressure of 10:')
bigTruck.applyAir(10)
console.log('New speed: ' + bigTruck.speed)

console.log('\nDone.')
