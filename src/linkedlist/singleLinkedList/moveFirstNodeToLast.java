package linkedlist.singleLinkedList;

public class moveFirstNodeToLast {

    /* Node */

    static class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    /* Display List */

    public static void display(Node head) {

        while (head != null) {

            System.out.print(head.value);

            if (head.next != null)
                System.out.print(" -> ");

            head = head.next;          // Move ahead
        }

        System.out.println();
    }

    static class Solution {

        /* Move first node to last */

        public Node move(Node head) {

            if (head == null || head.next == null)
                return head;

            Node first = head;
            Node tail = head;

            while (tail.next != null)
                tail = tail.next;      // Reach last node

            head = head.next;          // New head

            tail.next = first;         // Attach first at end

            first.next = null;

            return head;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);
        first.next.next.next = new Node(40);
        first.next.next.next.next = new Node(50);

        System.out.println("Original List");
        display(first);

        first = obj.move(first);

        System.out.println("\nAfter Moving First Node");
        display(first);
    }
}

/*

Move First Node To Last

Example

10 -> 20 -> 30 -> 40 -> 50

Result

20 -> 30 -> 40 -> 50 -> 10

Algorithm

1. Reach last node.
2. Make second node the new head.
3. Attach first node at the end.

Edge Cases

✔ Empty List
✔ Single Node
✔ Two Nodes

Time  : O(n)

Space : O(1)

Interview Points

✔ Only links are changed.

✔ No new node is created.

✔ Head changes after moving
the first node.

*/