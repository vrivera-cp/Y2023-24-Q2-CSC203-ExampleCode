import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Double> numbers = Stream.of(1, 2, 3, 4)
                .filter(x -> x > 2)
                .map(x -> x * 2.0)
                .toList();
        System.out.println(numbers);
    }
}
