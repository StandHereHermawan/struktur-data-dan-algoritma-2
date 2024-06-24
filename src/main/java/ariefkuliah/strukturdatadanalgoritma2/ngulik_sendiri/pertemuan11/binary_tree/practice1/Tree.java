package ariefkuliah.strukturdatadanalgoritma2.ngulik_sendiri.pertemuan11.binary_tree.practice1;

public class Tree<E> {

    /**
     * Node Class.
     */
    public static class Node<E> {
        public E label;
        public Node left, right, parent;
    }

    /**
     * Variables Global pointers.
     */
    public Node root, newNode;

    /**
     * Create new Tree.
     * <code>createNewTree()</code>
     */
    public Node createNewTree(E label) {

        if (root != null) {
            System.out.println("\n" + "Tree sudah dibuat");
        } else {
            root = new Node();
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
    public Node insertLeft(E label, Node node) {
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
                Node newNode = new Node();
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
    public Node insertRight(E label, Node node) {
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
                Node newNode = new Node();
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

    public void update(E label, Node node) {
        if (root == null) {
            System.out.println("\n" + "Buat tree terlebih dahulu.");
        } else {
            if (node == null) {
                System.out.println("\n" + "Node yang ingin digantikan tidak ada.");
            } else {
                E temp = (E) node.label;
                node.label = label;
                System.out.println("\n" + "Label node " + temp + " berhasil diubah menjadi " + label + ".");
            }
        }
    }

    void retrieve(Node node) {
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

    void findNode(Node node) {
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

    public void preOrder(Node node) {
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

    public void inOrder(Node node) {
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

    public void postOrder(Node node) {
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

    public void deleteTree(Node node) {
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

    public void deleteSub(Node node) {
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

    public int size(Node node) {
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

    int height(Node node) {
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
}