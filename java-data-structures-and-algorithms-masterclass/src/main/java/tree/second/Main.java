package tree.second;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();

        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");

        System.out.print("PRE ORDER: ");
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        System.out.print("IN ORDER: ");
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        System.out.print("POST ORDER: ");
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        System.out.print("LEVEL ORDER: ");
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.search("N5");
        binaryTree.deleteNode("N0");
        binaryTree.deleteNode("N3");
        binaryTree.levelOrder();
    }


}
