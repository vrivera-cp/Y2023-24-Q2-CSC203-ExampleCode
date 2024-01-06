/**
 * Demonstrates the usage of control structures.
 *
 * @author Vanessa Rivera
 */

public class ControlStructures {
    public static void main(String[] args) {
        // A conditional loop
        if (100 < 10) {
            System.out.println("a");
        } else if (100 < 1000) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }

        // The ternary operator
        char result = 100 == 10 ? 'a' : 'b';
        System.out.println(result);

        // A while loop
        int i = 0;
        while (i < 10) {
            System.out.println(i); // Outputs 0 - 9, inclusive
            i++; // Increment Operator
        }

        // A do while loop
        int j = 10;
        do {
            System.out.println(j); // Outputs 10 - 1, inclusive
            j--; // Decrement Operator
        } while (j > 0);

        // A traditional for loop
        for (int k = 0; k < 10; k++) {
            System.out.print(k + " ");
        }

        // An enhanced for loop
        int[] integers = {1, 2, 3}; // An array
        for (int integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
