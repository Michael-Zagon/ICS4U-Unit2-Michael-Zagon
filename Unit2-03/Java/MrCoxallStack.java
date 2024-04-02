/*
* This class defines a string stack
*
* @author Michael Zagon
* @version 1.0
* @since 2024-03-26
*/

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class.
*/
public class MrCoxallStack {
    /**
     * Adds strings to an array.
     *
     * @param array contains the array of strings
    */
    private List<String> stackAsList;

    /**
     * Constructs a new instance of MrCoxallStack.
     * Initializes the stack with an empty ArrayList.
     *
    */
    public MrCoxallStack() {
        this.stackAsList = new ArrayList<>();
    }

    // getters

    /**
     * The getStackAsList() getter.
     *
     * @return -  current list
     */
    public List<String> getStackAsList() {
        return this.stackAsList;
    }

    /**
     * Pushes the string to a list.
     *
    */
    public void push(String stringPushed) {
        this.stackAsList.add(stringPushed);
    }

    /**
     * Pop the top item.
     *
     * @return the popped item from the stack
    */

    public String pop() {
        String returnValue = null;
        if (this.stackAsList.size() > 0) {
            final String topItem = this.stackAsList.get(this.stackAsList.size() - 1);
            returnValue = topItem;
            this.stackAsList.remove(topItem);
        } else {
            System.out.println("The Stack is empty!");
        }

        return returnValue;
    }

    /**
     * Checks if the array is empty.
     *
     * @return the bool that says whether the array is empty or not
    */
    public boolean isEmpty() {
        boolean empty = false;

        if (this.stackAsList.size() == 0) {
            empty = true;
        }

        return empty;
    }

    /**
     * Checks the size of the array.
     *
     * @return the array's length
    */
    public int size() {
        return this.stackAsList.size();
    }

    /**
     * Returns the stack value.
     *
     * @return the values of the list formatted
    */
    public String showStack() {
        final StringBuilder stackValues = new StringBuilder();

        for (String value : this.stackAsList) {
            stackValues.append(value).append(", ");
        }

        if (stackValues.length() > 0) {
            // Remove the trailing comma
            stackValues.deleteCharAt(stackValues.length() - 2);
        }

        return stackValues.toString();
    }
}
