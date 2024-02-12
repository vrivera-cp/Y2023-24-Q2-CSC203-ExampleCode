import java.util.function.*;

public class BuiltInInterfaces {
    public static void main(String[] args) {
        Function<Integer, Double> f1 = x -> 2.0 * x;
        System.out.println(f1.apply(10)); // Output: '20.0'

        Predicate<Double> f2 = y -> y > 0.0;
        System.out.println(f2.test(-100.0)); // Output: 'False'

        BiPredicate<String, Integer> f3 = (a, b) -> a.length() > b;
        System.out.println(f3.test("mochi", 3)); // Output: 'True'

        Consumer<String> f4 = z -> System.out.println(z);
        f4.accept("Hello, world!"); // Output: 'Hello, world!'

        Consumer<String> f5 = System.out::println; // Method reference
        f5.accept("Hello, world!"); // Output: 'Hello, world!'
    }
}
