package linkedlist.singleLinkedList;

public class addTwoNumbersInForwardOrder {

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

    /* Reverse Linked List */

    public static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    static class Solution {

        /* Add two numbers in forward order */

        public Node add(Node head1, Node head2) {

            head1 = reverse(head1);
            head2 = reverse(head2);

            Node dummy = new Node(0);
            Node tail = dummy;

            int carry = 0;

            while (head1 != null || head2 != null || carry != 0) {

                int digit1 = 0;
                int digit2 = 0;

                if (head1 != null) {
                    digit1 = head1.value;
                    head1 = head1.next;
                }

                if (head2 != null) {
                    digit2 = head2.value;
                    head2 = head2.next;
                }

                int sum = digit1 + digit2 + carry;

                carry = sum / 10;

                tail.next = new Node(sum % 10);
                tail = tail.next;
            }

            return reverse(dummy.next);
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        /*
        Number 1 = 7243
        7 -> 2 -> 4 -> 3

        Number 2 = 564
        5 -> 6 -> 4

        Result = 7807
        7 -> 8 -> 0 -> 7
        */

        Node first = new Node(7);
        first.next = new Node(2);
        first.next.next = new Node(4);
        first.next.next.next = new Node(3);

        Node second = new Node(5);
        second.next = new Node(6);
        second.next.next = new Node(4);

        System.out.println("First Number");
        display(first);

        System.out.println("\nSecond Number");
        display(second);

        Node ans = obj.add(first, second);

        System.out.println("\nSum");
        display(ans);
    }
}

/*

Add Two Numbers II (LeetCode 445)

Digits are stored in Forward Order.

Example

7 -> 2 -> 4 -> 3
5 -> 6 -> 4

Result

7 -> 8 -> 0 -> 7

Reason

7243 + 564 = 7807

Algorithm

1. Reverse both lists.
2. Add digits with carry.
3. Reverse the answer.

Edge Cases

✔ Empty List
✔ Different Length Lists
✔ Final Carry
✔ Single Node

Time  : O(n + m)

Space : O(max(n,m))

Interview Points

✔ Digits are stored in Forward Order.

✔ Reverse both lists to simplify addition.

✔ Reverse the final answer.

✔ Original lists are modified due to reversal.
(Reverse again if original order must be preserved.)

✔ Follow-up:
This problem can also be solved without reversing
using two stacks.

*/