package queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();
        priorityQueue.add(7);
        priorityQueue.add(3);
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(5);

        System.out.println(priorityQueue);
    }
}
