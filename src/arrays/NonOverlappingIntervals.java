package arrays;

import java.util.*;
import java.util.stream.Collectors;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr1={ {1, 3}, {2, 4}, {3, 5}, {7, 9} };
//        int[][] arr1={ {1, 3}, {9, 12}, {2, 4}, {6, 8} };
        int[] flattenedArray = Arrays.stream(arr1).flatMapToInt(Arrays::stream).sorted().toArray();
        System.out.println("array\t"+Arrays.toString(flattenedArray));

        for (int i = 1; i < flattenedArray.length; i++) {
            System.out.println(flattenedArray[i]);
            System.out.println(flattenedArray[i - 1]);
            if (flattenedArray[i] - flattenedArray[i - 1] > 1) {
                System.out.print(flattenedArray[i - 1]+"\t");
            }
            System.out.println();
        }

    }
}
