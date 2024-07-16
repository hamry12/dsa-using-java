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
     * @param index position at which data will be inserted
     * @param data which would be inserted
     */
    public void add(int index, int data){
        Node node= new Node(data);
        if(index < 0 || index > length){
            throw new RuntimeException("Index out of Bound!!");
        }else if(index == length) {
            add(data);
        } else if (index == 0) {
            prepend(data);
        }else {
            Node temp=head;
            Node pre=head;
            for(int i=0; i<index; i++){
                pre=temp;
                temp=temp.next;
            }
            pre.next=node;
            node.next=temp;
            length++;
        }
    }

    /**
     * @param data
     * This would append the data to list at first position
     */
    public void prepend(int data){
        Node node= new Node(data);
        node.next=head;
        head=node;
        length++;
    }

    /**
     * @param position will be used to retrieve the node at position
     */
    public Integer get(int position){
        if(length == 0){
            throw new RuntimeException("Empty List");
        }
        Node temp=head;
        for(int i=0; i<position; i++){
            temp=temp.next;
        }
        return temp.data;
    }

    /**
     * display List
     */
    public void display(){
        if(length == 0){
            throw new RuntimeException("Empty List");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    /**
     * remove data from the list at the end
     */
    public void remove(){
        if(length == 0){
            throw new RuntimeException("Empty List");
        }
        if(length == 1){
            head=tail=null;
            length=0;
            return;
        }
        Node temp=head;
        Node prev=head;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        length--;
    }

    /**
     * @param position remove data at specified position
     * remove data at position from the list at the end
     */
    public void remove(int position){
        Node temp=head;
        Node prev=head;
        if(length == 0){
            throw new RuntimeException("Empty List");
        }
        if(position < 0 && position > length){
            throw new RuntimeException("Index out of bound!!");
        }
        if(length == 1){
            head=tail=null;
            length=0;
            return;
        }
        if(position == 0){
            head = head.next;
        }else {

            for (int i = 0; i < position; i++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
        }
        length--;
    }

    /**
     * @param index position at which data would be set/replaced
     * @param data value which would be stored
     */
    public void set(int index, int data) {

    }

    public void reverse(){

    }
}
