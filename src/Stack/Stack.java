package Stack;

public class Stack {
    Node top;
    int height;

    public Stack(int data){
        top= new Node(data);
        height=1;
    }

    public void push(int data){
        Node newNode= new Node(data);
        if (height != 0) {
            newNode.next = top;
        }
        top= newNode;
        height++;
    }

    public void pop(){
        if(height == 0){
            System.out.println("Empty Stack!!!!");
            return;
        }
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
    }

    public void printStack(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
        System.out.println();
    }

    public int getHeight(){
        return height;
    }

    public int getTop(){
        return top.data;
    }
}
