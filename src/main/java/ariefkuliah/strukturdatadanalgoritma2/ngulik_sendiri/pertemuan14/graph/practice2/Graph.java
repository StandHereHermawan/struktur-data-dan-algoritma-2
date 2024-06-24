package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan14.graph.practice2;

public class Graph {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    // Method untuk menambahkan edge ke graph dengan bobot tertentu
    public void addEdge(int src, int dest, int weight) {
        adjacencyMatrix[src][dest] = weight;
        // Jika graph tidak berarah, tambahkan juga edge dari dest ke src
        adjacencyMatrix[dest][src] = weight;
    }

    // Method untuk menghitung jumlah berat dari semua vertex
    public int sumVertexWeights() {
        int sum = 0;
        // Looping melalui adjacency matrix untuk menghitung total bobot
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                sum += adjacencyMatrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int numVertices = 4;
        Graph graph = new Graph(numVertices);

        // Menambahkan edge dan bobotnya
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 20);
        graph.addEdge(1, 2, 30);
        graph.addEdge(2, 3, 40);

        // Menghitung jumlah bobot vertex
        int sum = graph.sumVertexWeights();
        System.out.println("Jumlah bobot semua vertex: " + sum);
    }
}
