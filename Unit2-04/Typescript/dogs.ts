/**
* This program uses the MrCoxallStack
*
* By: Michael Zagon
* Version: 1.0
* Since:   2024-03-29
*/

import { MrCoxallStack } from './MrCoxallStack'

const dogStack = new MrCoxallStack()

// Checksize of stack
console.log("The size of the stack is: ", dogStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", dogStack.isEmpty)

// Print fruit items
dogStack.push("poodle")
dogStack.push("retriever")
dogStack.push("beagle")
console.log("Dog items: ", dogStack.showStack())

// Look at the top element of the array
console.log("The top value is", dogStack.peekItem)

// Shows the popped item and new list
const topDog = dogStack.pop()
console.log("Pop dog item: ", topDog)
console.log("Dog items: ", dogStack.showStack())

// Checksize of stack
console.log("The size of the stack is: ", dogStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", dogStack.isEmpty)

// Clear the stack
dogStack.clearStack()

// Checksize of stack
console.log("The size of the stack is: ", dogStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", dogStack.isEmpty)

// Show the program as done
console.log('\nDone.')
