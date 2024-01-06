/**
 * Demonstrates the usage of lists.
 *
 * @author Vanessa Rivera
 */

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        // Initialization using static ‘List.of()’
        ArrayList<Integer> a = new ArrayList<>(List.of(1, 2, 3));
        LinkedList<Double> b = new LinkedList<>(List.of(1., 2., 3.));

        // Polymorphism
        List<Character> c = new ArrayList<>();
        List<String> d = new LinkedList<>();
        c.add('c');
        d.add("d");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
