package tree.first;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");

        TreeNode hot = new TreeNode("Hot");
        TreeNode cool = new TreeNode("Cool");

        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        hot.addChild(tea);
        hot.addChild(coffee);

        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer");
        cool.addChild(wine);
        cool.addChild(beer);

        drinks.addChild(hot);
        drinks.addChild(cool);

        System.out.println(drinks.print(0));
    }
}
