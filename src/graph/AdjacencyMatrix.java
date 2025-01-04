package graph;

public class AdjacencyMatrix {

    private int[][] adjacentMatrix;

    private int verticesNumber;

    public AdjacencyMatrix(int verticesNumber){
        this.verticesNumber=verticesNumber;
        this.adjacentMatrix= new int[verticesNumber][verticesNumber];
    }

    public void addEdges(int source, int destination){
        source=source-1;
        destination=destination-1;
        adjacentMatrix[source][destination]=1;
        adjacentMatrix[destination][source]=1;
    }

    public void removeEdges(int source, int destination){
        source=source-1;
        destination=destination-1;
        adjacentMatrix[source][destination]=0;
        adjacentMatrix[destination][source]=0;
    }

    public void display(){
        for (int[] matrix : adjacentMatrix) {
            for (int i : matrix) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public void addVertex() {
        int[][] newMatrix= new int[verticesNumber+1][verticesNumber+1];
        for(int i=0; i<adjacentMatrix.length; i++){
            System.arraycopy(adjacentMatrix[i], 0, newMatrix[i], 0, adjacentMatrix[i].length);
        }
        adjacentMatrix=newMatrix;
        verticesNumber++;
    }

    public void removeVertex(int vertex) {
        if (vertex < 0 || vertex >= verticesNumber) {
            throw new IllegalArgumentException("Vertex index out of bounds.");
        }
        int[][] newMatrix = new int[verticesNumber - 1][verticesNumber - 1];
        int newRow = 0;
        for (int i = 0; i < verticesNumber; i++) {
            if (i == vertex) continue; // Skip the row corresponding to the vertex
            int newCol = 0;
            for (int j = 0; j < verticesNumber; j++) {
                if (j == vertex) continue; // Skip the column corresponding to the vertex
                newMatrix[newRow][newCol] = adjacentMatrix[i][j];
                newCol++;
            }
            newRow++;
        }
        adjacentMatrix = newMatrix;
        verticesNumber--;
    }

}
