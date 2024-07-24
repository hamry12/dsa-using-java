package String;

import java.util.Arrays;

public class ArrayMedian {
    public static void main(String[] args) {
        int[] arr1={2,3,6,7,9};
        int[] arr2={1,4,8,10};

        int[] mergedArray=mergeArray(arr1, arr2);
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));

        findMedian(mergedArray);
    }

    private static void findMedian(int[] mergedArray) {
        int length=mergedArray.length;
        int medianIndex=0;
        int prevIndex=0;
        if(length % 2 == 1){
            medianIndex= length/2;
            System.out.println("Median\t"+mergedArray[medianIndex]);
        }else{
            medianIndex=length/2;
            prevIndex=(length/2)-1;
            int result=(mergedArray[prevIndex]+mergedArray[medianIndex])/2;
            System.out.println("Median\t"+result);
        }
    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] mergedArray= new int[arr1.length+arr2.length];
        int firstArrayLength= arr1.length;
        int secondArrayLength= arr2.length;
        for(int i=0; i<mergedArray.length; i++){
            if(firstArrayLength > 0)
                mergedArray[i]=arr1[i];
            if(secondArrayLength > 0)
                mergedArray[arr1.length+i]=arr2[i];
            secondArrayLength--;
            firstArrayLength--;
        }
        return mergedArray;
    }
}
