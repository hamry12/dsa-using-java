package LRU;

public class Main {
    public static void main(String[] args) {
        LRUCache lruCache= new LRUCache(4);
        int result=lruCache.get(2);
        System.out.println("result\t"+result);
        lruCache.put(1,5);
        lruCache.put(2,7);
        lruCache.put(2,3);
        System.out.println("get 2\t"+lruCache.get(2));
        lruCache.display();
    }
}
