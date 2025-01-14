package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftArrayRot {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(
                1,2,3,4,5
        );
        int times=9;
        int remainderTimes=times % arr.size();
        System.out.println("remainder\t"+remainderTimes);
//        leftRotate(arr, remainderTimes);
        method1(arr, remainderTimes);
    }

    private static void method1(List<Integer> arr, int remainderTimes) {
        List<Integer> temp= new ArrayList<>();
        for(int i=0; i<remainderTimes; i++){
            temp.add(i, arr.get(i));
        }

        System.out.println("Temp\t"+temp);

        for(int i=remainderTimes; i< arr.size(); i++){
            arr.set(i-remainderTimes, arr.get(i));
        }

        for(int i=0; i<temp.size(); i++){
            arr.set(i+1, temp.get(i));
        }

        System.out.println("Solution From Method 1\t"+arr);
    }

    private static void leftRotate(List<Integer> arr, int times) {
        setRotationFromleft(arr, times);
    }


    private static void setRotationFromleft(List<Integer> arr, int remainderTimes) {
        for(int k=1; k<=remainderTimes; k++) {
            int temp = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                arr.set(i - 1, arr.get(i));
            }
            arr.set(arr.size() - 1, temp);
        }
        System.out.println("After "+remainderTimes+" Rotation \t"+arr);
    }
}
