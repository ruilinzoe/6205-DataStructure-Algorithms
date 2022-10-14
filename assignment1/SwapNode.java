package assignment1;

public class SwapNode {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode SwapNode(ListNode head, int k){
        ListNode curr=head;
        ListNode first=head;
        ListNode second=head;
        int count=1;
        while(curr.next!=null){
            if(count<k){
                first=first.next;
            }else{
                second=second.next;
            }
            curr=curr.next;
            count++;
        }
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        return head;
    }

    public static void main(String[] args) {
        ListNode a1=new ListNode(2);
        ListNode a2=new ListNode(3);
        ListNode a3=new ListNode(4);
        ListNode a4=new ListNode(5);
        ListNode a5=new ListNode(6);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        System.out.println(SwapNode(a1, 2));
    }
}
