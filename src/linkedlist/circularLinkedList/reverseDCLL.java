package linkedlist.circularLinkedList;

public class reverseDCLL {

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

        /* Reverse DCLL */

        public Node reverse(Node head) {

            if (head == null || head.next == head)
                return head;

            Node curr = head;

            do {

                Node next = curr.next;

                curr.next = curr.prev;
                curr.prev = next;

                curr = next;

            } while (curr != head);

            return head.next;      // Old tail becomes new head
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

        first = obj.reverse(first);

        System.out.println("\nReversed DCLL");
        display(first);
    }
}

/*

Reverse DCLL

Type

✔ Doubly Circular Linked List

Example

10 <-> 20 <-> 30 <-> 40 <-> 50

Result

50 <-> 40 <-> 30 <-> 20 <-> 10

Algorithm

1. Swap Next and Prev.
2. Move using original Next.
3. Repeat for all nodes.
4. Old Tail becomes new Head.

Edge Cases

✔ Empty List
✔ Single Node
✔ Two Nodes

Time  : O(n)

Space : O(1)

Interview Points

✔ Swap Next and Prev for every node.

✔ Circular property remains unchanged.

✔ New Head is the old Tail.

✔ Most important DCLL interview question.

*/