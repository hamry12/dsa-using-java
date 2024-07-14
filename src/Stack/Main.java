package Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack= new Stack(23);
        stack.push(2);
        stack.push(56);
        stack.printStack();
        System.out.println("Top:\t"+stack.getTop());
        System.out.println("Height:\t"+stack.getHeight());
        stack.pop();
        stack.printStack();
        System.out.println("Top:\t"+stack.getTop());
        System.out.println("Height:\t"+stack.getHeight());
        stack.pop();
        stack.printStack();
        System.out.println("Top:\t"+stack.getTop());
        System.out.println("Height:\t"+stack.getHeight());
    }
}
