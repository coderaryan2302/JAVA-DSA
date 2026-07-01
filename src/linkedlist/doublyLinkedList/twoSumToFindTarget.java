package linkedlist.doublyLinkedList;

public class twoSumToFindTarget {

    /* Doubly Linked List Node */

    static class Node {

        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    /* Display list */

    public static void display(Node head) {

        while (head != null) {

            System.out.print(head.value);

            if (head.next != null)
                System.out.print(" <-> ");

            head = head.next;          // Move ahead
        }

        System.out.println();
    }

    /* Return last node */

    public static Node getTail(Node head) {

        while (head != null && head.next != null)
            head = head.next;          // Reach tail

        return head;
    }

    /* Two Sum in Sorted DLL */

    public static boolean twoSumSorted(Node head, int target) {

        if (head == null)
            return false;

        Node tail = getTail(head);

        while (head != tail && head != tail.next) {

            int sum = head.value + tail.value;

            if (sum == target) {

                System.out.println("Pair Found : " + head.value + " + " + tail.value);
                return true;
            }

            if (sum > target)
                tail = tail.prev;      // Move backward
            else
                head = head.next;      // Move forward
        }

        return false;
    }

    /* Two Sum in Unsorted DLL */

    public static boolean twoSumUnsorted(Node head, int target) {

        Node first = head;

        while (first != null) {

            Node second = first.next;

            while (second != null) {

                if (first.value + second.value == target) {

                    System.out.println("Pair Found : " + first.value + " + " + second.value);
                    return true;
                }

                second = second.next;  // Check next pair
            }

            first = first.next;
        }

        return false;
    }

    public static void main(String[] args) {

        /* Sorted DLL */

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(6);
        Node e = new Node(8);

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        System.out.println("Sorted Doubly Linked List");
        display(a);

        System.out.println("\nTarget = 10");

        if (!twoSumSorted(a, 10))
            System.out.println("Pair Not Found");

        /* Unsorted DLL */

        Node p = new Node(8);
        Node q = new Node(1);
        Node r = new Node(6);
        Node s = new Node(3);
        Node t = new Node(5);

        p.next = q;
        q.prev = p;

        q.next = r;
        r.prev = q;

        r.next = s;
        s.prev = r;

        s.next = t;
        t.prev = s;

        System.out.println("\nUnsorted Doubly Linked List");
        display(p);

        System.out.println("\nTarget = 9");

        if (!twoSumUnsorted(p, 9))
            System.out.println("Pair Not Found");
    }
}

/*

Two Sum in Doubly Linked List

Approach 1 : Sorted DLL

• Head + Tail (Two Pointer)

sum == target → Pair Found
sum > target  → Tail--
sum < target  → Head++

Time  : O(n)
Space : O(1)

Approach 2 : Unsorted DLL

• Nested Loop

Check every possible pair.

Time  : O(n²)
Space : O(1)

Example

Sorted
1 <-> 2 <-> 4 <-> 6 <-> 8
Target = 10
Answer = 2 + 8

Unsorted
8 <-> 1 <-> 6 <-> 3 <-> 5
Target = 9
Answer = 8 + 1

Interview Point

✔ Sorted DLL → Two Pointer (Best)
✔ Unsorted DLL → Nested Loop
✔ No extra HashSet used.

*/