package linkedlist.circularLinkedList;

public class sortedInsertNodeSCLL {

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

        /* Insert In Sorted SCLL */

        public Node insert(Node head, int value) {

            Node newNode = new Node(value);

            // Empty List

            if (head == null) {

                newNode.next = newNode;

                return newNode;
            }

            // Insert Before Head

            if (value <= head.value) {

                Node tail = head;

                while (tail.next != head)
                    tail = tail.next;

                newNode.next = head;
                tail.next = newNode;

                return newNode;
            }

            Node curr = head;

            while (curr.next != head && curr.next.value < value)
                curr = curr.next;

            newNode.next = curr.next;
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
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        System.out.println("Original SCLL");
        display(first);

        first = obj.insert(first, 30);

        System.out.println("\nAfter Inserting 30");
        display(first);

        first = obj.insert(first, 5);

        System.out.println("\nAfter Inserting 5");
        display(first);
    }
}

/*

Sorted Insert In SCLL

Type

✔ Singly Circular Linked List

Example

10 -> 20 -> 40 -> 50

Insert = 30

Result

10 -> 20 -> 30 -> 40 -> 50

Algorithm

1. Find correct position.
2. Insert new node.
3. Maintain circular link.

Edge Cases

✔ Empty List
✔ Insert At Head
✔ Insert At Tail
✔ Insert In Middle

Time  : O(n)

Space : O(1)

Interview Points

✔ List always remains sorted.

✔ Tail always points to Head.

✔ Head changes only when
inserting before first node.

✔ Most Asked SCLL insertion problem.

*/