package linkedlist;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.add(20);
        linkedList.add(15);
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(8);
        linkedList.add(4);
        linkedList.add(13);
        linkedList.add(19);
        linkedList.display();

        System.out.println("Middle\t"+linkedList.findMiddle().data);
//        linkedList.reverse();
//        linkedList.display();

    }
}
