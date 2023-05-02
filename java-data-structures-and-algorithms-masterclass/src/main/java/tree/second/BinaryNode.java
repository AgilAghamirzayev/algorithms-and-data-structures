package tree.second;

public class BinaryNode {
    public String value;
    public BinaryNode left;
    public BinaryNode right;
    public int height;

    @Override
    public String toString() {
        return "[" +
                "value:'" + value + '\'' +
                " left:" + left +
                ", right:" + right + ']';
    }
}
