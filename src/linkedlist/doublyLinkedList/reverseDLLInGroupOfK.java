package linkedlist.doublyLinkedList;

public class reverseDLLInGroupOfK {

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

        /* Reverse every K nodes */

        public Node reverse(Node head, int k) {

            if (head == null)
                return null;

            Node curr = head;
            Node newHead = null;
            int count = 0;

            while (curr != null && count < k) {

                Node next = curr.next;

                curr.next = curr.prev;
                curr.prev = next;

                newHead = curr;
                curr = next;
                count++;
            }

            if (curr != null) {

                head.next = reverse(curr, k);

                if (head.next != null)
                    head.next.prev = head;
            }

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
        Node sixth = new Node(6);

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

        first = obj.reverse(first, 2);

        System.out.println("\nReverse Every 2 Nodes");
        display(first);
    }
}

/*

Reverse DLL In Groups Of K

Example

1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6

k = 2

Result

2 <-> 1 <-> 4 <-> 3 <-> 6 <-> 5

Algorithm

1. Reverse first k nodes.
2. Recursively reverse remaining list.
3. Connect both groups.

Edge Cases

✔ Empty List
✔ Single Node
✔ k = 1
✔ k > Length

Time  : O(n)

Space : O(n)
(Recursion Stack)

Interview Points

✔ Reverse only k nodes at a time.

✔ Connect last node of current group
with next reversed group.

✔ Similar to Reverse K Group in SLL,
but update both Prev and Next pointers.

*/