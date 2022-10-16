package assignment2;

import java.util.*;

public class verticalOrder {
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
    static class Node {
        TreeNode root;
        int hd;
        public Node(TreeNode root, int hd) {
            this.root = root;
            this.hd = hd;
        }
    }

    public static List<List<Integer>> verticalOrder(TreeNode root) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(root, 0));

        while (!q.isEmpty()) {
            Node cur = q.poll();
            map.putIfAbsent(cur.hd, new ArrayList<>());
            map.get(cur.hd).add(cur.root.val);

            if (cur.root.left != null) {
                q.offer(new Node(cur.root.left, cur.hd - 1));
            }

            if (cur.root.right != null) {
                q.offer(new Node(cur.root.right, cur.hd + 1));
            }
        }

        for (List<Integer> value : map.values()) {
            res.add(value);
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(12);
        t.left=new TreeNode(1);
        TreeNode x=new TreeNode(3);
        TreeNode y=new TreeNode(3);
        t.right=new TreeNode(10, x,y);
        System.out.println(verticalOrder(t));
    }

}
