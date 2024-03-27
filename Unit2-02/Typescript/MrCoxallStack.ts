/**
* This class defines a string stack
*
* By: Michael Zagon
* Version: 1.0
* Since:   2024-03-22
*/

export class MrCoxallStack {

  constructor() {
    this.stackAsList = []
  }

   public get showStack() {
    let values = ""
    for (let counter = 0; counter < this.stackAsList.length; counter++) {
      values = values + this.stackAsList[counter] + ", "
    }
    values = values.substring(0, values.length-2)
    return values
  }

  public push(input) {
    this.stackAsList.push(input)
  }

  public popItem() {
    let poppedItem = ""
    if (this.stackAsList[0]) {
      poppedItem = this.stackAsList[this.stackAsList.length - 1]
    } else {
      poppedItem = "nothing to remove"
    }
    this.stackAsList.splice(-1)
    return poppedItem
  }
}
