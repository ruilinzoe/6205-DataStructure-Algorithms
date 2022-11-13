package midterm;

import java.util.ArrayList;
import java.util.List;

public class withInRange {
    //q3 print TreeNode out of range
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }

        TreeNode(){}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    static List<Integer> list=new ArrayList<>();
    public static List<Integer> withinRange(TreeNode node, int low, int high){
        helper(node, low, high);
        return list;
    }

    public static void helper(TreeNode node, int low, int high){
        if(node!=null){
            if(node.val<=high && node.val>=low){
                list.add(node.val);
            }if(node.val>low){
                helper(node.left, low, high);
            }if(node.val<high){
                helper(node.right, low, high);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(8);
        t.left=new TreeNode(6);
        TreeNode x=new TreeNode(9);
        TreeNode y=new TreeNode(11);
        t.right=new TreeNode(10, x,y);
        System.out.println(withinRange(t, 5, 9).toString());
    }

}
