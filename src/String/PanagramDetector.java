package String;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class PanagramDetector {
    public static void main(String[] args) {
        String alphabetSet="abcdefghijklmnopqrstuvwxyz";
        String input="Online test with GS client";
        findMissingLetter(input, alphabetSet);
    }

    private static void findMissingLetter(String input, String alphabetSet) {
        input=input.toLowerCase(Locale.ROOT);
        input=input.replaceAll(" ", "");

        String[] inputArr=alphabetSet.split("");
        Set<String> missingSet=new HashSet<>();
        for(String temp: inputArr){
            if(!input.contains(temp)){
                missingSet.add(temp);
            }
        }
        System.out.println(missingSet);
    }
}
