package tree.second;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }


    // BFS
    // PreOrder traversal
    public void preOrder(BinaryNode node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //InOrder traversal
    public void inOrder(BinaryNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // PostOrder traversal
    public void postOrder(BinaryNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    //DFS
    //LevelOrder traversal
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");

            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }


    // search
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("The value is: " + value);
                return;
            } else {
                if (presentNode.left != null)
                    queue.add(presentNode.left);

                if (presentNode.right != null)
                    queue.add(presentNode.right);
            }
        }
        System.out.println("The value: " + value + " is not found");
    }

    //Insert

    public void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("inserted new node at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Successfully inserted");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Successfully inserted");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    // Get deepest node
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    // Delete deepest node
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                if (previousNode == null) {
                    root = null;
                    return;
                }
                previousNode.right = null;
                return;
            }
            if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    // Delete Given Node
    void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (value.equals(presentNode.value)) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted!");
                return;
            }
            if (presentNode.left != null) queue.add(presentNode.left);
            if (presentNode.right != null) queue.add(presentNode.right);
        }

        System.out.println("The node does not exist in this BT");
    }

    // Delete Binary Tree
    void deleteBinaryTree() {
        root = null;
        System.out.println("BT has been deleted successfully!");
    }

}
