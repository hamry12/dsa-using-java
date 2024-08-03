package arrays;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr={
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        int row= arr.length;
        int col=arr[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==0){
                    arr=markColumns(arr, j);
                    arr=markRows(arr, i);
                }
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }

        for(int[] temp:arr){
            System.out.println(Arrays.toString(temp));
        }
    }

    private static int[][] markRows(int[][] arr, int i) {
        for(int j=0; j< arr.length; j++){
            arr[i][j]=-1;
        }
        return arr;
    }

    private static int[][] markColumns(int[][] arr, int j) {
        for(int i=0; i< arr.length; i++){
            arr[i][j]=-1;
        }
        return arr;
    }
}

