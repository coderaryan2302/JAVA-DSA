package linkedlist.circularLinkedList;

public class splitDCLLIntoTwoHalves {

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

        if (head == null)
            return;

        Node temp = head;

        do {

            System.out.print(temp.value);

            if (temp.next != head)
                System.out.print(" <-> ");

            temp = temp.next;

        } while (temp != head);

        System.out.println();
    }

    static class Solution {

        /* Split DCLL Into Two Halves */

        public Node[] split(Node head) {

            Node[] ans = new Node[2];

            if (head == null)
                return ans;

            if (head.next == head) {

                ans[0] = head;
                return ans;
            }

            Node slow = head;
            Node fast = head;

            while (fast.next != head && fast.next.next != head) {

                slow = slow.next;
                fast = fast.next.next;
            }

            if (fast.next.next == head)
                fast = fast.next;

            Node firstHead = head;
            Node secondHead = slow.next;

            Node firstTail = slow;
            Node secondTail = fast;

            // First Half

            firstTail.next = firstHead;
            firstHead.prev = firstTail;

            // Second Half

            secondTail.next = secondHead;
            secondHead.prev = secondTail;

            ans[0] = firstHead;
            ans[1] = secondHead;

            return ans;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

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

        sixth.next = first;
        first.prev = sixth;

        System.out.println("Original DCLL");
        display(first);

        Node[] ans = obj.split(first);

        System.out.println("\nFirst Half");
        display(ans[0]);

        System.out.println("\nSecond Half");
        display(ans[1]);
    }
}

/*

Split DCLL Into Two Halves

Type

✔ Doubly Circular Linked List

Example

10 <-> 20 <-> 30 <-> 40 <-> 50 <-> 60

Result

First Half

10 <-> 20 <-> 30

Second Half

40 <-> 50 <-> 60

Algorithm

1. Find middle using Slow & Fast.
2. Split the list.
3. Update Next and Prev.
4. Make both halves circular.

Edge Cases

✔ Empty List
✔ Single Node
✔ Even Nodes
✔ Odd Nodes

Time  : O(n)

Space : O(1)

Interview Points

✔ Slow & Fast Pointer is used.

✔ Both halves remain Doubly Circular.

✔ Update both Next and Prev pointers.

✔ If nodes are odd,
first half gets one extra node.

✔ Most Asked DCLL interview question.

*/