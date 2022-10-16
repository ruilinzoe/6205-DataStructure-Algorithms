package assignment2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigZag {
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
    public static List<List<Integer>> zigZag(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        int level=0;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int length=qu.size();
            List<Integer> levelresult=new LinkedList<>();
            for(int i=0; i<length; i++ ){
                TreeNode temp=qu.poll();
                if(temp.left!=null) qu.add(temp.left);
                if(temp.right!=null) qu.add(temp.right);
                if(level%2==0)levelresult.add(temp.val);
                else{
                    levelresult.add(0,temp.val);
                }
            }
            level++;
            result.add(levelresult);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(12);
        t.left=new TreeNode(1);
        TreeNode x=new TreeNode(3);
        TreeNode y=new TreeNode(3);
        t.right=new TreeNode(10, x,y);
        System.out.println(zigZag(t));
    }
}
