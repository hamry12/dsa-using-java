package linkedlist;

public class Intersection {
    public static void main(String[] args) {
        LinkedList listA= new LinkedList();
        LinkedList listB= new LinkedList();

        listA.add(14);
        listA.add(13);
        listA.add(9);

        listB.add(24);
        listB.add(11);
        listB.add(14);
        listB.add(13);
        listB.add(9);
        createIntersection(listA, listB, 14);
        findIntersection(listA, listB);
    }

    public static void createIntersection(LinkedList listA, LinkedList listB, int intersectionStartValue) {
        Node commonStart = findNodeWithValue(listA.head, intersectionStartValue);
        if (commonStart == null) {
            throw new IllegalArgumentException("Intersection start node not found in List A");
        }

        // Attach the common part to List B
        Node currentB = listB.head;
        while (currentB != null && currentB.next != null) {
            currentB = currentB.next;
        }

        if (currentB != null) {
            currentB.next = commonStart;
        }
    }

    private static Node findNodeWithValue(Node head, int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private static void findIntersection(LinkedList listA, LinkedList listB) {
        int m=listA.getLength();
        int n=listB.getLength();
        Node headB= listB.head;
        Node headA= listA.head;
        if(m <= n){
            for(int i=0; i<(n-m); i++){
                headB=headB.next;
            }
        }else{
            for(int i=0; i<(m-n); i++){
                headA=headA.next;
            }
        }
        System.out.println("New Head of list B\t"+headB.data);
        System.out.println("New Head of list A\t"+headA.data);

        while(headB!=null && headA!=null){
            if(headB == headA){
                System.out.println("Intersection Found\t"+headB.data+"\t"+headA.data);
                return;
            }
            headB=headB.next;
            headA=headA.next;
        }
        System.out.println("No Intersection Found!!!!");
    }
}
