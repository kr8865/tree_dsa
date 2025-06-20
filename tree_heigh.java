
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
        root.left = new tree.Node(2);
        root.right = new tree.Node(3);
        root.right.left = new tree.Node(4);
        root.right.right = new tree.Node(5);
        int c = get_height(root);
        System.out.println(c);

    }

}
