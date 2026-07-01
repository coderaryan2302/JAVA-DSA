package linkedlist.singleLinkedList;

public class KrotationList {

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

        /* Rotate list to the right */

        public Node rotateRight(Node head, int k) {

            if (head == null || head.next == null || k == 0)
                return head;

            int length = 1;

            Node tail = head;

            while (tail.next != null) {
                tail = tail.next;
                length++;
            }

            k %= length;

            if (k == 0)
                return head;

            tail.next = head;              // Make circular

            int steps = length - k;

            Node newTail = tail;

            while (steps-- > 0)
                newTail = newTail.next;

            Node newHead = newTail.next;

            newTail.next = null;           // Break circle

            return newHead;
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

        first = obj.rotateRight(first, 2);

        System.out.println("\nAfter Rotation");
        display(first);
    }
}

/*

Rotate List (LeetCode 61)

Example

1 -> 2 -> 3 -> 4 -> 5

k = 2

Result

4 -> 5 -> 1 -> 2 -> 3

Algorithm

1. Find length and tail.
2. Connect tail to head.
3. Find new tail.
4. Break the circle.

Edge Cases

✔ Empty List
✔ Single Node
✔ k = 0
✔ k > Length

Time  : O(n)

Space : O(1)

Interview Points

✔ Convert list into Circular Linked List.

✔ k = k % length
Reason:
Rotating length times gives the same list.

✔ New Tail = (length - k)th node.

✔ New Head = NewTail.next

✔ Break the circle to get the final list.

*/