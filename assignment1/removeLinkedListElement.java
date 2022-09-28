package assignment1;

public class removeLinkedListElement {
     public static class ListNode{
         int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
        }
     }
     public static ListNode removeLinkedListElement(ListNode head, int val){
         ListNode dummy=new ListNode(0);
         dummy.next=head;
         ListNode curr=head;
         ListNode prev=dummy;
         while (curr!=null){
             if (curr.val==val){
                 prev.next=curr.next;
             }else{
                 prev=curr;
             }
             curr=curr.next;
         }
         return dummy.next;
     }
    public static void main(String[] args) {
         ListNode o1=new ListNode(1);
         ListNode o2=new ListNode(2);
         int val=2;
         o1.next=o2;
        System.out.println(removeLinkedListElement(o1, 1));
    }
}
