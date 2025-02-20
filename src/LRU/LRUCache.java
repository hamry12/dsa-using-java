package LRU;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private int capacity;
    private Map<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity){
        this.capacity=capacity;
        map= new HashMap<>();
        head= new Node(0, 0);
        tail= new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        Node node= map.get(key);
        removeNode(node);
        moveToFront(node);
        return node.value;
    }
// a->b->c->d
    public void removeNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void moveToFront(Node node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void put(int key, int value){
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            moveToFront(node);
        }else{
            if (map.size() == capacity) {
                Node lru = tail.prev;
                map.remove(lru.key);
                removeNode(lru);
            }

            Node newNode = new Node(key, value);
            map.put(key, newNode);
            moveToFront(newNode);
        }

    }

    public void display(){
        map.forEach((key, node)->{
            System.out.println("Key\t"+key+"\tvalue\t"+node.value);
        });
    }
}
