package arrays;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int[] prodArr= new int[arr.length];

        for(int i=0; i< arr.length; i++){
            int product=1;
            for(int j=0; j< arr.length; j++){
                if(arr[i]!=arr[j]){
                    product=product*arr[j];
                }
            }
            prodArr[i]=product;
        }
        System.out.println(Arrays.toString(prodArr));
    }
}
