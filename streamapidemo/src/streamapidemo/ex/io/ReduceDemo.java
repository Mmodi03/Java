package streamapidemo.ex.io;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 12, -3, 4, 15, -6, 7, 8);

        // Filtered Stream of Positive numbers
        Stream<Integer> positiveStream = intList.stream().filter(a -> a > 0);
        positiveStream.forEach(System.out::println);

        // Re-create the stream for each operation
        positiveStream = intList.stream().filter(a -> a > 0);

        // Reduce to return the maximum number
        Optional<Integer> result = positiveStream.reduce((a, b) -> a > b ? a : b);
        System.out.println(result.map(value -> "Maximum element is: " + value)
                                 .orElse("Stream is empty for given operation"));

        // Re-create the stream for summing positive numbers
        positiveStream = intList.stream().filter(a -> a > 0);

        // Reduce to sum of all positive numbers
        result = positiveStream.reduce(Integer::sum);
        System.out.println(result.map(value -> "Sum of all positive elements is: " + value)
                                 .orElse("Stream is empty for given operation"));

        // Filtered Stream of even numbers
        Stream<Integer> evenStream = intList.stream().filter(a -> a % 2 == 0);

        // Reduce to sum of even numbers
        result = evenStream.reduce(Integer::sum);
        System.out.println(result.map(value -> "Sum of all even elements is: " + value)
                                 .orElse("Stream is empty for given operation"));
    }
}
