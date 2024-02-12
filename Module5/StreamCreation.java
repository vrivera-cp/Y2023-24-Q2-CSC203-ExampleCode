import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        Stream<Integer> a = Stream.of(1, 2, 3);

        List<Double> doubles = List.of(1.0, 2.0, 3.0);
        Stream<Double> b = doubles.stream();

        Stream.Builder<String> builder = Stream.builder();
        builder.add("A"); builder.add("B"); builder.add("C");
        Stream<String> c = builder.build();

        a.forEach(System.out::println);
        b.forEach(System.out::println);
        c.forEach(System.out::println);
    }
}
