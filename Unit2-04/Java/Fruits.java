/*
* This program uses a basic class to make an array of integers
*
* @author Michael Zagon
* @version 1.0
* @since 2024-04-01
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

        final MrCoxallStack fruitStack = new MrCoxallStack();

        // Check size of stack
        System.out.println("The size of the stack is: " + fruitStack.size());

        // Check boolean is empty
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());

        // Add fruit stack
        fruitStack.push("apple");
        fruitStack.push("banana");
        fruitStack.push("cherry");
        System.out.println("Fruit Items: " + fruitStack.showStack());

        // Look at the top element of the list
        System.out.println("The top value is " + fruitStack.peekItem());

        // Shows the popped item and new list
        final String topFruit;
        topFruit = fruitStack.pop();
        System.out.println("Pop fruit item: " + topFruit);
        System.out.println("Fruit Items: " + fruitStack.showStack());

        // Check size of stack
        System.out.println("The size of the stack is: " + fruitStack.size());

        // Check boolean is empty
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());

        // Clear the stack
        System.out.println("Emptying stack...");
        fruitStack.clearStack();

        // Check size of stack
        System.out.println("The size of the stack is: " + fruitStack.size());

        // Check boolean is empty
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());

        // Show the program as done
        System.out.println("\nDone.");
    }
}
