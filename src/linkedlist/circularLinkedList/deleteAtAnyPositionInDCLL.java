package linkedlist.circularLinkedList;

public class deleteAtAnyPositionInDCLL {

    /* Node */

    static class Node {

        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    /* Display */

    public static void display(Node head) {

        if (head == null)
            return;

        Node temp = head;

        do {

            System.out.print(temp.value);

            if (temp.next != head)
                System.out.print(" <-> ");

            temp = temp.next;

        } while (temp != head);

        System.out.println();
    }

    static class Solution {

        /* Delete At Any Position */

        public Node delete(Node head, int position) {

            if (head == null)
                return null;

            // Single Node

            if (head.next == head && position == 1)
                return null;

            // Delete Head

            if (position == 1) {

                Node tail = head.prev;

                head = head.next;

                tail.next = head;
                head.prev = tail;

                return head;
            }

            Node curr = head;

            for (int i = 1; i < position && curr.next != head; i++)
                curr = curr.next;

            // Invalid Position

            if (curr == head)
                return head;

            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;

            return head;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        fifth.next = first;
        first.prev = fifth;

        System.out.println("Original DCLL");
        display(first);

        first = obj.delete(first, 3);

        System.out.println("\nAfter Deleting Position 3");
        display(first);
    }
}

/*

Delete At Any Position In DCLL

Type

✔ Doubly Circular Linked List

Example

10 <-> 20 <-> 30 <-> 40 <-> 50

Delete

Position = 3

Result

10 <-> 20 <-> 40 <-> 50

Algorithm

1. Reach the target node.
2. Update Next and Prev links.
3. Maintain circular links.

Edge Cases

✔ Empty List
✔ Single Node
✔ Delete Head
✔ Delete Tail
✔ Delete Middle

Time  : O(n)

Space : O(1)

Interview Points

✔ Update both Next and Prev pointers.

✔ Head changes only when deleting
the first node.

✔ Tail.next always points to Head.

✔ Head.prev always points to Tail.

*/