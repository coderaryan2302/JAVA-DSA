package linkedlist.doublyLinkedList;

public class merge2SortedDLL {

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

        /* Merge Two Sorted DLL */

        public Node merge(Node first, Node second) {

            if (first == null) return second;
            if (second == null) return first;

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

            if (first != null) {

                tail.next = first;
                first.prev = tail;

            } else if (second != null) {

                tail.next = second;
                second.prev = tail;
            }

            dummy.next.prev = null;    // Remove dummy link

            return dummy.next;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // First DLL

        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        // Second DLL

        Node x = new Node(2);
        Node y = new Node(4);
        Node z = new Node(6);

        x.next = y;
        y.prev = x;

        y.next = z;
        z.prev = y;

        System.out.println("First DLL");
        display(a);

        System.out.println("\nSecond DLL");
        display(x);

        Node head = obj.merge(a, x);

        System.out.println("\nMerged DLL");
        display(head);
    }
}

/*

Merge Two Sorted DLL

Example

1 <-> 3 <-> 5

2 <-> 4 <-> 6

Result

1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6

Algorithm

1. Compare both nodes.
2. Attach smaller node.
3. Move that pointer.
4. Attach remaining nodes.

Edge Cases

✔ Empty DLL
✔ Single Node
✔ Different Lengths
✔ Duplicate Values

Time  : O(n + m)

Space : O(1)

Interview Points

✔ Same as Merge Two Sorted SLL.

✔ Update both Next and Prev pointers.

✔ Dummy node simplifies merging.

✔ Result remains sorted.

*/