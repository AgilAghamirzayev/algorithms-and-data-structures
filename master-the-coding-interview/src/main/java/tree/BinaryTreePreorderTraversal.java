package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    List<Integer> objects = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return null;
        objects.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return objects;
    }
}
