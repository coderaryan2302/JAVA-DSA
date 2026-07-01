package linkedlist.singleLinkedList;

public class moveLastNodeToFirst {

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

        /* Move last node to front */

        public Node move(Node head) {

            if (head == null || head.next == null)
                return head;

            Node secondLast = null;
            Node last = head;

            while (last.next != null) {

                secondLast = last;
                last = last.next;
            }

            secondLast.next = null;    // Remove last node

            last.next = head;          // Attach before head

            return last;
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

        System.out.println("\nAfter Moving Last Node");
        display(first);
    }
}

/*

Move Last Node To Front

Example

10 -> 20 -> 30 -> 40 -> 50

Result

50 -> 10 -> 20 -> 30 -> 40

Algorithm

1. Reach last node.
2. Store second last node.
3. Remove last node.
4. Attach last node before head.

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
the last node.

✔ Classic Linked List interview question.

*/