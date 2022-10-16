package quiz1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
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
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        if (root==null) return res;
        while (!queue.isEmpty()){
            int size= queue.size();
            List<Integer> curr=new ArrayList<>();
            for (int i=0; i<size; i++){
                TreeNode temp=queue.poll();
                if (temp.left!=null){
                    queue.offer(temp.left);
                }
                if (temp.right!=null){
                    queue.offer(temp.right);
                }
                curr.add(temp.val);
            }
            res.add(curr);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode left=new TreeNode(1);
        TreeNode right=new TreeNode(2);
        root.left=left;
        root.right=right;

        TreeNode root2=new TreeNode(10);
        TreeNode left2=new TreeNode(1);
        TreeNode right2=new TreeNode(2);
        left.left=root2;
        root2.left=left2;
        root2.right=right2;

        System.out.println(levelOrder(root));
    }
}
