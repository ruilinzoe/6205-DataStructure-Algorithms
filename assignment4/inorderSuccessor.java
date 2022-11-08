package assignment4;

public class inorderSuccessor {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode res=null;
        while(root!=null){
            if(root.val<=p.val){
                root=root.right;
            }else{
                res=root;
                root=root.left;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(12);
        TreeNode x=new TreeNode(6);
        TreeNode y=new TreeNode(12);
        t.left=x;
        t.right=y;
        System.out.println(inorderSuccessor(t, y));
    }
}
