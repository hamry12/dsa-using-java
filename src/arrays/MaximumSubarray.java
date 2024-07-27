package arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        findMaximumSubArray(arr);
    }
/**
 * Kadane's Algo:
 */
    private static void findMaximumSubArray(int[] arr) {
        int max_ending_here=0;
        int max_so_far=0;
        for(int i=0; i< arr.length; i++){
            max_ending_here=max_ending_here+arr[i];
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here=0;
            }
        }
        System.out.println("Max So Far\t"+max_so_far);
    }
}
