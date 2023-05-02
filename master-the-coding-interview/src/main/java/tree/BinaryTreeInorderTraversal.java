package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        System.out.println(inorderTraversal(node));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return result;

        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);

        return result;
    }
}
