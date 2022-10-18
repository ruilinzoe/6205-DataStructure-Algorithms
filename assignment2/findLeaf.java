package assignment2;

import java.util.ArrayList;
import java.util.List;

public class findLeaf {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }

        TreeNode(){}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result, root);
        return result;
    }

    // traverse the tree bottom-up recursively
    private static int helper(List<List<Integer>> list, TreeNode root) {
        if (root == null) {
            return -1; // @note: +1==0, mapping to list index
        }

        int left = helper(list, root.left);
        int right = helper(list, root.right);
        int currentDepthFromBottom = Math.max(left, right) + 1;

        if (list.size() <= currentDepthFromBottom) {
            list.add(new ArrayList<Integer>());
        }

        list.get(currentDepthFromBottom).add(root.val);

        return currentDepthFromBottom;
    }
    public static void main(String[] args) {
        TreeNode t=new TreeNode(12);
        t.left=new TreeNode(1);
        TreeNode x=new TreeNode(3);
        TreeNode y=new TreeNode(3);
        t.right=new TreeNode(10, x,y);
        System.out.println(findLeaves(t));
    }
}
