package wayfair;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String input = "cbbd"; // babad ;
        String result = longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + result);
    }

    private static String longestPalindrome(String input) {
        if (input == null || input.length() < 1) {
            return "";
        }

        String longestPalindrome = "";

        for (int i = 0; i < input.length(); i++) {
            // Find the longest odd-length palindrome centered at i
            String oddPalindrome = expandAroundCenter(input, i, i);

            // Find the longest even-length palindrome centered at i and i+1
            String evenPalindrome = expandAroundCenter(input, i, i + 1);

            // Update the longest palindrome found so far
            if (oddPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }
            if (evenPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }

        return longestPalindrome;
    }

    private static String expandAroundCenter(String input, int low, int high) {
        while (low >= 0 && high < input.length() && input.charAt(low) == input.charAt(high)) {
            low--;
            high++;
        }
        // Return the palindrome substring
        return input.substring(low + 1, high);
    }
}
