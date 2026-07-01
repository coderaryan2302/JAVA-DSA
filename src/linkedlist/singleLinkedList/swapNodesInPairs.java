package linkedlist.singleLinkedList;
public class swapNodesInPairs {

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
            if (head.next != null) {
                System.out.print(" -> ");
                head = head.next;          // Move ahead
            }
            System.out.println();
        }
    }

    static class Solution {

        /* Swap every two adjacent nodes */
        public Node swapPairs(Node head) {
            if (head == null || head.next == null){
                return head;
            }
            Node dummy = new Node(0);
            dummy.next = head;

            Node prev = dummy;

            while (prev.next != null && prev.next.next != null) {
                Node first = prev.next;
                Node second = first.next;

                first.next = second.next;
                second.next = first;
                prev.next = second;

                prev = first;          // Move to next pair
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Original List");
        display(first);

        first = obj.swapPairs(first);

        System.out.println("\nAfter Swapping Pairs");
        display(first);
    }
}

/*
Swap Nodes in Pairs (LeetCode 24)

Example
1 -> 2 -> 3 -> 4 -> 5

Result
2 -> 1 -> 4 -> 3 -> 5

Algorithm
1. Create a dummy node.
2. Pick two adjacent nodes.
3. Swap their links.
4. Move to the next pair.

Edge Cases
✔ Empty List
✔ Single Node
✔ Even Length
✔ Odd Length

Time  : O(n)
Space : O(1)

Interview Points
✔ Nodes are swapped, not values.
✔ Dummy node simplifies head handling.
✔ Last node remains unchanged if
the list has odd length.
✔ One of the most common pointer
manipulation interview questions.

*/