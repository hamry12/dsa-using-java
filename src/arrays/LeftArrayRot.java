package arrays;

import java.util.Arrays;
import java.util.List;

public class LeftArrayRot {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(
                1,2,3,4,5
        );
        int times=2;
        leftRotate(arr, times);
    }

    private static void leftRotate(List<Integer> arr, int times) {
        System.out.println("Before Rotation\t"+arr);
        int size=arr.size();
        for(int j=0; j<times; j++) {
            int temp = arr.get(0);
            for (int i = 1; i < size; i++) {
                arr.set(i - 1, arr.get(i));
            }
            arr.set(size - 1, temp);
        }
        System.out.println("After "+times+" Rotation \t"+arr);
    }
}
