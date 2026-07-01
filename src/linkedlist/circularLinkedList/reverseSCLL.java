package linkedlist.circularLinkedList;

public class reverseSCLL {

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

        /* Reverse SCLL */

        public Node reverse(Node head) {

            if (head == null || head.next == head)
                return head;

            Node prev = null;
            Node curr = head;
            Node next;

            Node tail = head;

            while (tail.next != head)
                tail = tail.next;

            do {

                next = curr.next;

                curr.next = prev;

                prev = curr;
                curr = next;

            } while (curr != head);

            head.next = tail;
            head = tail;

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

        first = obj.reverse(first);

        System.out.println("\nReversed SCLL");
        display(first);
    }
}

/*

Reverse SCLL

Type

✔ Singly Circular Linked List

Example

10 -> 20 -> 30 -> 40 -> 50

Result

50 -> 40 -> 30 -> 20 -> 10

Algorithm

1. Find Tail.
2. Reverse all links.
3. Old Head becomes Tail.
4. Old Tail becomes New Head.

Edge Cases

✔ Empty List
✔ Single Node
✔ Two Nodes

Time  : O(n)

Space : O(1)

Interview Points

✔ Reverse links like SLL.

✔ Finally connect old Head
to the new Head.

✔ Circular property must remain intact.

✔ Most important SCLL pointer problem.

*/