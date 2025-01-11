package graph;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class AdjacencyList {

    private Map<Integer, List<Integer>> map;

    public AdjacencyList(){
        this.map= new ConcurrentHashMap<>();
    }

    public void addVertex(int data){
        map.put(data, new ArrayList<>());
    }

    public void removeVertex(int data){
        List<Integer>listOfNodes=map.get(data);
        for(Integer each: new LinkedHashSet<>(listOfNodes)){
            removeEdges(each, data);
        }
        map.remove(data);
    }

    public void addEdges(int source, int destination){
        map.get(source).add(destination);
        map.get(destination).add(source);
    }

    public void removeEdges(int source, int destination){
        map.get(source).remove(Integer.valueOf(destination));
        map.get(destination).remove(Integer.valueOf(source));
    }

    public void display(){
        map.forEach((key, value) -> System.out.println(key + "->" + value));
    }

    public Integer size(){
        return map.size();
    }


    public void dfs(int startingVertex) {
        Stack<Integer> stack= new Stack<>();
        List<Integer> visitedList= new ArrayList<>();

        stack.push(startingVertex);

        while (!stack.isEmpty()) {
            // Pop the top element
            int currentNode = stack.pop();

            // Check if the node is already visited
            if (!visitedList.contains(currentNode)) {
                // Mark the node as visited
                visitedList.add(currentNode);

                // Get all neighboring nodes
                List<Integer> neighbouringNodes = map.getOrDefault(currentNode, new ArrayList<>());

                // Push unvisited neighbors onto the stack
                for (Integer neighbour : neighbouringNodes) {
                    if (!visitedList.contains(neighbour)) {
                        stack.push(neighbour);
                    }
                }
            }
        }
        System.out.println("Visited nodes: " + visitedList);
    }
}
