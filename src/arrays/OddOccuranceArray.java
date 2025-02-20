package arrays;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class OddOccuranceArray {
    public static void main(String[] args) {
        int[] arr={9,3,9,3,9,7,9};
//        Map<Integer, Integer> map= new HashMap<>();
//        for(int i=0; i< arr.length; i++){
//            int value=map.getOrDefault(arr[i], 1);
//            System.out.println(arr[i]+"=>value\t"+value);
//            if(value >= 2){
//                map.remove(arr[i]);
//            }else{
//                map.put(arr[i], ++value);
//            }
//        }
//        System.out.println("result\t"+map);

        Set<Integer> set= new LinkedHashSet<>();
        for (int j : arr) {
            if (!set.contains(j)) {
                set.add(j);
                continue;
            }
            set.remove(j);
        }
        System.out.println(set.stream().findFirst().orElse(0));
    }
}
