package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList {

    private Map<Integer, List<Integer>> map;

    public AdjacencyList(){
        this.map= new HashMap<>();
    }

    public void addVertex(int data){
        map.put(data, new ArrayList<>());
    }

    public void display(){
        map.forEach((key, value) -> System.out.println(key + "\t" + value));
    }
}
