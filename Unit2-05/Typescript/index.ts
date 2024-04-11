/**
 * Use Vehicle class to create car objects
 *
 * By: Michael Zagon
 * Version: 1.0
 * Since: 2024-04-10
 */

import Vehicle from './Vehicle'

// new Ford Focus
console.log('Created Ford focus')
const fordFocus = new Vehicle('B40-C4RR0', 'white', 4, 284)

console.log('Status:')
fordFocus.status()

console.log('Accelerating, 10 of power for 10 sec.')
fordFocus.accelerate(10, 10)
console.log(`New speed: ${Number(fordFocus.getSpeed())}`)

console.log('Changing colour to black:')
fordFocus.setColor('black')
console.log(`New color: ${String(fordFocus.getColor())}`)

console.log('')

// new Ferrari
console.log('Created a Ferrari')
const ferrari = new Vehicle('VHD-35HU', 'red', 2, 320)

console.log('Status:')
ferrari.status()

console.log('Accelerating, 100 of power for 4 sec.')
ferrari.accelerate(100, 4)
console.log(`New speed: ${Number(ferrari.getSpeed())}`)

console.log('Breaking, 10 of power for 10 sec.')
ferrari.break(10, 10)
console.log(`New speed: ${Number(ferrari.getSpeed())}`)

console.log('Changing color:')
ferrari.setColor('racing red!')
console.log(`New color: ${String(ferrari.getColor())}`)

console.log('')

// new Citroen Ami
console.log('Created a Citroen Ami')
const citroenAmi = new Vehicle('FS-695-DQ', 'blue', 2, 45)

console.log('Status:')
citroenAmi.status()

console.log('Accelerating, 5 of power for 10 sec.')
citroenAmi.accelerate(5, 10)
console.log(`New speed: ${Number(citroenAmi.getSpeed())}`)

console.log('Breaking, 2 of power for 10 sec.')
citroenAmi.break(2, 10)
console.log(`New speed: ${Number(citroenAmi.getSpeed())}`)

console.log('Changing color:')
citroenAmi.setColor('purple')
console.log(`New color: ${String(citroenAmi.getColor())}`)

console.log('\nDone.')
