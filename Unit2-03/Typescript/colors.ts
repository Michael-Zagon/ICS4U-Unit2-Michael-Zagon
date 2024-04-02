/**
* This program uses the MrCoxallStack
*
* By: Michael Zagon
* Version: 1.0
* Since: 2024-03-26
*/

import { MrCoxallStack } from './MrCoxallStack'

const colorStack = new MrCoxallStack()

// Checksize of stack
console.log("The size of the stack is: ", colorStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", colorStack.isEmpty)

// Print fruit items
colorStack.push("red")
colorStack.push("green")
colorStack.push("blue")
console.log("Color items: ", colorStack.showStack())

// Shows the popped item and new list
const topColor = colorStack.pop()
console.log("Pop color item: ", topColor)
console.log("Color items: ", colorStack.showStack())

// Checksize of stack
console.log("The size of the stack is: ", colorStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", colorStack.isEmpty)

// Show the program as done
console.log('\nDone.')
