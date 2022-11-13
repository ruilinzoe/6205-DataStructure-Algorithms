package midterm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class populateParentBT {
    //q2 populate parent of binary tree
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;
        TreeNode(int x) {
            val = x;
        }
    }
    static TreeNode root;
    public void populateParent(){
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
                    //populate the parent
                    prevNode.parent=node;
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
