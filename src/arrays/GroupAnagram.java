package arrays;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        List<String> list= Arrays.asList(
                "eat",
                "tea",
                "tan",
                "ate",
                "nat",
                "bat"
        );
        Map<String, List<String>> map= new HashMap();
        for (String s : list) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key=String.valueOf(charArray);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        System.out.println(map);
    }

}
