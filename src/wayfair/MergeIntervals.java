package wayfair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
//        int[][] arr= {
//                {1,3},
//                {2,6},
//                {8,10},
//                {15,18}
//        };
        int[][] arr={
                {1,4},{4,5}
        };

        mergeIntervals(arr);


    }

    private static void mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(elements->elements[0]));
        int[] newInterval= intervals[0];
        List<int[]> result= new ArrayList<>();

        for(int[] data: intervals){
            if(data[0]<=newInterval[1]){
                newInterval[1]=Math.max(newInterval[1], data[1]);
            }else{
                result.add(newInterval);
                newInterval = data;
            }
        }
        result.add(newInterval);
        display(result.toArray(new int[result.size()][]));
    }

    public static void display(int[][] arr){
        for(int[] data: arr){
            System.out.println(Arrays.toString(data));
        }
    }
}
