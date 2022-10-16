package assignment2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightSideView {
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
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList();
        queue.offer(root);
        queue.offer(null);
        TreeNode curr=root, prev=root;
        while(!queue.isEmpty()){
            prev=curr;
            curr=queue.poll();
            while(curr!=null){
                if(curr.left!=null){
                    queue.offer(curr.left);
                }if(curr.right!=null){
                    queue.offer(curr.right);
                }
                prev=curr;
                curr=queue.poll();
            }
            res.add(prev.val);
            if(!queue.isEmpty()){
                queue.offer(null);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int val=7;
        TreeNode t=new TreeNode(val);
        t.left=new TreeNode(9);
        t.right=new TreeNode(10);
        System.out.println(rightSideView(t));
    }
}
