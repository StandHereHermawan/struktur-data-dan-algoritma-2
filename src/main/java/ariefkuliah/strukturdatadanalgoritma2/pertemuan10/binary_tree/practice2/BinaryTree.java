package ariefkuliah.strukturdatadanalgoritma2.pertemuan10.binary_tree.practice2;

import ariefkuliah.strukturdatadanalgoritma2.pertemuan10.binary_tree.practice1.Task;

public class BinaryTree {

    /**
     * Node Class.
     */
    public static class Node {
        public char label;
        public Task.Node left, right, parent;
    }

    /**
     * Variables Global pointers.
     */
    public Task.Node root, newNode;

    /**
     * Create new Tree.
     * <code>createNewTree()</code>
     */
    void createNewTree(char label) {

        if (root != null) {
            System.out.println("\n" + "Tree sudah dibuat");
        } else {
            root = new Task.Node();
            root.label = label;
            root.left = null;
            root.right = null;
            root.parent = null;
            System.out.println("\n" + "Node dengan label: " + label + ", " + "Berhasil dibuat menjadi root.");
        }
    }

    /**
     * Insert Left
     */
    public Task.Node insertLeft(char label, Task.Node node) {
        if (root == null) {
            System.out.println("\n" + "Buat tree terlebih dahulu.");
            return null;
        } else {
            /**
             * Cek apakah cabang kiri ada node atau tidak.
             * */
            if (node.left != null) {
                /**
                 * Kalau ada.
                 * */
                System.out.println("\n" + "Node " + node.label + ", sudah ada anak di sebelah kiri.");
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
                node.left = newNode;
                System.out.println(
                        "\n" + "Node dengan label: " + label +
                                ", berhasil ditambahkan ke anak kiri Node dengan label: " + newNode.parent.label);
                return newNode;
            }
        }
    }

    /**
     * Insert right
     */
    public Task.Node insertRight(char label, Task.Node node) {
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

    /**
     * Cek node kosong atau tidak.
     */
    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void update(char label, Task.Node node) {
        if (root == null) {
            System.out.println("\n" + "Buat tree terlebih dahulu.");
        } else {
            if (node == null) {
                System.out.println("\n" + "Node yang ingin digantikan tidak ada.");
            } else {
                char temp = node.label;
                node.label = label;
                System.out.println("\n" + "Label node " + temp + " berhasil diubah menjadi " + label + ".");
            }
        }
    }
}
