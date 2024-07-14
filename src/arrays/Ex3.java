package arrays;

import java.util.*;

public class Ex3 {

    /**
     * Best Time To Buy and Sell
     */

    public static void main(String[] args) {
        int[] arr={5, 3, 10, 2, 60, 8, 81};
        int minimum=arr[0];
        int newIndex=0;
        for(int i=1; i<arr.length; i++){
            if(minimum>arr[i]){
                minimum=arr[i];
                newIndex=i;
            }
        }


    }

}
