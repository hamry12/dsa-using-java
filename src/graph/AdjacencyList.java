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
        while(!stack.isEmpty()){
            int top=stack.pop();
            if(!visitedList.contains(top))
                visitedList.add(top);

            List<Integer> findNeighbours=map.get(top);
            for(int i=0; i<findNeighbours.size(); i++){
                if(!visitedList.contains(findNeighbours.get(i))){
                    stack.push(findNeighbours.get(i));
                }
            }
        }
        System.out.println("Visited nodes: DFS:" + visitedList);
    }

    public void bfs(int startingVertex){
        Queue<Integer> queue= new LinkedList<>();
        List<Integer> visitedList= new ArrayList<>();
        queue.add(startingVertex);

        while(!queue.isEmpty()){
            Integer first= queue.poll();
            if(!visitedList.contains(first))
                visitedList.add(first);
            List<Integer> neighbouringElements= map.get(first);
            for(Integer element:neighbouringElements){
                if(!visitedList.contains(element)){
                    queue.add(element);
                }
            }
        }
        System.out.println("BFS: Visited List: "+visitedList);
    }
}
