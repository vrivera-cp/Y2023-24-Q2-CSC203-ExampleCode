import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ComparatorMain {
    public static void main(String[] args) {
        Comparator<Integer> c = (a, b) -> {
            if (a < b) return -1;
            if (a > b) return 1;
            return 0;
        };

        System.out.println(c.compare(1, 2));
        System.out.println(c.compare(2, 1));
        System.out.println(c.compare(1, 1));

        c = (a, b) -> a - b; // Same Effect

        List<Integer> numbers = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 10; i++) numbers.add(r.nextInt(10));

        System.out.println("Unsorted: " + numbers);
        numbers.sort(c);
        System.out.println("Sorted: " + numbers);
    }
}
