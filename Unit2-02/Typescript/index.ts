/**
* This program uses the MrCoxallStack
*
* By:  Michael Zagon
* Version: 1.0
* Since:   2024-03-22
*/

import { MrCoxallStack } from './MrCoxallStack'

let fruits = new MrCoxallStack()
fruits.push("apple")
fruits.push("banana")
fruits.push("cherry")
console.log("fruits: " + fruits.showStack)
console.log("popped: " + fruits.popItem())
console.log("fruits: " + fruits.showStack)
console.log("")

let colours = new MrCoxallStack()
colours.push("red")
colours.push("green")
colours.push("blue")
console.log("colours: " + colours.showStack)
console.log("popped: " + colours.popItem())
console.log("colours: " + colours.showStack)
console.log("")

let dogs = new MrCoxallStack()
dogs.push("poodle")
dogs.push("retriever")
dogs.push("beagle")
console.log("dogs: " + dogs.showStack)
console.log("popped: " + dogs.popItem())
console.log("dogs: " + dogs.showStack)
console.log("")

console.log("\nDone.")
