package patterns;

public class Ex5 {
    /**
     *  print
     * |+++++++++++|
     * | * * * * * |
     * | * * * *   |
     * | * * *     |
     * | * *       |
     * | *         |
     * ++++++++++++
     */
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=5; j>i; j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
