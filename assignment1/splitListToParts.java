package assignment1;

import java.util.List;

public class splitListToParts {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
    }

    public static ListNode[] splitListToParts(ListNode head, int k){
        ListNode[] res=new ListNode[k];
        ListNode curr=head;
        int N=0;
        while (curr!=null){
            curr=curr.next;
            N++;
        }
        curr=head;
        int len=N/k, sum=N%k;
        for (int i=0; i<k; i++){
            ListNode start=curr;
            for (int j=0; j<len+(i<sum?1:0)-1; j++){
                if (curr!=null){
                    curr=curr.next;
                }
            }
            if (curr!=null){
                ListNode prev=curr;
                curr=curr.next;
                prev.next=null;
            }
            res[i]=start;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode c1= new ListNode(1);
        ListNode c2= new ListNode(2);
        ListNode c3= new ListNode(3);
        ListNode c4= new ListNode(4);
        c1.next=c2;
        c2.next=c3;
        c3.next=c4;
        System.out.println(splitListToParts(c1, 2));
    }

}
