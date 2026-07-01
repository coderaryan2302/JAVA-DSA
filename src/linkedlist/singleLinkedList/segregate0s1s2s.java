package linkedlist.singleLinkedList;
public class segregate0s1s2s {

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
            if (head.next != null) {

                System.out.print(" -> ");
            }
            head = head.next;          // Move ahead
        }
        System.out.println();
    }

    static class Solution {

        /* Sort 0, 1 and 2 */
        public Node sort(Node head) {

            if (head == null || head.next == null)
                return head;

            Node zeroDummy = new Node(-1);
            Node oneDummy = new Node(-1);
            Node twoDummy = new Node(-1);

            Node zero = zeroDummy;
            Node one = oneDummy;
            Node two = twoDummy;

            while (head != null) {
                if (head.value == 0) {
                    zero.next = head;
                    zero = zero.next;

                }
                else if (head.value == 1) {
                    one.next = head;
                    one = one.next;

                }
                else {
                    two.next = head;
                    two = two.next;
                }

                head = head.next;
            }

            zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;

            one.next = twoDummy.next;

            two.next = null;

            return zeroDummy.next;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(2);
        first.next = new Node(1);
        first.next.next = new Node(0);
        first.next.next.next = new Node(2);
        first.next.next.next.next = new Node(1);
        first.next.next.next.next.next = new Node(0);

        System.out.println("Original List");
        display(first);

        first = obj.sort(first);

        System.out.println("\nSorted List");
        display(first);
    }
}

/*
Segregate 0s, 1s and 2s

Example
2 -> 1 -> 0 -> 2 -> 1 -> 0

Result
0 -> 0 -> 1 -> 1 -> 2 -> 2

Algorithm
1. Create three lists.
2. Store 0s, 1s and 2s separately.
3. Join all three lists.

Edge Cases
✔ Empty List
✔ Single Node
✔ Only 0s
✔ Only 1s
✔ Only 2s

Time  : O(n)

Space : O(1)

Interview Points
✔ Relative order is maintained.
✔ No new data nodes are created.
✔ Only links are changed.
✔ Better than counting approach when
node values should not be modified.

*/