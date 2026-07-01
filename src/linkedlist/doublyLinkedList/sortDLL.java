package linkedlist.doublyLinkedList;

public class sortDLL {

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

        while (head != null) {

            System.out.print(head.value);

            if (head.next != null)
                System.out.print(" <-> ");

            head = head.next;
        }

        System.out.println();
    }

    static class Solution {

        /* Sort DLL */

        public Node sort(Node head) {

            if (head == null || head.next == null)
                return head;

            Node middle = getMiddle(head);
            Node second = middle.next;

            middle.next = null;
            second.prev = null;

            Node left = sort(head);
            Node right = sort(second);

            return merge(left, right);
        }

        /* Find Middle */

        private Node getMiddle(Node head) {

            Node slow = head;
            Node fast = head;

            while (fast.next != null && fast.next.next != null) {

                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        /* Merge Two Sorted DLL */

        private Node merge(Node first, Node second) {

            Node dummy = new Node(0);
            Node tail = dummy;

            while (first != null && second != null) {

                if (first.value <= second.value) {

                    tail.next = first;
                    first.prev = tail;
                    first = first.next;

                } else {

                    tail.next = second;
                    second.prev = tail;
                    second = second.next;
                }

                tail = tail.next;
            }

            tail.next = (first != null) ? first : second;

            if (tail.next != null)
                tail.next.prev = tail;

            dummy.next.prev = null;

            return dummy.next;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(5);
        Node second = new Node(2);
        Node third = new Node(8);
        Node fourth = new Node(1);
        Node fifth = new Node(4);

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.println("Original DLL");
        display(first);

        first = obj.sort(first);

        System.out.println("\nSorted DLL");
        display(first);
    }
}

/*

Sort Doubly Linked List

Example

5 <-> 2 <-> 8 <-> 1 <-> 4

Result

1 <-> 2 <-> 4 <-> 5 <-> 8

Algorithm

1. Find middle.
2. Split DLL.
3. Sort both halves.
4. Merge both sorted DLLs.

Edge Cases

✔ Empty DLL
✔ Single Node
✔ Already Sorted
✔ Reverse Sorted

Time  : O(n log n)

Space : O(log n)

Interview Points

✔ Merge Sort is best for Linked List.

✔ Update both Next and Prev pointers.

✔ Same concept as SLL Merge Sort.

✔ One of the most important DLL interview questions.

*/