package assignment1;

public class rotateList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public static ListNode rotateList(ListNode head, int k){
        if(head==null || head.next==null) return head;
        ListNode index=head;
        int len=1;
        while(head.next!=null){
            head=head.next;
            len++;
        }
        head.next=index;
        for (int i=0; i<len-k%len; i++){
            head=head.next;
        }
        //from the len-k%len point
        ListNode res=head.next;
        head.next=null;
        return res;
  }

    public static void main(String[] args) {
        ListNode b1=new ListNode(2);
        ListNode b2=new ListNode(3);
        ListNode b3=new ListNode(4);
        ListNode b4=new ListNode(5);
        b1.next=b2;
        b2.next=b3;
        b3.next=b4;
        System.out.println(rotateList(b1, 2));
    }
}
