package recurssion;

public class ReverseArray {
    static int count=0;
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int length= arr.length;
        reverseArray(arr, length);
    }

    private static void reverseArray(int[] arr, int length) {
        if(length-1 < count){
            return;
        }
        System.out.print(arr[count]+"\t");
        count++;
        reverseArray(arr, length);
    }
}
