package linkedlist;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        LinkedList list=new LinkedList();
//        list.add(5);
//        list.add(10);
//        list.add(17);
//        list.display();
//        list.add(0, 9);
//        list.display();
//        list.add(2, 32);
//        list.display();
//        list.add(4, 65);
//        list.display();
//        list.add(1, 24);
//        list.display();
//        System.out.println("Get Value at position 3\t"+list.get(3));
//        list.remove();
//        list.display();
//        System.out.println("Remove Element at 4th position");
//        list.remove(3);
//        list.display();
//        System.out.println("head\t"+list.head.data);
//        System.out.println("tail\t"+list.tail.data);
//        list.reverse();
//        list.display();


        LinkedList linkedList= new LinkedList();
        linkedList.add(20);
        linkedList.add(15);
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(8);
        linkedList.add(4);
        linkedList.add(13);
        linkedList.display();

        System.out.println(linkedList.head.data);
        System.out.println(linkedList.tail.data);
//        System.out.println("has Loop\t"+linkedList.hasLoop());

//        linkedList.removeNodeGreaterThanX(5);
//        linkedList.display();

    }
}
