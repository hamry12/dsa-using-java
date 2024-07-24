package String;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="Good day day bye bye";
        Set<String> setOfUnique= new HashSet<>();
        Collections.addAll(setOfUnique, str.split(" "));
        System.out.println(setOfUnique);
    }
}
