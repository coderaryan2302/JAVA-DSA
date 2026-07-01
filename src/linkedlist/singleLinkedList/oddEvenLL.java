package linkedlist.singleLinkedList;

public class oddEvenLL {

    static class ListNode {
        int value;
        ListNode next;

        ListNode() {
        }

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void display(ListNode head) {

        while (head != null) {

            System.out.print(head.value);

            if (head.next != null)
                System.out.print(" -> ");

            head = head.next; // Move to next node
        }

        System.out.println();
    }

    static class Solution {

        public ListNode oddEven(ListNode head) {

            if (head == null || head.next == null) return head;

            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even; // Save even list

            while (even != null && even.next != null) {

                odd.next = even.next;  // Connect odd nodes
                odd = odd.next;        // Move odd

                even.next = odd.next;  // Connect even nodes
                even = even.next;      // Move even
            }

            odd.next = evenHead; // Attach even list

            return head;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println("Original Linked List");
        display(head);

        head = obj.oddEven(head);

        System.out.println("\nAfter Rearranging");
        display(head);
    }
}

/*
Odd Even Linked List (LeetCode 328)

Important:
Odd & Even means node position,
not node value.

Correct:
Odd Position  -> 1st, 3rd, 5th...
Even Position -> 2nd, 4th, 6th...

Example:

Original:
1 -> 2 -> 3 -> 4 -> 5 -> 6

Odd Nodes:
1 -> 3 -> 5

Even Nodes:
2 -> 4 -> 6

Result:
1 -> 3 -> 5 -> 2 -> 4 -> 6

Idea:
1. Store odd, even and evenHead.
2. Connect all odd nodes.
3. Connect all even nodes.
4. Attach even list after odd list.

Why Save evenHead?
Because even pointer keeps moving.
Without saving it, the starting node
of the even list will be lost.

Edge Cases:
✔ Empty list
✔ One node
✔ Two nodes
✔ Odd length
✔ Even length
✔ Duplicate values

Time  : O(n)
Space : O(1)

Interview Tip:
Only links are changed.
Node values remain unchanged.

Remember:

odd = head
even = head.next

Connect Odd
↓
Connect Even
↓
odd.next = evenHead

 */