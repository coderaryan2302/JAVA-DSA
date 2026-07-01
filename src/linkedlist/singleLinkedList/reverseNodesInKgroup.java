package linkedlist.singleLinkedList;

public class reverseNodesInKgroup {

    /* Node */
    static class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    /* Display List */
    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.value);

            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;          // Move ahead
        }
        System.out.println();
    }

    static class Solution {

        /* Reverse nodes in groups of k */
        public Node reverseKGroup(Node head, int k) {

            if (head == null || k <= 1)
                return head;

            Node dummy = new Node(0);
            dummy.next = head;

            Node prevGroup = dummy;

            while (true) {
                Node kth = prevGroup;
                for (int i = 0; i < k && kth != null; i++)
                    kth = kth.next;

                if (kth == null)
                    break;

                Node nextGroup = kth.next;

                Node prev = nextGroup;
                Node curr = prevGroup.next;

                while (curr != nextGroup) {
                    Node next = curr.next;
                    curr.next = prev;

                    prev = curr;
                    curr = next;
                }

                Node temp = prevGroup.next;

                prevGroup.next = kth;
                prevGroup = temp;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(1);
        first.next = new Node(2);
        first.next.next = new Node(3);
        first.next.next.next = new Node(4);
        first.next.next.next.next = new Node(5);

        System.out.println("Original List");
        display(first);

        first = obj.reverseKGroup(first, 2);

        System.out.println("\nAfter Reversing Every 2 Nodes");
        display(first);
    }
}

/*
Reverse Nodes in K Group (LeetCode 25)

Example
1 -> 2 -> 3 -> 4 -> 5

k = 2

Result
2 -> 1 -> 4 -> 3 -> 5

Algorithm
1. Find kth node.
2. Reverse current group.
3. Connect with next group.
4. Repeat for remaining nodes.

Edge Cases
✔ Empty List
✔ Single Node
✔ k = 1
✔ k > Length
✔ Last group < k (Do not reverse)

Time  : O(n)

Space : O(1)

Interview Points
✔ Reverse only complete groups.
✔ Last incomplete group remains unchanged.
✔ Dummy node simplifies head handling.
✔ One of the most important Linked List interview questions.

*/