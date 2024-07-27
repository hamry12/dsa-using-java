package arrays;

public class BuySellStock {
    public static void main(String[] args) {
//        int[] prices={7, 1, 5, 3, 6, 4};
        int[] prices={7, 6, 4, 3, 1};
        findBestTime(prices);
    }

    private static void findBestTime(int[] prices) {
        int min=prices[0];
        int newIndex=0;
        for(int i=1; i< prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
                newIndex=i;
            }
        }
        int maxDifference=0;
        for (int j=newIndex+1; j< prices.length; j++){
            if(prices[j]-min>maxDifference){
                maxDifference=prices[j]-min;
            }
        }
        System.out.println("Best Diff\t"+maxDifference);
    }
}
