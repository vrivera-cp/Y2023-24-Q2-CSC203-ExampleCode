import java.util.List;
import java.util.stream.Stream;

public class StreamAverageMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 400, 5);

        Double averageNoOutliers = numbers.stream()
                .filter(x -> x < 50) // Predicate<Integer>
                .map(Double::valueOf) // Function<Integer, Double>
                .reduce(0.0, (a, b) -> a + b); // BiFunction<Double, Double, Double>

        averageNoOutliers /= numbers.stream().filter(x -> x < 50).count();

        System.out.println(averageNoOutliers);
    }
}
