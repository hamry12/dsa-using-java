package arrays;

import java.util.Arrays;

public class BooleanMatrix {
    public static void main(String[] args) {
        int[][] arr= {
            {1, 0},
            {0, 0}
        };
        System.out.println("Before Setting One");
        display(arr);
        setMatrixZero(arr);
    }

    private static void setMatrixZero(int[][] arr) {
        int rows= arr.length;
        int column=arr[0].length;
        for(int i=0;i<rows; i++){
            for(int j=0; j<column; j++){
                if(arr[i][j] == 1){
                    arr=markRow(arr, i);
                    arr=markColumn(arr, j);
                }
            }
        }
        markOne(arr, rows, column);
    }

    private static void markOne(int[][] arr, int rows, int column) {
        for(int i=0;i<rows; i++){
            for(int j=0; j<column; j++){
//                System.out.print(arr[i][j]+"\t");
                if(arr[i][j] == -1){
                    arr[i][j] = 1;
                }
            }
        }
        display(arr);
    }

    private static int[][] markColumn(int[][] arr, int j) {
        for(int i=0; i< arr.length; i++){
            if(arr[i][j]== 0){
                arr[i][j]=-1;
            }
        }
        return arr;
    }

    private static int[][] markRow(int[][] arr, int i) {
        for(int j=0; j< arr.length; j++){
            if(arr[i][j]== 0){
                arr[i][j]=-1;
            }
        }
        return arr;
    }

    private  static void display(int[][] arr){
        int rows= arr.length;
        int column=arr[0].length;
        for(int i=0;i<rows; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
