package ariefkuliah.strukturdatadanalgoritma2.pertemuan10.binary_tree.practice2;

public class Task {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createNewTree('A');

        ariefkuliah.strukturdatadanalgoritma2.pertemuan10.binary_tree.practice1.Task.Node
                nodeB, nodeC, nodeD, nodeE, nodeF, nodeG, nodeH, nodeI, nodeJ;

        /**
         * Left A Node Branch.
         * */
        nodeB = tree.insertLeft('B', tree.root);
        nodeD = tree.insertRight('D', nodeB);
        nodeJ = tree.insertLeft('J', nodeD);

        /**
         * Right A Node Branch.
         * */
        nodeC = tree.insertRight('C', tree.root);
        nodeE = tree.insertLeft('E',nodeC);
        nodeF = tree.insertRight('F', nodeC);
        nodeG = tree.insertLeft('G', nodeE);
        nodeH = tree.insertLeft('H', nodeF);
        nodeI = tree.insertRight('I',nodeH);
    }
}
