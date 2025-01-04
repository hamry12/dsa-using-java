package graph;

public class Main {
    public static void main(String[] args) {

        AdjacencyMatrix adjacencyMatrix= new AdjacencyMatrix(4);
        adjacencyMatrix.addEdges(1,2);
        adjacencyMatrix.addEdges(1, 4);
        adjacencyMatrix.addEdges(2,3);
        adjacencyMatrix.addEdges(3, 4);
        adjacencyMatrix.addEdges(2, 4);
        adjacencyMatrix.removeEdges(2,4);
        System.out.println("Initial Matrix");
        adjacencyMatrix.display();

        adjacencyMatrix.addVertex();
        adjacencyMatrix.addEdges(5, 1);
        adjacencyMatrix.addEdges(2, 5);
        System.out.println("After adding New Vertex");
        adjacencyMatrix.display();

        System.out.println("Removing Vertex");
        adjacencyMatrix.removeVertex(3);
        adjacencyMatrix.display();

    }
}
