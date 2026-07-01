package linkedlist.singleLinkedList;

public class addTwoNumbersInReverseOrder {

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

        /* Add two linked list numbers */

        public Node add(Node head1, Node head2) {

            Node dummy = new Node(0);
            Node temp = dummy;

            int carry = 0;

            while (head1 != null || head2 != null || carry != 0) {

                int first = 0;
                int second = 0;

                if (head1 != null) {
                    first = head1.value;
                    head1 = head1.next;
                }

                if (head2 != null) {
                    second = head2.value;
                    head2 = head2.next;
                }

                int sum = first + second + carry;

                carry = sum / 10;

                temp.next = new Node(sum % 10);

                temp = temp.next;
            }

            return dummy.next;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        /*
        Number 1 = 342
        2 -> 4 -> 3

        Number 2 = 465
        5 -> 6 -> 4

        Result = 807
        7 -> 0 -> 8
        */

        Node first = new Node(2);
        first.next = new Node(4);
        first.next.next = new Node(3);

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

Add Two Numbers (LeetCode 2)

Example

2 -> 4 -> 3
5 -> 6 -> 4

Result

7 -> 0 -> 8

Reason

342 + 465 = 807

Algorithm

1. Traverse both lists.
2. Add digits and carry.
3. Store last digit.
4. Update carry.
5. Repeat until all nodes are processed.

Edge Cases

✔ Empty List
✔ Different Length Lists
✔ Final Carry
✔ Single Node

Time  : O(max(n,m))

Space : O(max(n,m))

Interview Points

✔ Digits are stored in reverse order.

✔ Carry is added in every iteration.

✔ Dummy node avoids special handling for the first node.

✔ Original linked lists remain unchanged.

✔ If carry remains at the end, create one extra node.

*/