package patterns;

public class Ex1 {
    /**
     *  print
     * |+++++++++++|
     * | * * * * * |
     * | * * * * * |
     * | * * * * * |
     * | * * * * * |
     * | * * * * * |
     * ++++++++++++
     */
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
