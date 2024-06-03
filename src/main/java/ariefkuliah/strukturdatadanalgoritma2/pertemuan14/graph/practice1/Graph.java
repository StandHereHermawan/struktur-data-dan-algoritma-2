package ariefkuliah.strukturdatadanalgoritma2.pertemuan14.graph.practice1;

import java.util.Arrays;

public class Graph {

    /**
     * Vertex.
     */
    static String[] kota = {"A", "B", "C", "D", "E", "F"};

    /**
     * Edges of undirect graph.
     * Boolean bisa di-isi 0 atau 1 maupun true atau false.
     */
    static boolean[][] unDirectGraph = {
            {false, true, true, false, true, false},
            {true, false, true, true, false, false},
            {true, true, false, false, true, true},
            {false, true, false, false, false, false},
            {true, false, true, false, false, false},
            {false, false, true, false, false, false}
    };

    /**
     * Edges of direct graph.
     */
    static boolean[][] directGraph = {
            {false, true, true, false, false, false},
            {false, false, true, false, false, false},
            {false, false, false, false, false, true},
            {false, true, false, false, false, false},
            {true, false, true, false, false, false},
            {false, false, false, false, false, false}
    };

    /**
     * Print unDirected Graph atau Directed Graph.
     */
    static void printGraph(boolean[][] edges) {
        if (Arrays.equals(edges, unDirectGraph)) {
            System.out.println("Edges of unDirectGraph.");
        }
        if (Arrays.equals(edges, directGraph))
            System.out.println("Edges of unDirectGraph.");

        for (int kolom = 0; kolom < edges.length; kolom++) {
            for (int baris = 0; baris < edges[0].length; baris++) {
                if (edges[kolom][baris]) {
                    if (Arrays.equals(edges, unDirectGraph))
                        System.out.println("(" + kota[kolom] + "," + kota[baris] + ")");
                    if (Arrays.equals(edges, directGraph))
                        System.out.println("<" + kota[kolom] + "," + kota[baris] + ">");
                }
            }
        }
        System.out.println("\n\n");
    }

    /**
     * edges of undirected weighted graph.
     * Tipe data Integer karena terdapat ukuran.
     */
    static Integer[][] weighted = {
            {0, 5, 4, 0, 11, 0},
            {5, 0, 7, 3, 0, 0},
            {4, 7, 0, 0, 6, 4},
            {0, 3, 0, 0, 0, 0},
            {11, 0, 6, 0, 0, 0},
            {0, 0, 4, 0, 0, 0}
    };

    static void printWeightedGraph(Integer[][] edges) {
        System.out.println("Edges of weighted Graph.");
        for (int kolom = 0; kolom < edges[0].length; kolom++) {
            for (int baris = 0; baris < edges.length; baris++) {
                if (edges[kolom][baris] != 0) {
                    System.out.println("(" + kota[kolom] + "," + kota[baris] + ") = " + edges[kolom][baris]);
                }
            }
        }
        System.out.println("\n\n");
    }

    static void addEdgeGraph(String sumber, String tujuan, boolean[][] edges) {
        int indexSumber = -1;
        int indexTujuan = -1;

        for (int perulangan = 0; perulangan < edges.length; perulangan++) {
            if (kota[perulangan].equals(sumber)) {
                indexSumber = perulangan;
                break;
            }
        }

        for (int perulangan = 0; perulangan < edges.length; perulangan++) {
            if (kota[perulangan].equals(tujuan)) {
                indexTujuan = perulangan;
                break;
            }
        }

        if (indexSumber < 0 && indexTujuan < 0) {
            System.out.println("Sumber dan tujuan tidak ditemukan.");
        } else if (indexSumber < 0) {
            System.out.println("Sumber tidak ditemukan");
        } else if (indexTujuan < 0) {
            System.out.println("Tujuan tidak ditemukan");
        } else {

            if (Arrays.equals(edges, unDirectGraph)) {
                unDirectGraph[indexSumber][indexTujuan] = true;
                unDirectGraph[indexTujuan][indexSumber] = true;
                System.out.println("Penambahan Edge Undirectedgraph");
            }

            if (Arrays.equals(edges, directGraph)) {
                directGraph[indexSumber][indexTujuan] = true;
                System.out.println("Penambahan Edge directgraph");
            }

            System.out.println("Vertex " + sumber + " Berhasil dihubungkan dengan vertex " + tujuan + "\n\n");
        }
    }

    static void addEdgeWeightedGraph(String sumber, String tujuan, int nilai, Integer[][] edges) {
        int indexSumber = -1;
        int indexTujuan = -1;

        for (int perulangan = 0; perulangan < edges.length; perulangan++) {
            if (kota[perulangan].equals(sumber)) {
                indexSumber = perulangan;
                break;
            }
        }

        for (int perulangan = 0; perulangan < edges.length; perulangan++) {
            if (kota[perulangan].equals(tujuan)) {
                indexTujuan = perulangan;
                break;
            }
        }

        if (indexSumber < 0 && indexTujuan < 0) {
            System.out.println("Sumber dan tujuan tidak ditemukan.");
        } else if (indexSumber < 0) {
            System.out.println("Sumber tidak ditemukan");
        } else if (indexTujuan < 0) {
            System.out.println("Tujuan tidak ditemukan");
        } else {
            weighted[indexSumber][indexTujuan] = nilai;
            weighted[indexTujuan][indexSumber] = nilai;
            System.out.println(
                    "Penambahan edges di weighted Graph : Vertex " + sumber +
                            " berhasil dihubungkan dengan vertex " + tujuan + " dengan nilai : " + nilai + "\n\n");
        }
    }

    public static void main(String[] args) {
        printGraph(unDirectGraph);
        printGraph(directGraph);
        printWeightedGraph(weighted);
        addEdgeGraph("A", "D", unDirectGraph);
        printGraph(unDirectGraph);
        addEdgeGraph("A", "D", directGraph);
        printGraph(directGraph);
        addEdgeWeightedGraph("A", "D", 2, weighted);
        printWeightedGraph(weighted);
    }
}
