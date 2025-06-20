public class tree {
    public static class Node {
        public Node left;
        public Node right;
        public int val;

        Node(int data) {
            this.val = data;
            this.right = null;
            this.left = null;
        }
    }

    public static tree.Node left;
    public static tree.Node right;

}
