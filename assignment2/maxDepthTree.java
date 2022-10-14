package assignment2;

import java.util.LinkedList;
import java.util.Queue;

public class maxDepthTree {
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
    public static int maxDepth(TreeNode root){
        if(root==null) return 0;
        int res=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            while (size>0){
                TreeNode temp=queue.poll();
                if (temp.left!=null){
                    queue.offer(temp.left);
                }if (temp.right!=null){
                    queue.offer(temp.right);
                }
                size--;
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int val=2;
        TreeNode t=new TreeNode(2);
        t.left=new TreeNode(3);
        t.right=new TreeNode(3);
        System.out.println(maxDepth(t));
    }

}
