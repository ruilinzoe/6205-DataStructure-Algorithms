package midterm;

public class insertInLinkList {
    static class Node
    {
        int data;
        Node next;
        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
        Node(int data) {
            this.data = data;
        }
    }
    public static void printList(Node head){
            Node ptr = head;
            while (ptr != null) {
                System.out.print(ptr.data + " —> ");
                ptr = ptr.next;
            }
        System.out.print("null");
        }
    public static Node sortedInsert(Node head, Node newNode) {
            if (head == null || head.data >= newNode.data)
            {
                newNode.next = head;
                head = newNode;
                return head;
            }
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            return head;
        }

        public static void main(String[] args) {
            int[] keys = {2, 4};

            // points to the head node of the linked list
            Node head = null;

            // construct a linked list
            for (int i = keys.length - 1; i >= 0; i--) {
                head = new Node(keys[i], head);
            }
            head = sortedInsert(head, new Node(1));
            printList(head);
        }

}
