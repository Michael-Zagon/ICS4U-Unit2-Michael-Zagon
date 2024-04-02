/*
* This program uses a basic class to make an array of integers
*
* @author Michael Zagon
* @version 1.0
* @since 2024-03-26
*/

/**
* This is the program.
*/
final class Colors {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Colors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final MrCoxallStack colorStack = new MrCoxallStack();

        // Check size of stack
        System.out.println("The size of the stack is: " + colorStack.size());

        // Check boolean is empty
        System.out.println("Is the stack empty? " + colorStack.isEmpty());

        // Add fruit stack
        colorStack.push("red");
        colorStack.push("green");
        colorStack.push("blue");
        System.out.println("Color Items: " + colorStack.showStack());

        // Shows the popped item and new list
        final String topColor;
        topColor = colorStack.pop();
        System.out.println("Pop color item: " + topColor);
        System.out.println("Color Items: " + colorStack.showStack());

        // Check size of stack
        System.out.println("The size of the stack is: " + colorStack.size());

        // Check boolean is empty
        System.out.println("Is the stack empty? " + colorStack.isEmpty());

        // Show the program as done
        System.out.println("\nDone.");
    }
}
