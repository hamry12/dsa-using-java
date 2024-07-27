package arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int sum= -2;

        System.out.println("Result arr\t"+solution1(arr, sum));
        System.out.println("Result arr\t"+solution2(arr, sum));
    }

    private static boolean solution2(int[] arr, int sum) {
        int i=0;
        int j= arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]>sum){
                i++;
            } else if (arr[i]+arr[j]<sum) {
                j--;
            }else{
                return true;
            }
        }
        return false;
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
