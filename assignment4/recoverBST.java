package assignment4;

public class recoverBST {
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
    static TreeNode prev = null;
    static TreeNode first = null;
    static TreeNode second = null;
    public static void recoverTree(TreeNode root) {

        findSwap(root);
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }

    static void findSwap(TreeNode root){
        if(root == null) return;

        findSwap(root.left);
        if(prev != null){
            if(first == null && prev.val > root.val){
                first = prev;
            }
            if(first != null && prev.val > root.val){
                second = root;
            }
        }

        prev = root;

        findSwap(root.right);
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(12);
        t.left=new TreeNode(1);
        TreeNode x=new TreeNode(4);
        TreeNode y=new TreeNode(3);
        t.right=new TreeNode(10, x,y);
        recoverTree(t);
    }
}
