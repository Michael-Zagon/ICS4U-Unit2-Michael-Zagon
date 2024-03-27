/*
* This program uses a basic class to make an array of integers
*
* @author  Michael Zagon
* @version 1.0
* @since   2024-03-22
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
        // Add fruit stack
        final MrCoxallStack fruitStack = new MrCoxallStack();
        fruitStack.push("apple");
        fruitStack.push("banana");
        fruitStack.push("cherry");

        // Shows the fruit stack items
        System.out.println("fruit items: " + fruitStack.showStack());

        // Shows the popped item and new list
        String topFruit;
        topFruit = fruitStack.pop();
        System.out.println("popped fruit item: " + topFruit);
        System.out.println("fruit items: " + fruitStack.showStack());
        System.out.println("");

        // Add color stack
        final MrCoxallStack colorStack = new MrCoxallStack();
        colorStack.push("red");
        colorStack.push("green");
        colorStack.push("blue");

        // Shows the color stack items
        System.out.println("color items: " + colorStack.showStack());

        // Shows the popped item and new list
        String topColor;
        topColor = colorStack.pop();
        System.out.println("popped color item: " + topColor);
        System.out.println("color items: " + colorStack.showStack());
        System.out.println("");

        // Add dog stack
        final MrCoxallStack dogStack = new MrCoxallStack();
        dogStack.push("poodle");
        dogStack.push("retriever");
        dogStack.push("beagle");

        // Show the dog stack items
        System.out.println("dog items: " + dogStack.showStack());

        // Shows the popped item and new list
        String topDog;
        topDog = dogStack.pop();
        System.out.println("popped dog item: " + topDog);
        System.out.println("dog items: " + dogStack.showStack());
        System.out.println("");

        // Show the program as done
        System.out.println("\nDone.");
    }
}
