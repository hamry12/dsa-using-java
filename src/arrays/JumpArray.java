package arrays;

public class JumpArray {
    public static void main(String[] args) {
//        int[] arr={2,3,1,1,4};
        int[] arr={3,2,1,0,4};
        int maxReach=arr[0];
        for(int i=0; i< arr.length && maxReach >=i; i++){
            int maxJump=i+arr[i];
            if(maxJump > maxReach){
                maxReach=maxJump;
            }
        }
        if(maxReach >= arr.length -1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
