package wayfair;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBalloons {
    public static void main(String[] args) {

        String text="loonbalxballpoon";
        Map<String, Integer> map= new HashMap<>();
        map.put("b",0);
        map.put("a", 0);
        map.put("l", 0);
        map.put("o", 0);
        map.put("n", 0);

        String[] txtArr=text.split("");
        for (String s : txtArr) {
            if (map.containsKey(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        System.out.println(map);
        int min=map.get("b");
        min=Math.min(min,map.get("a"));
        min=Math.min(min,map.get("l")/2);
        min=Math.min(min,map.get("o")/2);
        min=Math.min(min,map.get("n"));

        System.out.println("min\t"+min);


    }
}
