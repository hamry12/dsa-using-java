package recurssion;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str = "TAKE U FORWARD";
        str=str.toLowerCase(Locale.ROOT).replaceAll("\\s", "");
        String reverseStr=getReverse(str.split(""), "", str.length());
        System.out.println("Palindrome\t"+reverseStr.equalsIgnoreCase(str));
    }

    private static String getReverse(String[] str, String reversedStr, int length) {
        if(length<1){
            return reversedStr;
        }
        reversedStr=reversedStr+str[length-1];
        return getReverse(str, reversedStr, length-1);
    }
}
