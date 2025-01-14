package arrays;

import java.util.*;

public class TwoCharacters {
    public static void main(String[] args) {
        String str="beabeefeab";
        findMaxString(str);
    }
    private static void findMaxString(String str) {
        int maxLength=Integer.MIN_VALUE;
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        Character[] chars= uniqueChars.toArray(new Character[0]);
        for(int i=0; i< chars.length; i++){
            for(int j=i+1; j< chars.length; j++){
                int length=findLength(str, chars[i], chars[j]);
                maxLength=Math.max(length, maxLength);
            }
        }
        System.out.println("Max Length\t"+maxLength);
    }

    private static int findLength(String str, Character aChar, Character bChar) {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<str.toCharArray().length; i++){
            if(str.charAt(i) == aChar || str.charAt(i) ==bChar){
                sb.append(str.charAt(i));
            }
        }

        String filteredString=sb.toString();
        for(int j=1; j<filteredString.length() ; j++){
            if(filteredString.charAt(j-1) == filteredString.charAt(j)){
                return 0;
            }
        }
        return filteredString.length();
    }
}
