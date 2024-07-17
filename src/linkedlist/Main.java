package linkedlist;
public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(5);
        list.add(10);
        list.add(17);
        list.display();
        list.add(0, 9);
        list.display();
        list.add(2, 32);
        list.display();
        list.add(4, 65);
        list.display();
        list.add(1, 24);
        list.display();
        System.out.println("Get Value at position 3\t"+list.get(3));
        list.remove();
        list.display();
        System.out.println("Remove Element at 4th position");
        list.remove(3);
        list.display();
        System.out.println("head\t"+list.head.data);
        System.out.println("tail\t"+list.tail.data);
        list.reverse();
        list.display();
    }
}
