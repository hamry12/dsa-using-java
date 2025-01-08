package graph;

public class Main {
    public static void main(String[] args) {
//        adjacencyMatrixMethod(new AdjacencyMatrix(4));
        adjacencyListMethod(new AdjacencyList());

    }

    private static void adjacencyListMethod(AdjacencyList adjacencyList) {
        adjacencyList.addVertex(1);
        adjacencyList.addVertex(2);
        adjacencyList.addVertex(3);
        adjacencyList.addVertex(4);
        System.out.println("#### Adding Edges ###########");
        adjacencyList.addEdges(1,2);
        adjacencyList.addEdges(1,4);
        adjacencyList.addEdges(2,3);
        adjacencyList.addEdges(3,4);
        adjacencyList.addEdges(2,4);
        adjacencyList.display();
        System.out.println("###########Remove Edge############");
        adjacencyList.removeEdges(2,4);
        adjacencyList.display();
        System.out.println("###### Remove Vertex #######");
        adjacencyList.removeVertex(4);
        adjacencyList.display();

    }

    private static void adjacencyMatrixMethod(AdjacencyMatrix adjacencyMatrix) {
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
