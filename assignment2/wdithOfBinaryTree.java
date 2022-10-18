package assignment2;

import java.util.LinkedList;
import java.util.Queue;

public class wdithOfBinaryTree {
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
            this.left=left;
            this.right=right;
        }
    }
    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        root.val = 0;
        queue.add(root);
        int maxLength = 0;
        while (!queue.isEmpty()) {
            Queue<TreeNode> newLevel = new LinkedList<>();
            int firstElement = queue.peek().val;
            int lastElement = firstElement;
            while(!queue.isEmpty()) {
                TreeNode current = queue.remove();
                if (current.left != null) {
                    current.left.val = current.val * 2;
                    newLevel.add(current.left);
                }
                if (current.right != null) {
                    current.right.val = current.val * 2 + 1;
                    newLevel.add(current.right);
                }
                if (queue.isEmpty()) {
                    lastElement = current.val;
                }
            }
            if (lastElement - firstElement + 1 > maxLength) {
                maxLength = lastElement - firstElement + 1;
            }
            queue = newLevel;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(12);
        t.left=new TreeNode(1);
        TreeNode x=new TreeNode(3);
        TreeNode y=new TreeNode(3);
        t.right=new TreeNode(10, x,y);
        System.out.println(widthOfBinaryTree(t));
    }
}
