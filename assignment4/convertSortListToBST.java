package assignment4;

public class convertSortListToBST {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        return toBST(head, null);
    }
    public static TreeNode toBST(ListNode head, ListNode tail){
        if(head == tail)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode thead = new TreeNode(slow.val);
        thead.left = toBST(head, slow);
        thead.right = toBST(slow.next, tail);
        return thead;
    }


    public static void main(String[] args) {
        ListNode b1=new ListNode(2);
        ListNode b2=new ListNode(3);
        ListNode b3=new ListNode(4);
        ListNode b4=new ListNode(5);
        b1.next=b2;
        b2.next=b3;
        b3.next=b4;
        System.out.println(sortedListToBST(b1));
    }

}
