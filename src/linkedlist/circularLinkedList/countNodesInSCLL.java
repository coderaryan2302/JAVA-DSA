package linkedlist.circularLinkedList;

public class countNodesInSCLL {

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

        /* Count Nodes */

        public int count(Node head) {

            if (head == null)
                return 0;

            int count = 0;

            Node temp = head;

            do {

                count++;

                temp = temp.next;

            } while (temp != head);

            return count;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        System.out.println("Circular Linked List");
        display(first);

        System.out.println("\nTotal Nodes = " + obj.count(first));
    }
}

/*

Count Nodes In SCLL

Type

✔ Singly Circular Linked List

Example

10 -> 20 -> 30 -> 40

Result

Total Nodes = 4

Algorithm

1. Start from Head.
2. Traverse until Head comes again.
3. Count every node.

Edge Cases

✔ Empty List
✔ Single Node
✔ Multiple Nodes

Time  : O(n)

Space : O(1)

Interview Points

✔ do-while loop is preferred.

✔ Stop when Head is reached again.

✔ Most basic SCLL problem.

*/