package linkedlist.circularLinkedList;

public class insertAtAnyPositionInSCLL {

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

        /* Insert At Any Position */

        public Node insert(Node head, int position, int value) {

            Node newNode = new Node(value);

            // Empty List

            if (head == null) {

                newNode.next = newNode;
                return newNode;
            }

            // Insert At Head

            if (position == 1) {

                Node tail = head;

                while (tail.next != head)
                    tail = tail.next;

                newNode.next = head;
                tail.next = newNode;

                return newNode;
            }

            Node temp = head;

            for (int i = 1; i < position - 1 && temp.next != head; i++)
                temp = temp.next;

            newNode.next = temp.next;
            temp.next = newNode;

            return head;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(40);
        Node fourth = new Node(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        System.out.println("Original SCLL");
        display(first);

        first = obj.insert(first, 3, 30);

        System.out.println("\nAfter Inserting 30 At Position 3");
        display(first);
    }
}

/*

Insert At Any Position In SCLL

Type

✔ Singly Circular Linked List

Example

10 -> 20 -> 40 -> 50

Insert

Position = 3

Value = 30

Result

10 -> 20 -> 30 -> 40 -> 50

Algorithm

1. Reach (Position - 1).
2. Insert new node.
3. Update links.
4. Maintain Circular Link.

Edge Cases

✔ Empty List
✔ Insert At Head
✔ Insert At Tail
✔ Insert In Middle

Time  : O(n)

Space : O(1)

Interview Points

✔ Head changes only when
inserting at Position 1.

✔ Tail must always point to Head.

✔ One of the basic SCLL insertion problems.

*/