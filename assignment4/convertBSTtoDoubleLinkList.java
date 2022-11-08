package assignment4;

public class convertBSTtoDoubleLinkList {
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
    static Node first = null;
    static Node last = null;

    public static void helper(Node node) {
        if (node != null) {
            // left
            helper(node.left);
            // node
            if (last != null) {
                last.right = node;
                node.left = last;
            }
            else {
                first = node;
            }
            last = node;
            // right
            helper(node.right);
        }
    }

    public static Node treeToDoublyList(Node root) {
        if (root == null) return null;

        helper(root);
        // close DLL
        last.right = first;
        first.left = last;
        return first;
    }

    public static void main(String[] args) {
        Node b1=new Node(2);
        Node b2=new Node(3);
        Node b3=new Node(4);
        b1.left=b2;
        b2.left=b3;
        System.out.println(treeToDoublyList(b1));
    }
}
