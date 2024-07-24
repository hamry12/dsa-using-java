package String;

public class Permutation {
    public static void main(String[] args) {
        String str = "abb";
        printPermutation(str, "");
    }

    private static void printPermutation(String str, String s1) {

        if (str.isEmpty()) {
            System.out.print(s1 + " ");
            return;
        }

        for(int i=0; i< str.length(); i++){
            char ch=str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            printPermutation(ros, s1 + ch);
        }

    }


}
