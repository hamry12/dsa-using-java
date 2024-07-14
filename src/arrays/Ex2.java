package arrays;

/**
 * Kadane's Algorithm: find max sub array
 */

public class Ex2 {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
//        int[] arr= {5,4,1,7,8};

        int maxEndingHere=0, maxSoFar=0;
        for(int i=0; i<arr.length; i++){
            maxEndingHere=maxEndingHere+arr[i];

            if(maxEndingHere>maxSoFar){
                maxSoFar=maxEndingHere;
            }

            if(maxEndingHere < 0){
                maxEndingHere=0;
            }
        }
        System.out.println("Max So far\t"+maxSoFar);

    }
}
