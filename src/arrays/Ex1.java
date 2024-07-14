package arrays;

public class Ex1 {

    /**
     *  Target Sum= Sum of two number
     */

    public static void main(String[] args) {
        int[] arr= {0, -1, 2, -3, 1};
        int targetSum=-2;
        System.out.println("---Solution 1 -----");
        solution1(arr, targetSum);
        System.out.println("---Solution 2 -----");
        solution2(arr, targetSum);
    }

    private static void solution2(int[] arr, int target) {
        int pointer1=0;
        int pointer2=arr.length-1;
        int length= arr.length;
        while(length>0){
            if(arr[pointer1]+arr[pointer2]>target){
                pointer1++;
            } else if (arr[pointer1]+arr[pointer2]<target) {
                pointer2--;
            }else{
                System.out.println("Elements " + arr[pointer1]+ "\t" + arr[pointer2]);
            }
            length--;
        }

    }

    private static void solution1(int[] arr, int target) {
        for (int i=0; i< arr.length;  i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Elements " + arr[i] + "\t" + arr[j]);
                }
            }
        }
    }
}
