package streamapidemo.ex.io;

import java.util.List;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {

    public static long countEmptyStrings(Stream<String> stream) {
        return stream.filter(String::isEmpty).count();
    }

    public static long countStrings(Stream<String> stream, int length) {
        return stream.filter(s -> s.length() > length).count();
    }

    public static List<String> nonEmptyStringList(Stream<String> stream) {
        return stream.filter(s -> !s.isEmpty()).collect(Collectors.toList());
    }

    public static List<String> getStrings(Stream<String> stream, int length) {
        return stream.filter(s -> s.length() > length).collect(Collectors.toList());
    }

    public static List<Integer> getSquareList(Stream<Integer> stream) {
        return stream.map(n -> n * n).distinct().collect(Collectors.toList());
    }

    public static void showStatistics(Stream<Integer> stream) {
        IntSummaryStatistics stats = stream.mapToInt(x -> x).summaryStatistics();
        System.out.println("Statistics: " + stats);
    }
}
