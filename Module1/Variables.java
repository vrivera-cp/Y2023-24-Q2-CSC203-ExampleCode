/**
 * Demonstrates simple variable assignment and data types.
 *
 * @author Vanessa Rivera
 */

public class Variables {
    public static void main(String[] args) {

        // Primitive Types
        boolean w = true;
        int x = 3;
        double y = 4.0;
        char z = 'A';

        // Expressions
        int a = 1 + 2 - 3;
        int b = 4 * 5 / 6;
        int c = (7 + 8) % 9;

        // Logical Operators
        boolean b1 = !true;
        boolean b2 = true && false;
        boolean b3 = true || false;

        // String Object and Methods
        String s = "Hello";
        int size = s.length();
        char last = s.charAt(4);
        boolean eq = s.equals("Hi");

        // Output
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println(s);
        System.out.println(size);
        System.out.println(last);
        System.out.println(eq);
    }
}