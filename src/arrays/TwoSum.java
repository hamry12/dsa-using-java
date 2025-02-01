package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr= {4,13,11,9,21,38};
        int target= 30;
        bruteForceMethod(arr, target);
        int[] result=usingHashMap(arr, target);
        System.out.println(Arrays.toString(result));
    }

    private static void bruteForceMethod(int[] arr, int target) {
    }

    private static int[] usingHashMap(int[] arr, int target) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0; i< arr.length; i++){
            int result= target-arr[i];
            if(map.containsKey(result)){
                return new int[]{map.get(result), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
