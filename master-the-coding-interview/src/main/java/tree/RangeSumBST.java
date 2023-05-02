package tree;

public class RangeSumBST {

    static int sum = 0;


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

    public static void main(String[] args) {
        TreeNode node = new TreeNode(10,
                new TreeNode(5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
                new TreeNode(15, new TreeNode(13), new TreeNode(18)));

        int i = rangeSumBST(node, 6, 10);
        System.out.println(i);
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        sum += root.val >= low && root.val <= high ? root.val : 0;
        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);

        return sum;
    }


}
