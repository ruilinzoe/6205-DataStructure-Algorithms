package assignment2;

public class lowestCommonAncestor {
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
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal=p.val;
        int qVal=q.val;
        if(root==null) return null;
        if(pVal==root.val || qVal==root.val) return root;
        TreeNode left=lowestCommonAncestor(root.left, p, q);
        TreeNode right=lowestCommonAncestor(root.right, p, q);
        if(left==null){
            return right;
        }else if(right ==null){
            return left;
        }else{
            return root;
        }
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(12);
        t.left=new TreeNode(1);
        TreeNode x=new TreeNode(3);
        TreeNode y=new TreeNode(3);
        t.right=new TreeNode(10, x,y);
        System.out.println(lowestCommonAncestor(t, x, y));
    }
}
