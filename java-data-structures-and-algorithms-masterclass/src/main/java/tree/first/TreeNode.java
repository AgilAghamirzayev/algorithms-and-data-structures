package tree.first;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode node) {
        children.add(node);
    }

    public String print(int level) {
        StringBuilder ret;
        ret = new StringBuilder(" ".repeat(level) + data + "\n");
        for (TreeNode node : children) {
            ret.append(node.print(level + 1));
        }
        return ret.toString();
    }
}
