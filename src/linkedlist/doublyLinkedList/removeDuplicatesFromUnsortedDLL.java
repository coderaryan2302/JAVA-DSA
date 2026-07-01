package linkedlist.doublyLinkedList;

public class removeDuplicatesFromUnsortedDLL {

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

        /* Remove Duplicates */

        public Node remove(Node head) {

            if (head == null || head.next == null)
                return head;

            Node curr = head;

            while (curr != null) {

                Node temp = curr.next;

                while (temp != null) {

                    Node next = temp.next;      // Save next node

                    if (curr.value == temp.value) {

                        temp.prev.next = temp.next;   // Remove duplicate

                        if (temp.next != null)
                            temp.next.prev = temp.prev;
                    }

                    temp = next;
                }

                curr = curr.next;
            }

            return head;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(4);
        Node second = new Node(2);
        Node third = new Node(4);
        Node fourth = new Node(1);
        Node fifth = new Node(2);
        Node sixth = new Node(5);
        Node seventh = new Node(1);

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

        sixth.next = seventh;
        seventh.prev = sixth;

        System.out.println("Original DLL");
        display(first);

        first = obj.remove(first);

        System.out.println("\nAfter Removing Duplicates");
        display(first);
    }
}

/*

Remove Duplicates From Unsorted DLL

Example

4 <-> 2 <-> 4 <-> 1 <-> 2 <-> 5 <-> 1

Result

4 <-> 2 <-> 1 <-> 5

Algorithm

1. Pick one node.
2. Compare it with all next nodes.
3. Delete duplicate nodes.
4. Repeat for remaining nodes.

Edge Cases

✔ Empty DLL
✔ Single Node
✔ No Duplicates
✔ All Duplicates

Time  : O(n²)

Space : O(1)

Interview Points

✔ No HashSet is used.

✔ First occurrence is kept.

✔ Update both Next and Prev pointers.

✔ Classic Brute Force Interview Solution.

*/