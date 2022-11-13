package midterm;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class populateLeft {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode nextLeft;
        TreeNode(int x) {
            val = x;
        }
    }
    static TreeNode root;
    public void populateNextLeft(){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        TreeNode prevNode = null;
        while(queue.size() != 0){
            TreeNode node = queue.remove();
            if(node != null){
                if(node.left!= null){
                    queue.add(node.left);
                }
                if(node.right!= null){
                    queue.add(node.right);
                }
                if(prevNode != null){
                    prevNode.nextLeft=node;
                }
                prevNode = node;
            }
            else{
                if(queue.size() == 0){
                    break;
                }
                prevNode = null;
                queue.add(null);
            }
        }
    }
    //Time: O(N);
}
