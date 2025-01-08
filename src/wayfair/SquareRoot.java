package wayfair;

public class SquareRoot {
    public static void main(String[] args) {
        int x=2147395599;
        int result=findSquareRoot(x);
        System.out.println("Square Root\t"+result);
    }

    private static int findSquareRoot(int x) {
        int mid=x/2;
        int sqrt = 1;
        if(mid * mid == x)
            return mid;
        else{
            for (int i = 1; i<=mid; i++){
                long result= (long) i *i;
                if(result<=x && result >= sqrt){
                    sqrt=i;
                }
            }
        }
        return sqrt;
    }
}
