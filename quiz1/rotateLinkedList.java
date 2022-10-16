package quiz1;

import assignment1.rotateList;

public class rotateLinkedList {
    //rotate linklist by k
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }

    public static ListNode rotate(ListNode head, int k){
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
        ListNode head=new ListNode(10);
        ListNode aa=new ListNode(9);
        ListNode bb=new ListNode(8);
        head.next=aa;
        aa.next=bb;
//        int k=2;
        System.out.println(rotate(head,2 ));
    }
}
