package slidingwindow;

public class MaxContigousSubArray {

    public static void main(String[] args) {
        int[] nums={1, 12, -5, -6, 50, 3};
        int kSize=4;
        findMaxContigousSubArray(nums, kSize);
    }

    private static void findMaxContigousSubArray(int[] nums, int kSize) {
        int sum=0;
        int max;
        for(int i=0; i<kSize; i++){
            sum+=nums[i];
        }
        max=sum;
        int startSize=0;
        int endSize=kSize;
        while(endSize<nums.length){
            sum-=nums[startSize];
            startSize++;

            sum+=nums[endSize];
            endSize++;
            max=Math.max(sum,max);
        }
        double averageSubArray= (double) max /kSize;
        System.out.println("Highest Average for subarray\t"+averageSubArray);

    }

}
