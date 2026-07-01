package linkedlist.circularLinkedList;

public class insertAtAnyPositionInDCLL {

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

        /* Insert At Any Position */

        public Node insert(Node head, int position, int value) {

            Node newNode = new Node(value);

            // Empty List

            if (head == null) {

                newNode.next = newNode;
                newNode.prev = newNode;

                return newNode;
            }

            // Insert At Head

            if (position == 1) {

                Node tail = head.prev;

                newNode.next = head;
                newNode.prev = tail;

                tail.next = newNode;
                head.prev = newNode;

                return newNode;
            }

            Node curr = head;

            for (int i = 1; i < position - 1 && curr.next != head; i++)
                curr = curr.next;

            newNode.next = curr.next;
            newNode.prev = curr;

            curr.next.prev = newNode;
            curr.next = newNode;

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
        second.prev = first;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = first;
        first.prev = fourth;

        System.out.println("Original DCLL");
        display(first);

        first = obj.insert(first, 3, 30);

        System.out.println("\nAfter Inserting 30");
        display(first);
    }
}

/*

Insert At Any Position In DCLL

Type

✔ Doubly Circular Linked List

Example

10 <-> 20 <-> 40 <-> 50

Insert

Position = 3

Value = 30

Result

10 <-> 20 <-> 30 <-> 40 <-> 50

Algorithm

1. Reach (Position - 1).
2. Create new node.
3. Update Next and Prev.
4. Maintain Circular Links.

Edge Cases

✔ Empty List
✔ Insert At Head
✔ Insert At Tail
✔ Insert In Middle

Time  : O(n)

Space : O(1)

Interview Points

✔ Update both Next and Prev.

✔ Head changes only when
inserting at Position 1.

✔ Tail.next = Head

✔ Head.prev = Tail

*/