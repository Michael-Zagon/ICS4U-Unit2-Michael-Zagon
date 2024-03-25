/**
* This is a class that defines a string stack
*
* By: Michael Zagon
* Version: 1.0
* Since: 2024-03-21
*/

export class MrCoxallStack {
  constructor() {
    self.stackAsList = []
  }

  push(input) {
    self.stackAsList.push(input)
  }

  showStack() {
    let values = ""
    for (let counter = 0; counter < self.stackAsList.length; counter++) {
      values = values + self.stackAsList[counter] + ", "
    }
    values = values.substring(0, values.length-2)
    return values
  }
}
