package nagarro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
//        Map<String, Integer> map= new HashMap<>();

        String s="babdc";
        Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map.Entry<String, Long> stringLongEntry = collect
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue)).get();
        System.out.println(stringLongEntry);
    }
}
