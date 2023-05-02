package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal2 {

    public List<Integer> preorderTraversal(TreeNode root) {
        return preorderTraversal(root, new ArrayList<>());
    }

    public List<Integer> preorderTraversal(TreeNode root, List<Integer> integerList) {
        if (root == null) return integerList;
        integerList.add(root.val);
        preorderTraversal(root.left, integerList);
        preorderTraversal(root.right, integerList);
        return integerList;
    }
}
