package linkedlist.singleLinkedList;

public class reorderList {

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

        /* Reorder List */
        public void reorder(Node head) {

            if (head == null || head.next == null)
                return;

            // Find middle
            Node slow = head;
            Node fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse second half
            Node curr = slow.next;
            slow.next = null;
            Node prev = null;
            while (curr != null) {

                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Merge both halves
            Node first = head;
            Node second = prev;

            while (first != null && second != null) {
                Node next1 = first.next;
                Node next2 = second.next;

                first.next = second;
                if (next1 == null)
                    break;

                second.next = next1;

                first = next1;
                second = next2;
            }
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

        obj.reorder(first);

        System.out.println("\nReordered List");
        display(first);
    }
}

/*

Reorder List (LeetCode 143)

Example
1 -> 2 -> 3 -> 4 -> 5

Result
1 -> 5 -> 2 -> 4 -> 3

Algorithm
1. Find middle.
2. Reverse second half.
3. Merge both halves alternately.

Edge Cases
✔ Empty List
✔ Single Node
✔ Even Length
✔ Odd Length

Time  : O(n)

Space : O(1)

Interview Points

✔ Combination of
• Middle of LL
• Reverse LL
• Merge Two Lists

✔ Head never changes.

Reason:
Reordering starts after the first node,
so the first node always remains the head.

✔ Only links are rearranged.
No new node is created.

✔ One of the most frequently asked
Linked List interview questions.

*/