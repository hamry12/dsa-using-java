package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private static AdjacencyList adjacencyList;

    public static void main(String[] args) {
        adjacencyList = new AdjacencyList();

        //1. Creating 7 vertex
        createVertex(7);

        //2. Add Edges
        addEdges();

        //3. Display
        adjacencyList.display();

        //4. DFS
        adjacencyList.dfs(1);


    }

    private static void addEdges() {
        adjacencyList.addEdges(1, 2);
        adjacencyList.addEdges(1,3);
        adjacencyList.addEdges(1,4);
        adjacencyList.addEdges(2,5);
        adjacencyList.addEdges(4,6);
        adjacencyList.addEdges(4,7);
        adjacencyList.addEdges(6,7);
    }

    private static void createVertex(int vertex) {
        for(int i=1; i<=vertex; i++){
            adjacencyList.addVertex(i);
        }
    }
}
