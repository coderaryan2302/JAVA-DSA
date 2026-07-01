package linkedlist.doublyLinkedList;

public class removeDuplicatesFromSortedDLL {

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

            head = head.next;          // Move ahead
        }

        System.out.println();
    }

    static class Solution {

        /* Remove Duplicate Nodes */

        public Node remove(Node head) {

            if (head == null || head.next == null)
                return head;

            Node curr = head;

            while (curr != null && curr.next != null) {

                if (curr.value == curr.next.value) {

                    curr.next = curr.next.next;

                    if (curr.next != null)
                        curr.next.prev = curr;

                } else {

                    curr = curr.next;
                }
            }

            return head;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(1);
        Node second = new Node(1);
        Node third = new Node(2);
        Node fourth = new Node(3);
        Node fifth = new Node(3);
        Node sixth = new Node(4);

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        fifth.next = sixth;
        sixth.prev = fifth;

        System.out.println("Original DLL");
        display(first);

        first = obj.remove(first);

        System.out.println("\nAfter Removing Duplicates");
        display(first);
    }
}

/*

Remove Duplicates From Sorted DLL

Example

1 <-> 1 <-> 2 <-> 3 <-> 3 <-> 4

Result

1 <-> 2 <-> 3 <-> 4

Algorithm

1. Traverse the DLL.
2. Compare current and next node.
3. If equal, remove next node.
4. Otherwise move ahead.

Edge Cases

✔ Empty DLL
✔ Single Node
✔ No Duplicates
✔ All Duplicates

Time  : O(n)

Space : O(1)

Interview Points

✔ Works only for Sorted DLL.

✔ Only duplicate links are removed.

✔ Update both Next and Prev pointers.

✔ Very common GFG interview question.

*/