package assignment4;

public class sumBST {
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
    static int ans;
    public static int rangeSumBST(TreeNode root, int low, int high) {
        ans=0;
        dfs(root, low, high);
        return ans;
    }

    public static void dfs(TreeNode node, int low, int high){
        if(node!=null){
            if(node.val<=high && node.val>=low){
                ans+=node.val;
            }if(node.val>low){
                dfs(node.left, low, high);
            }if(node.val<high){
                dfs(node.right, low, high);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(12);
        t.left=new TreeNode(1);
        TreeNode x=new TreeNode(3);
        TreeNode y=new TreeNode(3);
        t.right=new TreeNode(10, x,y);
        System.out.println(rangeSumBST(t, 5, 9));
    }
}
