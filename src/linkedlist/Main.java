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
        list.remove(3);
        list.display();
        list.remove(0);
        list.display();

//        int middleElement=list.findMiddleNode().data;
//        System.out.println("Middle Element:\t"+middleElement);
//
//        boolean hasLoop= list.hasLoop();
//        System.out.println("has Loop:\t"+hasLoop);
//
//        Node kthNode=list.findKthElement(5);
//        if(kthNode!=null){
//            System.out.println("Kth Node Element\t"+kthNode.data);
//        }
//
//        list.set(1, 67);
//        list.display();
    }
}
