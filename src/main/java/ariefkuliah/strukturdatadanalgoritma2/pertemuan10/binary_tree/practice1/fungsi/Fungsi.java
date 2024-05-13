package ariefkuliah.strukturdatadanalgoritma2.pertemuan10.binary_tree.practice1.fungsi;

import ariefkuliah.strukturdatadanalgoritma2.pertemuan10.binary_tree.practice1.Task;

public class Fungsi {
    static Task.Node root;
    public static Task.Node insertRight(char label, Task.Node node) {
        if (root == null) {
            System.out.println("\n" + "Buat tree terlebih dahulu.");
            return null;
        } else {
            /**
             * Cek apakah cabang kanan ada node atau tidak.
             * */
            if (node.right != null) {
                /**
                 * Kalau ada.
                 * */
                System.out.println("\n" + "Node " + node.label + ", sudah ada anak di sebelah kanan.");
                return null;
            } else {
                /**
                 * Kalau tidak ada.
                 * */
                Task.Node newNode = new Task.Node();
                newNode.label = label;
                newNode.left = null;
                newNode.right = null;
                newNode.parent = node;
                node.right = newNode;
                System.out.println(
                        "\n" + "Node dengan label: " + label +
                                ", berhasil ditambahkan ke anak kanan Node dengan label: " +
                                newNode.parent.label);
                return newNode;
            }
        }
    }
}
