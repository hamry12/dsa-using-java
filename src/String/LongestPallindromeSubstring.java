package String;

public class LongestPallindromeSubstring {
    public static void main(String[] args) {
        String s="baba";
        longestPallindrome(s);
    }

    private static void longestPallindrome(String s) {
        String longestPallindrome="";
        for(int i=0; i<s.length(); i++){
            String oddLength = expanstionAroundCenter(s, i, i);
            String evenLength = expanstionAroundCenter(s, i, i+1);

            // Update the longest palindrome found
            if (oddLength.length() > longestPallindrome.length()) {
                longestPallindrome = oddLength;
            }
            if (evenLength.length() > longestPallindrome.length()) {
                longestPallindrome = evenLength;
            }
        }
        System.out.println("longestPallindrome\t"+longestPallindrome);
        
    }

    private static String expanstionAroundCenter(String s, int low, int high) {
        while(low>=0 && high<s.length() && s.charAt(low) == s.charAt(high)){
            low--;
            high++;
        }
        return s.substring(low+1, high);
    }
}
