package assignment1;

public class insertNode {
    static class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }
    public static Node insert(Node head, int insertVal) {
            if (head == null) {
                Node newNode = new Node(insertVal, null);
                newNode.next = newNode;
                return newNode;
            }

            Node prev = head;
            Node curr = head.next;
            boolean toInsert = false;

            do {
                if (prev.val <= insertVal && insertVal <= curr.val) {
                    // Case 1).
                    toInsert = true;
                } else if (prev.val > curr.val) {
                    // Case 2).
                    if (insertVal >= prev.val || insertVal <= curr.val)
                        toInsert = true;
                }

                if (toInsert) {
                    prev.next = new Node(insertVal, curr);
                    return head;
                }

                prev = curr;
                curr = curr.next;
            } while (prev != head);

            // Case 3).
            prev.next = new Node(insertVal, curr);
            return head;
        }

    public static void main(String[] args) {
        Node d1=new Node(1);
        Node d2=new Node(2);
        Node d3=new Node(3);
        Node d4=new Node(4);
        d1.next=d2;
        d2.next=d3;
        d3.next=d4;
        int k=5;
        System.out.println(insert(d1, k));
    }
    }


