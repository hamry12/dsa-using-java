package String;

public class MinimumMoves {
    public static void main(String[] args) {

        /**
         * find the minimum move required to convert a string
         * from X->O; for example: if String s='XXOX'--> the final String would be 'OOOO'
         * and this would take two moves. So answer would be 2
         */

        String s="XXOX";
        findMinMoves(s);
    }

    private static void findMinMoves(String s) {
        int moves=0;
        for(int i=0; i<s.length()-2; i++) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 2;
            }
        }
        System.out.println("Moves\t"+moves);
    }
}
