package algorithms.tree;

public class Examples {

    private class TreeNode {
        public int val;
        public TreeNode leftChild;
        public TreeNode rightChild;

    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.leftChild != null && root.leftChild.val > root.val) return false;
        if (root.rightChild != null && root.rightChild.val < root.val) return false;

        boolean left = isValidBST(root.leftChild);
        boolean right = isValidBST(root.rightChild);

        return left && right;
    }
}
