public class BinaryTree {

    public static void main(String[] args) {

        Node root = new Node(1);
        insert(root, 2);
        insert(root, 3);
        insert(root, 4);
        insert(root, 5);
        insert(root, 6);
        insert(root, 8);
        insert(root, 10);

        int m = sum(root);
        System.out.println("sum " + m);
    }


    public static void insert(Node node, int value) {
        if (value < node.data) {
            if (node.left == null) {
                System.out.println(" Inserted " + value + " to left of " + node.data);
                node.left = new Node(value);
            } else {
                insert(node.left, value);

            }

        } else if (value > node.data) {
            if (node.right == null) {
                System.out.println(" Inserted " + value + " to right of " + node.data);
                node.right = new Node(value);
            } else {
                insert(node.right, value);
            }
        }
    }

    public static int sum(Node node) {

        // base case1: node is empty
        if (node == null) {
            return 0;
        }
        // base case2: only the root exist
        if (node.left == null && node.right == null) {
            return node.data;
        }
        return node.data + sum(node.left) + sum(node.right);

    }
}
class Node {
    protected Node left;
    protected Node right;
    protected int data;

    public Node(int data){
        this.data = data;
    }
}

