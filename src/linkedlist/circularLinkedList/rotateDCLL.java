package linkedlist.circularLinkedList;

public class rotateDCLL {

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

        /* Rotate DCLL */

        public Node rotate(Node head, int k) {

            if (head == null || head.next == head || k == 0)
                return head;

            int size = 1;

            Node temp = head;

            while (temp.next != head) {

                size++;
                temp = temp.next;
            }

            k %= size;

            while (k-- > 0)
                head = head.next;

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

        first = obj.rotate(first, 2);

        System.out.println("\nAfter Rotating By 2");
        display(first);

        /*
        Output

        Original DCLL

        10 <-> 20 <-> 30 <-> 40 <-> 50

        After Rotating By 2

        30 <-> 40 <-> 50 <-> 10 <-> 20
        */
    }
}

/*

Rotate DCLL

Type

✔ Doubly Circular Linked List

Example

10 <-> 20 <-> 30 <-> 40 <-> 50

Rotate = 2

Result

30 <-> 40 <-> 50 <-> 10 <-> 20

Algorithm

1. Count total nodes.
2. k = k % size.
3. Move Head k times.
4. New Head is rotated list.

Edge Cases

✔ Empty List
✔ Single Node
✔ k = 0
✔ k > Size

Time  : O(n)

Space : O(1)

Interview Points

✔ Only Head changes.

✔ No links are modified.

✔ Circular links remain unchanged.

✔ One of the most common DCLL interview questions.

*/