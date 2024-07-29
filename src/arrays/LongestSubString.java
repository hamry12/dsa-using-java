package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String input="abcabcbb";
        String[] arr = input.split("");
        List<String> list= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            Map<String, Integer> map= new HashMap<>();
            map.put(arr[i], 1);
            String substrings=arr[i];
            for(int j=i+1; j< arr.length; j++){
                if(!map.containsKey(arr[j])){
                    substrings=substrings.concat(arr[j]);
                    map.put(arr[j], 1);
                }else{
                    break;
                }
            }
            list.add(substrings);
        }
        System.out.println(list);
    }
}
