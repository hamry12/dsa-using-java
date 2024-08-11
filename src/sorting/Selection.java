package sorting;

import java.util.Arrays;

public class Selection {

    /**
     * 1. Find the minimum Element from the array
     * 2. swap the element at first position if true
     * 3. repeat the steps with rest of other element till the array is sorted
     */

    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};

        for(int i=0; i< arr.length; i++){
            int min=i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
