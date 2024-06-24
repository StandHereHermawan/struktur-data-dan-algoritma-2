package ariefkuliah.strukturdatadanalgoritma2.pertemuan15.kuis2.soal1;

public class Task {
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
    Task.Node root, newNode;

    /**
     * Create new Tree.
     * <code>createNewTree()</code>
     */
    Task.Node createNewTree(char label) {

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
        return root;
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

    void retrieve(Task.Node node) {
        if (root == null) {
            System.out.println("\n" + "Buat Tree terlebih dahulu.");
        } else {
            if (node == null) {
                System.out.println("\n" + "Node yang ditunjuk tidak ada.");
            } else {
                System.out.println("\n" + "Label node : " + node.label);
            }
        }
    }

    void findNode(Task.Node node) {
        /**
         * Cek apakah variabel adalah data tree atau bukan.
         * */
        if (root == null) {
            System.out.println("\n" + "Buat Tree Terlebih dahulu!");
        } else {
            System.out.println("\n" + "Label node : " + node.label);
            System.out.println("Root Node : " + root.label);

            /**
             * Cek Node Parent.
             * */
            if (node.parent == null) {
                System.out.println("Parent node : (tidak punya orang tua).");
            } else {
                System.out.println("Parent node : " + node.parent.label);
            }

            /**
             * Cek Node Saudara.
             * */
            /**
             * Cek apakah Node Saudara sebelah kiri.
             * */
            if (node.parent != null && node.parent.left != node && node.parent.right == node) {
                System.out.println("Node Saudara : " + node.parent.left.label);
            }
            /**
             * Cek apakah Node Saudara sebelah kanan.
             * */
            else if (node.parent != null && node.parent.left == node && node.parent.right != node) {
                System.out.println("Node Saudara : " + node.parent.right.label);
            } else {
                System.out.println("Node Tidak punya saudara.");
            }

            /**
             * Cek apakah Node memiliki anak sebelah kiri.
             * */
            if (node.left == null) {
                System.out.println("Node tidak punya anak sebelah kiri.");
            } else {
                System.out.println("Node memiliki anak kiri : " + node.left.label);
            }

            /**
             * Cek apakah Node memiliki anak sebelah kanan.
             * */
            if (node.right == null) {
                System.out.println("Node tidak punya anak sebelah kanan.");
            } else {
                System.out.println("Node memiliki anak kanan : " + node.right.label);
            }
        }
    }

    public void preOrder(Task.Node node) {
        if (root == null) {
            System.out.println("\n" + "Create Tree First.");
        } else {
            if (node != null) {
                System.out.print(node.label + ", ");
                preOrder(node.left);
                preOrder(node.right);
            }
        }
    }

    public void inOrder(Task.Node node) {
        if (root == null) {
            System.out.println("\n" + "Create tree first.");
        } else {
            if (node != null) {
                inOrder(node.left);
                System.out.print(node.label + ", ");
                inOrder(node.right);
            }
        }
    }

    public void postOrder(Task.Node node) {
        if (root == null) {
            System.out.print("\n" + "Create a tree first.");
        } else {
            if (node != null) {
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(node.label + ", ");
            }
        }
    }

    public void deleteTree(Task.Node node) {
        if (root == null) {
            System.out.print("\n" + "Create a tree first.");
        } else {
            if (node != null) {
                if (node != root) {
                    node.parent.left = null;
                    node.parent.right = null;
                }
                deleteTree(node.left);
                deleteTree(node.right);
                if (node == root) {
                    root = null;
                } else {
                    node = null;
                }
            }
        }
    }

    public void deleteSub(Task.Node node) {
        if (root == null) {
            System.out.print("\n" + "Create a tree first.");
        } else {
            deleteTree(node.left);
            deleteTree(node.right);
            System.out.println("\n" + "Subtree node : " + node.label + " has been deleted.");
        }
    }

    void clear() {
        if (root == null) {
            System.out.println("\n" + "Create a tree first.");
        } else {
            deleteTree(root);
            System.out.println("\n" + "Tree berhasil dihapus");
        }
    }

    public int size(Task.Node node) {
        if (root == null) {
            System.out.println("\n" + "Create a tree first.");
            return 0;
        } else {
            if (node == null) {
                return 0;
            } else {
                return 1 + size(node.left) + size(node.right);
            }
        }
    }

    int height(Task.Node node) {
        if (root == null) {
            System.out.println("\n" + "Create a tree first.");
            return 0;
        } else {
            if (node == null) {
                return 0;
            } else {
                int heightLeft = height(node.left);
                int heightRight = height(node.right);

                if (heightLeft >= heightRight) {
                    return heightLeft + 1;
                } else {
                    return heightRight + 1;
                }
            }
        }
    }

    void characteristic() {
        System.out.println("\n" + "Size tree : " + size(root));
        System.out.println("Height tree : " + height(root));
        System.out.println("Average node of tree : " + size(root) / height(root));
        System.out.println("Average node of tree : " + (double) (size(root) / height(root)));
    }

    public static void main(String[] args) {
        Task program = new Task();
        Task.Node nodeRoot = program.createNewTree('M');

        Task.Node node2 = program.insertLeft('I', nodeRoot);
        Task.Node node3 = program.insertRight('R', nodeRoot);

        Task.Node node4 = program.insertLeft('C', node2);
        Task.Node node5 = program.insertRight('K', node2);

        Task.Node node6 = program.insertLeft('P', node3);
        Task.Node node7 = program.insertRight('U', node3);

        Task.Node node8 = program.insertLeft('A', node4);
        Task.Node node9 = program.insertRight('D', node4);

        Task.Node node10 = program.insertRight('J', node5);

        System.out.println();
        System.out.println("jawaban Soal Nomor 1.");
        System.out.println("Post Order");
        program.postOrder(nodeRoot);
        System.out.println();

        System.out.println("In Order");
        program.inOrder(nodeRoot);
        System.out.println();

        System.out.println("Pre Order");
        program.preOrder(nodeRoot);
        System.out.println();
    }
}
