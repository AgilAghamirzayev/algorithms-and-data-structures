package tree;

public class MaximumDifferenceBetweenNodeAncestor {


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int diff = 0;

    public int maxAncestorDiff(TreeNode root) {
        helper(root);
        return diff;
    }

    private int[] helper(TreeNode root) {
        if (root == null) return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};

//        if (root.left == null &)
        return null;

    }
}
