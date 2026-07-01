package linkedlist.singleLinkedList;

public class reverseList {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.value);

            if (head.next != null)
                System.out.print(" -> ");
            head = head.next; // Move to next node
        }
        System.out.println();
    }

    static class Solution {

        // Approach 1 : Iterative (Preferred)
        public Node reverseIterative(Node head) {

            Node prev = null;
            Node curr = head;

            while (curr != null) {

                Node next = curr.next;

                curr.next = prev; // Reverse link
                prev = curr;      // Move prev
                curr = next;      // Move curr
            }
            return prev;
        }

        // Approach 2 : Recursive
        public Node reverseRecursive(Node head) {

            if (head == null || head.next == null)
                return head;

            Node newHead = reverseRecursive(head.next);

            head.next.next = head; // Reverse link
            head.next = null;      // Break old link

            return newHead;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Original List
        Node first = new Node(3);
        first.next = new Node(5);
        first.next.next = new Node(1);
        first.next.next.next = new Node(2);
        first.next.next.next.next = new Node(4);

        System.out.println("Original Linked List");
        display(first);

        Node reverse1 = obj.reverseIterative(first);

        System.out.println("\nReverse (Iterative)");
        display(reverse1);

        // Recreate list
        first = new Node(3);
        first.next = new Node(5);
        first.next.next = new Node(1);
        first.next.next.next = new Node(2);
        first.next.next.next.next = new Node(4);

        Node reverse2 = obj.reverseRecursive(first);

        System.out.println("\nReverse (Recursive)");
        display(reverse2);
    }
}

/*
Reverse Linked List

Example:

Original:
3 -> 5 -> 1 -> 2 -> 4

Reverse:
4 -> 2 -> 1 -> 5 -> 3

Approach 1 : Iterative
Uses three pointers:
- prev
- curr
- next

Steps:
1. Store next node.
2. Reverse current link.
3. Move all pointers.
4. Repeat until curr becomes null.

Approach 2 : Recursive
1. Go till the last node.
2. Reverse links while returning.
3. Break old link.
4. Return new head.

Why head.next = null?
Without it, the old link remains,
creating a cycle.

Example:
3 -> 5

After reverse:
5 -> 3

Without:
head.next = null

It becomes:
3 ↔ 5 (Cycle)

Edge Cases:
✔ Empty list
✔ Single node
✔ Two nodes
✔ Multiple nodes
✔ Duplicate values

Time:
Iterative : O(n)
Recursive : O(n)

Space:
Iterative : O(1)
Recursive : O(n)

Interview Tip:
Iterative → Preferred (O(1) Space)
Recursive → Short & Easy

Remember:

Iterative:
prev → curr → next

Recursive:
Go Last
    ↓
Reverse Links
    ↓
Break Old Link

 */