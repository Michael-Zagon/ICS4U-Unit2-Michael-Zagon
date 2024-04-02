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
final class Main {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final MrCoxallStack dogStack = new MrCoxallStack();

        // Check size of stack
        System.out.println("The size of the stack is: " + dogStack.size());

        // Check boolean is empty
        System.out.println("Is the stack empty? " + dogStack.isEmpty());

        // Add fruit stack
        dogStack.push("poodle");
        dogStack.push("retriever");
        dogStack.push("beagle");
        System.out.println("Dog Items: " + dogStack.showStack());

        // Shows the popped item and new list
        final String topDog;
        topDog = dogStack.pop();
        System.out.println("Pop dog item: " + topDog);
        System.out.println("Dog Items: " + dogStack.showStack());

        // Check size of stack
        System.out.println("The size of the stack is: " + dogStack.size());

        // Check boolean is empty
        System.out.println("Is the stack empty? " + dogStack.isEmpty());

        // Show the program as done
        System.out.println("\nDone.");
    }
}
