package linkedlist.circularLinkedList;

public class deleteAtAnyPositionInSCLL {

    /* Node */

    static class Node {

        int value;
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
                System.out.print(" -> ");

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

                Node tail = head;

                while (tail.next != head)
                    tail = tail.next;

                tail.next = head.next;

                return head.next;
            }

            Node temp = head;

            for (int i = 1; i < position - 1 && temp.next.next != head; i++)
                temp = temp.next;

            temp.next = temp.next.next;

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
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;

        System.out.println("Original SCLL");
        display(first);

        first = obj.delete(first, 3);

        System.out.println("\nAfter Deleting Position 3");
        display(first);
    }
}

/*

Delete At Any Position In SCLL

Type

✔ Singly Circular Linked List

Example

10 -> 20 -> 30 -> 40 -> 50

Delete Position = 3

Result

10 -> 20 -> 40 -> 50

Algorithm

1. Reach (Position - 1).
2. Skip the target node.
3. Maintain Circular Link.

Edge Cases

✔ Empty List
✔ Single Node
✔ Delete Head
✔ Delete Tail
✔ Delete Middle

Time  : O(n)

Space : O(1)

Interview Points

✔ Head changes only when
deleting Position 1.

✔ Tail must always point to Head.

✔ Only links are changed,
nodes are not shifted.

*/