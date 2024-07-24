package String;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
    public static void main(String[] args) {
        int number=100;
        findPerfectNumber(number);
    }

    private static void findPerfectNumber(int number) {
        for(int i=2; i<=number; i++){
            List<Integer> divisorList= findDivisible(i);
            int sum = divisorList.stream().mapToInt(num -> num).sum();
            if(sum == i){
                System.out.println("perfect number\t"+i);
            }
        }
    }

    private static List<Integer> findDivisible(int number) {
        List<Integer> divisorList=new ArrayList<>();
        for(int i=1; i<number; i++){
            if(number % i == 0){
                divisorList.add(i);
            }
        }
        return divisorList;
    }
}
