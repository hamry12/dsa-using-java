package linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public LinkedList(){
        head=tail=null;
        length=0;
    }

    /**
     * @param data
     * This would append the data to list
     */
    public void add(int data){
        Node node= new Node(data);
        if(head == null){
            head=tail=node;
            length=1;
            return;
        }
        tail.next=node;
        tail=tail.next;
        length++;
    }

    /**
     * @param index define the position at which data will be inserted
     * @param data
     */
    public void add(int index, int data){
        Node node= new Node(data);
        if(index < 0 && index > length){
            throw new RuntimeException("Index does not exist!!");
        }else if(index == length) {
            add(data);
        }else if(index == 0){
            node.next=head;
            head=node;
            length++;
        }else{
            if(head == null){
                head=tail=node;
                length=1;
                return;
            }
            Node currentNode=get(index-1);
            System.out.println("currentNode=>"+currentNode.data);
            node.next=currentNode.next;
            currentNode.next=node;
            length++;
        }
    }

    /**
     * @param position will be used to retrieve the node at position
     */
    public Node get(int position){
        Node temp=head;
        for(int jump=0; jump<position; jump++){
            temp=temp.next;
        }
        return temp;
    }

    /**
     * display List
     */
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.println();
    }

    /**
     * Find Middle Node in list
     */
    public Node findMiddleNode(){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    /**
     * To check if List has Loop
     */
    public boolean hasLoop(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    /**
     * @param position used to find the Kth Position
     */
    public Node findKthElement(int position) {
        Node fast=head;
        Node slow=head;
        for(int jump=0; jump<position; jump++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    /**
     * @param index
     * @param data
     */
    public void set(int index, int data) {
        Node node= new Node(data); //67
        Node currentNode=get(index); //9
        node.next=currentNode.next;
        currentNode.data=node.data;
        length++;
    }
}

// 9->67->10