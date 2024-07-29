package arrays;

import java.util.HashMap;
import java.util.Map;

public class SpecifiedCharacter {
    public static void main(String[] args) {
//        String input="This is a demo string";
//        int count=3;
//        char c='i';

        String input="geeksforgeeks";
        int count=2;
        char c='e';

        findSpecifiedStringAfterCondition(input, count, c);
    }

    private static void findSpecifiedStringAfterCondition(String input, int count, char c) {
        Map<Character, Integer> charMap=new HashMap<>();
        char[] charArray= input.toCharArray();
        int newIndex=0;
        StringBuilder finalResult= new StringBuilder();
        for(int i=0; i<input.length(); i++){
            if(charArray[i] == c){
                if(charMap.get(c)!=null && (Integer) charMap.get(c) == count){
                    break;
                }
                charMap.put(c, charMap.get(c)==null?1:(Integer) charMap.get(c)+1);
                newIndex=i;
            }
        }
        int characterCount=charMap.get(c);
        if(characterCount == count){
            input=input.substring(newIndex+1);
        }
        System.out.println(input);


    }
}
