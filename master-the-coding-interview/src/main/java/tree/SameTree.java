package tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;

        if(p.val != q.val) return false;

        boolean a = isSameTree(p.left, q.left);
        boolean b = isSameTree(p.right, q.right);

        return a && b;
    }

    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if(p == null || q == null) return p == null && q == null;
        if(p.val != q.val) return false;

        boolean l = isSameTree(p.left,q.left);
        if(!l) return false;

        return isSameTree(p.right,q.right);
    }
}
