package linkedlist.doublyLinkedList;

public class palindrome {

    /* Doubly Linked List Node */

    static class Node {

        int value;
        Node prev;
        Node next;

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

        if (head == null)
            return null;

        while (head.next != null)
            head = head.next;          // Reach tail

        return head;
    }

    static class Solution {

        /* Check palindrome using two pointers */

        public boolean isPalindrome(Node head) {

            if (head == null || head.next == null)
                return true;

            Node left = head;
            Node right = getTail(head);

            while (left != right && left.prev != right) {

                if (left.value != right.value)
                    return false;

                left = left.next;      // Move forward
                right = right.prev;    // Move backward
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        /* Palindrome List */

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(1);

        first.next = second;

        second.prev = first;
        second.next = third;

        third.prev = second;
        third.next = fourth;

        fourth.prev = third;
        fourth.next = fifth;

        fifth.prev = fourth;

        System.out.println("Palindrome Doubly Linked List");
        display(first);
        System.out.println("Is Palindrome : " + obj.isPalindrome(first));

        /* Non-Palindrome List */

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev = c;

        System.out.println("\nNon Palindrome Doubly Linked List");
        display(a);
        System.out.println("Is Palindrome : " + obj.isPalindrome(a));
    }
}

/*

Palindrome in Doubly Linked List

A list is Palindrome if
Forward == Backward.

Example

1 <-> 2 <-> 3 <-> 2 <-> 1

Algorithm

1. Left = Head
2. Right = Tail
3. Compare both values.
4. If different, return false.
5. Move Left++, Right--.
6. Repeat until pointers meet.

Why DLL?

✔ Previous pointer allows backward traversal.
✔ No need to reverse the list.

Edge Cases

✔ Empty List
✔ Single Node
✔ Even Length
✔ Odd Length
✔ Duplicate Values

Time  : O(n)
Space : O(1)

Interview Point

✔ Two Pointer approach.
✔ Compare from both ends.
✔ DLL makes palindrome checking easier than SLL.

*/