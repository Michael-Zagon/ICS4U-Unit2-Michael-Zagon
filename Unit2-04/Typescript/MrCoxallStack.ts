/**
* This class defines a string stack
*
* By: Michael Zagon
* Version: 1.0
* Since:   2024-03-29
*/

export class MrCoxallStack {
    // Stack that contains all of the string
    private stackAsList: string[]
  
    // Creates the stack
    public constructor() {
      this.stackAsList = []
    }
  
    // Getter for stackAsList
    get stackAsList() {
      return this.stackAsList
    }
  
    // Pushes the values to the stack
    public push(stringPushed: string) {
      this.stackAsList.push(stringPushed)
    }
  
    // pop the value from the stack
    public pop() {
      let returnValue: string = ""
      if (this.stackAsList.length > 0) {
        let topItem = this.stackAsList[this.stackAsList.length - 1]
        this.stackAsList.length = this.stackAsList.length - 1
        returnValue = topItem
      } else {
        returnValue = "The stacks is empty!"
      }
  
      return returnValue
    }

    // return true if empty
    public get isEmpty() {
      let empty = false
      if (this.stackAsList.length == 0) {
        empty = true
      }

      return empty
    }

    // returns number of elemnts in stack
    public get size() {
        return this.stackAsList.length
    }

    // Returns the last element of the array
    public get peekItem() {
      return this.stackAsList[this.stackAsList.length - 1]
    }

    // Clears the entire array
    public clearStack() {
      this.stackAsList = []
      console.log('\nEmptying stack...')
    }
  
    // Returns the stack
    public showStack() {
      let stackItems = this.stackAsList[0]
  
      for (let counter = 1; counter < this.stackAsList.length; counter++) {
        stackItems = stackItems + ", " + this.stackAsList[counter]
      }
  
      return stackItems
    }
  }
