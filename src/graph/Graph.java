package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Graph {

    Map<String, List<String>> adjList=new HashMap<>();;

    public boolean addVertex(String vertex){
        if(adjList.get(vertex)==null){
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
//        solution1(vertex);
        if(adjList.get(vertex)!=null) {
            List<String> listOfVertices = adjList.get(vertex);
            for (String vertices : listOfVertices) {
                adjList.get(vertices).remove(vertex);
            }
            adjList.remove(vertex);
            return true;
        }
        return false;
    }

    private void solution1(String vertex) {
        if(adjList.get(vertex)!=null){
            adjList.remove(vertex);
            for(Map.Entry<String, List<String>> map: adjList.entrySet()){
                List<String> listOfVertices= (List<String>) map.getValue();
                listOfVertices.remove(vertex);
            }
        }
    }

    public boolean addEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }


    public void printGraph(){
        System.out.println(adjList);
    }
}
