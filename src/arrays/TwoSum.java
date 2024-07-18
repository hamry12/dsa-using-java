package arrays;

public class TwoSum {
    public static void main(String[] args) {
//        int arr[] = {0, -1, 2, -3, 1};
//        int sum= -2;

        int[] arr={1, -2, 1, 0, 5};
        int sum=0;

        System.out.println("Result arr\t"+solution1(arr, sum));
    }

    private static boolean solution1(int[] arr, int sum) {
        for(int i=1; i< arr.length; i++){
            if(arr[i-1]+arr[1] == sum){
                return true;
            }
        }
        return false;
    }
}
