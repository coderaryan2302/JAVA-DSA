package linkedlist.doublyLinkedList;

public class tripleSumToFindTarget{

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

    /* Find Tail */

    public static Node getTail(Node head) {

        while (head != null && head.next != null)
            head = head.next;

        return head;
    }

    static class Solution {

        /* Print All Triplets */

        public void tripletSum(Node head, int target) {

            if (head == null)
                return;

            boolean found = false;

            for (Node first = head; first != null; first = first.next) {

                Node left = first.next;
                Node right = getTail(first);

                while (left != null && right != null &&
                        left != right && left.prev != right) {

                    int sum = first.value + left.value + right.value;

                    if (sum == target) {

                        System.out.println(first.value + " + "
                                + left.value + " + "
                                + right.value);

                        found = true;

                        left = left.next;
                        right = right.prev;

                    } else if (sum < target) {

                        left = left.next;

                    } else {

                        right = right.prev;
                    }
                }
            }

            if (!found)
                System.out.println("No Triplet Found");
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(4);
        Node fourth = new Node(5);
        Node fifth = new Node(6);
        Node sixth = new Node(8);
        Node seventh = new Node(9);

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

        System.out.println("Sorted DLL");
        display(first);

        System.out.println("\nTarget = 15");

        obj.tripletSum(first, 15);
    }
}

/*

Triplet Sum In Sorted DLL

Example

1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9

Target = 15

Result

1 + 5 + 9

1 + 6 + 8

2 + 4 + 9

Algorithm

1. Fix first node.
2. Use two pointers for remaining DLL.
3. Print every valid triplet.

Edge Cases

✔ Empty DLL
✔ Single Node
✔ No Triplet
✔ Multiple Triplets

Time  : O(n²)

Space : O(1)

Interview Points

✔ Works only for Sorted DLL.

✔ Uses Two Pointer approach.

✔ Extension of Pair Sum problem.

✔ Common GFG interview question.

*/
