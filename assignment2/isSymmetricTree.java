package assignment2;

import com.sun.source.tree.Tree;

public class isSymmetricTree {
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
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode first, TreeNode second){
        if(first==null && second==null) return true;
        if(first==null || second==null) return false;
        return (first.val==second.val)&& isMirror(first.left, second.right) && isMirror(first.right, second.left);
    }

    public static void main(String[] args) {
        int val=2;
        TreeNode t=new TreeNode(2);
        t.left=new TreeNode(3);
        t.right=new TreeNode(3);
        System.out.println(isSymmetric(t));
    }


}

