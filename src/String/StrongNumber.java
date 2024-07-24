package String;

public class StrongNumber {
    public static void main(String[] args) {
        
        int number=145;
        findStrongNumber(number);
    }
    
    private static void findStrongNumber(int number) {
        int temp=number;
        int sum=0;
        while(temp>0){
            int remainder=temp%10;
            temp=temp/10;
            sum=sum+findFactorial(remainder);
        }
        if(sum == number){
            System.out.println("Strong Number\t"+number);
        }else{
            System.out.println("Not a Strong Number\t"+number);
        }
    }

    private static int findFactorial(int remainder) {
        int fact=1;
        for(int i=1; i<=remainder; i++){
            fact=fact*i;
        }
        return fact;
    }
}
