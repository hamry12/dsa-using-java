package arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        int column=4;
        int row=6;
        findNthRowAndNthColumn(row-1,column-1);
    }

    private static void findNthRowAndNthColumn(int row, int column) {
        int factN=findFactorialResult(row,column);
        int start=row-column;
        int factD=findFactorialResult(start, 0);
        System.out.println(factN/factD);
    }

    private static int findFactorialResult(int start, int condition) {
        int fact=1;
        for(int i=start; i>condition; i--){
            fact=fact*i;
        }
        return fact;
    }
}
