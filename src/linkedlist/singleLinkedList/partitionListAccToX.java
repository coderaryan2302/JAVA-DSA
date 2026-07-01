package linkedlist.singleLinkedList;

public class partitionListAccToX {

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

        /* Partition list around x */
        public Node partition(Node head, int x) {

            Node smallDummy = new Node(0);
            Node largeDummy = new Node(0);

            Node small = smallDummy;
            Node large = largeDummy;

            while (head != null) {

                if (head.value < x) {

                    small.next = head;
                    small = small.next;

                } else {

                    large.next = head;
                    large = large.next;
                }

                head = head.next;
            }

            large.next = null;             // End larger list
            small.next = largeDummy.next;  // Join both lists

            return smallDummy.next;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(1);
        Node second = new Node(4);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(5);
        Node sixth = new Node(2);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        System.out.println("Original List");
        display(first);

        first = obj.partition(first, 3);

        System.out.println("\nPartition List");
        display(first);
    }
}

/*

Partition List (LeetCode 86)

Example

1 -> 4 -> 3 -> 2 -> 5 -> 2

x = 3

Result

1 -> 2 -> 2 -> 4 -> 3 -> 5

Algorithm

1. Create two lists.
2. Small list (< x)
3. Large list (>= x)
4. Join both lists.

Edge Cases

✔ Empty List
✔ Single Node
✔ All Nodes < x
✔ All Nodes >= x

Time  : O(n)

Space : O(1)

Interview Points

✔ Relative order is maintained.

✔ Two dummy nodes simplify the solution.

✔ No new data nodes are created.
Only links are rearranged.

✔ Stable partition of Linked List.

*/