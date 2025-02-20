package arrays;

import java.util.Arrays;

public class NumberSolitaire {
    public static void main(String[] args) {
        int[] A={1,-2,0,9,-1,-2};
        int[] dp= new int[A.length];
        for(int i =1; i<A.length; i++){
            int maxSum=0;
            for(int j=1; j<=6; j++){
                maxSum=Math.max(maxSum, A[j]);
                System.out.println("max sum\t"+maxSum);
            }
        }

        System.out.println(Arrays.toString(dp));

    }
}
