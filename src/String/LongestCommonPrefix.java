package String;

import java.util.Arrays;
import java.util.Objects;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] input={"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] input= {"apple", "ape", "april"};
        Arrays.sort(input);
        System.out.println("Sorted Array\t"+Arrays.toString(input));
        String[] first=input[0].split("");
        String[] last=input[input.length-1].split("");
        String commonPrefix="";
        for(int i =0; i< input.length; i++){
            if(Objects.equals(first[i], last[i])){
                commonPrefix=commonPrefix+first[i];
            }else{
                break;
            }
        }
        System.out.println(commonPrefix);
    }
}
