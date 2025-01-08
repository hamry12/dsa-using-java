package wayfair;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car"; //A man, a plan, a canal: Panama
        isValidPalindrome(s);
    }

    private static void isValidPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder temp= new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            temp.append(s.charAt(i));
        }
        if(temp.toString().equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not A Palindrome!");
        }
    }
}
