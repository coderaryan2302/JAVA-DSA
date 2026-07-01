package linkedlist.singleLinkedList;

public class multiplyTwoLL {

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

            head = head.next;
        }

        System.out.println();
    }

    static class Solution {

        /* Multiply two linked list numbers */

        public long multiply(Node first, Node second) {

            long num1 = 0;
            long num2 = 0;

            while (first != null) {

                num1 = num1 * 10 + first.value;
                first = first.next;
            }

            while (second != null) {

                num2 = num2 * 10 + second.value;
                second = second.next;
            }

            return num1 * num2;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        /*
        Number 1 = 123
        1 -> 2 -> 3

        Number 2 = 45
        4 -> 5

        Result = 5535
        */

        Node first = new Node(1);
        first.next = new Node(2);
        first.next.next = new Node(3);

        Node second = new Node(4);
        second.next = new Node(5);

        System.out.println("First Number");
        display(first);

        System.out.println("\nSecond Number");
        display(second);

        System.out.println("\nProduct = " + obj.multiply(first, second));
    }
}

/*

Multiply Two Linked Lists

Example

1 -> 2 -> 3
4 -> 5

Result

5535

Reason

123 × 45 = 5535

Algorithm

1. Convert first list into number.
2. Convert second list into number.
3. Multiply both numbers.

Edge Cases

✔ Empty List
✔ Single Node
✔ Leading Zero

Time  : O(n + m)

Space : O(1)

Interview Points

✔ Digits are stored in Forward Order.

✔ Convert list into numbers.

✔ Large numbers may overflow.

✔ GFG version usually uses modulo
(10^9 + 7) for very large inputs.

*/