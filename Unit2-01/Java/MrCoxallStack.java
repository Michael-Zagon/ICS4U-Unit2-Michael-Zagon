/*
* This class defines a string stack
*
* @author  Michael Zagon
* @version 1.0
* @since   2024-03-23
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

    /**
     * Pushes the string to a list.
     *
     * @param string the string that is going to be pushed
    */
    public void push(String string) {
        this.stackAsList.add(string);
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
