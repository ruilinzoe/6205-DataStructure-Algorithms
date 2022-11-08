package assignment4;

public class validBST {
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

    public boolean isValidBST(TreeNode root) {
        // if(root==null) return true;
        return valid(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    public static boolean valid(TreeNode root, long max, long min){
        if(root==null){
            return true;
        }else if(root.val<max && root.val>min){
            return valid(root.left, root.val, min)&&valid(root.right, max, root.val);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(12);
        t.left=new TreeNode(1);
        TreeNode x=new TreeNode(3);
        TreeNode y=new TreeNode(3);
        t.right=new TreeNode(10, x,y);
        System.out.println(valid(t, 0, 15));
    }
}
