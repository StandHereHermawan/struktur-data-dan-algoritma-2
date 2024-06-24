package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan14.graph.practice3;

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
            for (int baris = 0; baris < edges[kolom].length; baris++) {
                if (edges[kolom][baris]) {
                    if (Arrays.equals(edges, unDirectGraph))
                        System.out.println("(" + kota[kolom] + "," + kota[baris] + ") = " + edges[kolom][baris]);
                    if (Arrays.equals(edges, directGraph))
                        System.out.println("<" + kota[kolom] + "," + kota[baris] + "> = " + edges[kolom][baris]);
                }
            }
        }
        System.out.println("\n\n");
    }

    static void printWeightedGraph(Integer[][] edges) {
        System.out.println("Edges of weighted Graph.");
        for (int kolom = 0; kolom < edges.length; kolom++) {
            for (int baris = 0; baris < edges[kolom].length; baris++) {
                if (edges[kolom][baris] != 0) {
                    System.out.println("(" + kota[kolom] + "," + kota[baris] + ") = " + edges[kolom][baris]);
                }
            }
        }
        System.out.println("\n\n");
    }

    /**
     * Print All unDirected Graph atau Directed Graph.
     */
    static void printAllGraph(boolean[][] edges) {
        int sum = 0;

        if (Arrays.equals(edges, unDirectGraph)) {
            System.out.println("All Edges of unDirectGraph.");
        }
        if (Arrays.equals(edges, directGraph))
            System.out.println("All Edges of unDirectGraph.");

        for (int kolom = 0; kolom < edges.length; kolom++) {
            for (int baris = 0; baris < edges[kolom].length; baris++) {
                sum++;
                System.out.print(sum + ". (" + kota[kolom] + "," + kota[baris] + ") = " + edges[kolom][baris] + ", ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    static void printAllWeightedGraph(Integer[][] edges) {
        int sum = 0;

        System.out.println("All Edges of weighted Graph.");
        for (int kolom = 0; kolom < edges.length; kolom++) {
            for (int baris = 0; baris < edges[kolom].length; baris++) {
                sum++;
                System.out.println(sum + ".(" + kota[kolom] + "," + kota[baris] + ") = " + edges[kolom][baris] + ", ");
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

        // Mencari index baris yang memiliki Huruf sesuai dengan parameter
        for (int perulangan = 0; perulangan < edges.length; perulangan++) {
            if (kota[perulangan].equals(sumber)) {
                indexSumber = perulangan;
                break;
            }
        }

        // Mencari index baris yang memiliki Huruf sesuai dengan parameter
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
                            " berhasil dihubungkan dengan vertex " + tujuan +
                            " dengan nilai : " + nilai + "\n\n");
        }
    }

    /**
     * Fungsi untuk Mencari bobot pada vertex graph array.
     */
    static int getWeightedValueVerticesUndirectGraph(
            String rowValue,
            String columnValue,
            Integer[][] edges,
            boolean[][] unDirectGraph,
            String[] kota) {
        int indexBaris = -1;
        int indexKolom = -1;
        int nilaiDituju = 0;

        // Mencari index baris yang memiliki Huruf sesuai dengan parameter
        for (int perulangan = 0; perulangan < unDirectGraph.length; perulangan++) {
            if (kota[perulangan].equals(rowValue)) {
                indexBaris = perulangan;
                break;
            }
        }

        // Mencari index kolom yang memiliki Huruf sesuai dengan parameter
        for (int perulangan = 0; perulangan < unDirectGraph.length; perulangan++) {
            if (kota[perulangan].equals(columnValue)) {
                indexKolom = perulangan;
                break;
            }
        }

        // Perulangan untuk mencari nilai bobot pada vertex menggunakan indeks yang telah didapat diatas.
        for (int kolom = 0; kolom < edges.length; kolom++) {
            for (int baris = 0; baris < edges[kolom].length; baris++) {
                if (edges[kolom][baris] != 0) {
                    if (indexBaris == baris && indexKolom == kolom) {
                        nilaiDituju = edges[indexKolom][indexBaris];
                    }
                }
            }
            System.out.println();
        }

        return nilaiDituju;
    }

    public static void main(String[] args) {
        printGraph(unDirectGraph);
        printGraph(directGraph);

        printAllGraph(unDirectGraph);
        printAllGraph(directGraph);

        printWeightedGraph(weighted);
        addEdgeGraph("A", "D", unDirectGraph);


        printGraph(unDirectGraph);
        addEdgeGraph("A", "D", directGraph);

        printGraph(directGraph);
        addEdgeWeightedGraph("A", "D", 2, weighted);

        printAllWeightedGraph(weighted);
        printWeightedGraph(weighted);

        int nilaiVertexAB = getWeightedValueVerticesUndirectGraph("A", "B", weighted, unDirectGraph, kota);
        int nilaiVertexAC = getWeightedValueVerticesUndirectGraph("A", "C", weighted, unDirectGraph, kota);

        int jumlahBobotVertexABdanAC = nilaiVertexAB + nilaiVertexAC;
        System.out.println("Jumlah Bobot Vertex AB dan AC: " + jumlahBobotVertexABdanAC);
    }
}
