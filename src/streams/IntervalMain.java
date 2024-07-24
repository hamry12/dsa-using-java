package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntervalMain {
    public static void main(String[] args) {
        List<Interval> intervalList= List.of(
                new Interval(5,7),
                new Interval(15,29),
                new Interval(7,9),
                new Interval(1,5),
                new Interval(12,15),
                new Interval(29,34),
                new Interval(9,12)
        );

        List<Interval> collect = intervalList
                .stream()
                .sorted(Comparator.comparing(Interval::getEnd))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
