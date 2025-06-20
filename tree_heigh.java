
public class tree_heigh {
    public static int get_height(tree.Node root) {
        if (root == null) {
            return 0;
        }
        int lh = get_height(root.left);
        int rh = get_height(root.right);
        return Math.max(lh, rh) + 1;

    }

    public static void main(String[] args) {
        tree.Node root = new tree.Node(1);
        tree.Node left = new tree.Node(2);
        tree.Node right = new tree.Node(3);
        root.left = left;
        root.right = right;
        int c = get_height(root);
        System.out.println(c);

    }

}
