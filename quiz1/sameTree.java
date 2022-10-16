package quiz1;

public class sameTree {
    //check if two trees are symmetric
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){
        }
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left= left;
            this.right=right;
        }
    }
    public static boolean sameTree(TreeNode t1, TreeNode t2){
        if (t1==null && t2==null) {
            return true;
        }
        if (t1==null|| t2==null){
            return false;
        }
        if (t1.val==t2.val){
            return sameTree(t1.left, t2.left) && sameTree(t1.right, t2.right);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode p=new TreeNode(9);
        TreeNode pleft=new TreeNode(10);
        TreeNode pright=new TreeNode(11);
        p.left=pleft;
        p.right=pright;

        TreeNode q=new TreeNode(9);
        TreeNode qleft=new TreeNode(10);
        TreeNode qright=new TreeNode(10);
        q.left=qleft;
        q.right=qright;
        System.out.println(sameTree(p, q));

    }
}
