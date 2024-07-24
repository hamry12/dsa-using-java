package String;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String input="AABBBCDDD";
        String collect = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey().concat(String.valueOf(e.getValue())))
                .collect(Collectors.joining(""));

        System.out.println(collect);

    }
}
