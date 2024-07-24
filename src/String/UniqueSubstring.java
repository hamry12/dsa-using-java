package String;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstring {
    public static void main(String[] args) {
        String input="abc";
        int length=1;
        findUniqueSubString(input, length);
    }

    private static void findUniqueSubString(String input, int length) {
        int startIndex=0;
        int endIndex=length;
        Set<String> uniqueString=new HashSet<>();
        while(input.length()>=endIndex){
            uniqueString.add(input.substring(startIndex,endIndex));
            startIndex++;
            endIndex++;
        }
        System.out.println(uniqueString);

    }
}
