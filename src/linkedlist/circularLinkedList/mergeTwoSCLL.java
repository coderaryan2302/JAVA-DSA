package linkedlist.circularLinkedList;

public class mergeTwoSCLL {

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

        /* Merge Two SCLL */

        public Node merge(Node head1, Node head2) {

            if (head1 == null)
                return head2;

            if (head2 == null)
                return head1;

            Node tail1 = head1;
            while (tail1.next != head1)
                tail1 = tail1.next;

            Node tail2 = head2;
            while (tail2.next != head2)
                tail2 = tail2.next;

            tail1.next = head2;
            tail2.next = head1;

            return head1;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // First SCLL

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;
        third.next = first;

        // Second SCLL

        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = fourth;

        System.out.println("First SCLL");
        display(first);

        System.out.println("\nSecond SCLL");
        display(fourth);

        Node head = obj.merge(first, fourth);

        System.out.println("\nMerged SCLL");
        display(head);
    }
}

/*

Merge Two SCLL

Type

✔ Singly Circular Linked List

Example

10 -> 20 -> 30

40 -> 50 -> 60

Result

10 -> 20 -> 30 -> 40 -> 50 -> 60

Algorithm

1. Find tail of both lists.
2. Connect Tail1 to Head2.
3. Connect Tail2 to Head1.

Edge Cases

✔ First List Empty
✔ Second List Empty
✔ Single Node
✔ Multiple Nodes

Time  : O(n + m)

Space : O(1)

Interview Points

✔ Find both tail nodes.

✔ Maintain circular property.

✔ No new node is created.

✔ Links are only rearranged.

*/