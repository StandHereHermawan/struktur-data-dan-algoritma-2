package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan14.graph.practice1;

import java.util.Arrays;

public class Graph {

    /**
     * Vertex.
     */
    static String[] barisDanKolom = {"A", "B", "C", "D", "E", "F", "G", "H"};

    /**
     * Edges of undirect graph.
     * Boolean bisa di-isi 0 atau 1 maupun true atau false.
     */
    static boolean[][] unDirectGraph = {
            {false, true, false, true, true, false, false, false},
            {true, false, true, false, false, false, false, false},
            {false, true, false, false, true, true, false, false},
            {true, false, false, false, false, false, true, false},
            {true, false, true, false, false, false, false, true},
            {false, false, true, false, false, false, true, false},
            {false, false, false, true, false, true, false, false},
            {false, false, false, false, true, false, false, false},
    };

    /**
     * Edges of direct graph.
     */
    static boolean[][] directGraph = {
            {false, true, false, true, false, false, false, false},
            {false, false, true, false, false, false, false, false},
            {false, false, false, false, true, false, false, false},
            {false, false, false, false, false, false, true, false},
            {true, false, false, false, false, false, false, true},
            {false, false, true, false, false, false, true, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false}
    };

    /**
     * edges of undirected weighted graph.
     * Tipe data Integer karena terdapat ukuran.
     */
    static Integer[][] weighted = {
            {0, 8, 0, 5, 5, 0, 0, 0},
            {8, 0, 2, 0, 0, 0, 0, 0},
            {0, 2, 0, 0, 7, 3, 0, 0},
            {5, 0, 0, 0, 0, 0, 0, 0},
            {5, 0, 7, 0, 0, 0, 0, 14},
            {0, 0, 3, 0, 0, 0, 6, 0},
            {0, 0, 0, 10, 0, 6, 0, 0},
            {0, 0, 0, 0, 14, 0, 0, 0},
    };

    /**
     * Print unDirected Graph atau Directed Graph.
     */
    static void printGraph(boolean[][] edges) {
        int hitung = 0;
        if (Arrays.equals(edges, unDirectGraph)) {
            System.out.println("Edges of unDirectGraph.");
        }
        if (Arrays.equals(edges, directGraph))
            System.out.println("Edges of DirectGraph.");

        for (int kolom = 0; kolom < edges.length; kolom++) {
            for (int baris = 0; baris < edges.length; baris++) {
                if (edges[kolom][baris]) {
                    hitung++;
                    if (Arrays.equals(edges, unDirectGraph)) {
                        System.out.println(
                                "(" + barisDanKolom[kolom] + "," + barisDanKolom[baris] + ")" +
                                        " Baris: " + baris + " Kolom: " + kolom + " Perulangan ke-" + hitung);
                    }
                    if (Arrays.equals(edges, directGraph)) {
                        System.out.println(
                                "<" + barisDanKolom[kolom] + "," + barisDanKolom[baris] + ">" +
                                        " Baris: " + baris + " Kolom: " + kolom + " Perulangan ke-" + hitung);
                    }
                }
            }
        }
        System.out.println("\n\n");
    }

    static void printWeightedGraph(Integer[][] edges) {
        int hitung = 0;
        System.out.println("Edges of weighted Graph.");
        for (int kolom = 0; kolom < edges.length; kolom++) {
            for (int baris = 0; baris < edges.length; baris++) {
                if (edges[kolom][baris] != 0) {
                    hitung++;
                    System.out.println("(" + barisDanKolom[kolom] + "," + barisDanKolom[baris] + ") = " + edges[kolom][baris] +
                            " Baris: " + baris + " Kolom: " + kolom + " Perulangan ke-" + hitung);
                }
            }
        }
        System.out.println("\n\n");
    }

    static void addEdgeGraph(String sumber, String tujuan, boolean[][] edges) {
        int indexSumber = -1;
        int indexTujuan = -1;

        for (int perulangan = 0; perulangan < edges.length; perulangan++) {
            if (barisDanKolom[perulangan].equals(sumber)) {
                indexSumber = perulangan;
                break;
            }
        }

        for (int perulangan = 0; perulangan < edges.length; perulangan++) {
            if (barisDanKolom[perulangan].equals(tujuan)) {
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
            if (barisDanKolom[perulangan].equals(sumber)) {
                indexSumber = perulangan;
                break;
            }
        }

        for (int perulangan = 0; perulangan < edges.length; perulangan++) {
            if (barisDanKolom[perulangan].equals(tujuan)) {
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
