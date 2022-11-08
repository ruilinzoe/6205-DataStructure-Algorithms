package assignment4;

import java.util.Stack;

public class bstIterator {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left= left;
            this.right=right;
        }
    }

    Stack<TreeNode> helper = new Stack<TreeNode>();
    public bstIterator(TreeNode root) {
        while (root != null) {
            helper.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return helper.size() != 0;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode result = helper.pop();
        TreeNode node = result.right;
        while (node != null) {
            helper.push(node);
            node = node.left;
        }
        return result.val;
    }

    public static void main(String[] args) {

    }
}
