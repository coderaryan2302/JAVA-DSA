package linkedlist.singleLinkedList;

public class maxTwinSumOfLL {

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    public static void display(ListNode head) {

        ListNode temp = head;

        while (temp != null) {

            System.out.print(temp.value);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next; // Move to next node
        }

        System.out.println();
    }

    static class Solution {

        public int pairSum(ListNode head) {

            if (head == null) return 0;
            if (head.next == null) return head.value;

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;      // Move 1 step
                fast = fast.next.next; // Move 2 steps
            }

            ListNode prev = null;
            ListNode curr = slow;

            while (curr != null) {

                ListNode next = curr.next;

                curr.next = prev; // Reverse link
                prev = curr;      // Move prev
                curr = next;      // Move curr
            }

            int maxSum = 0;

            ListNode first = head;
            ListNode second = prev;

            while (second != null) {

                maxSum = Math.max(maxSum, first.value + second.value);

                first = first.next;
                second = second.next;
            }

            return maxSum;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Original Linked List");
        display(head);

        System.out.println("\nMaximum Twin Sum : " + obj.pairSum(head));
    }
}

/*
Maximum Twin Sum (LeetCode 2130)

Twin Nodes:
- First ↔ Last
- Second ↔ Second Last
- Third ↔ Third Last

Twin Sum = Twin Node Values

Example:

5 -> 4 -> 2 -> 1

Pairs:
5 + 1 = 6
4 + 2 = 6

Maximum Twin Sum = 6

Idea:
1. Find middle.
2. Reverse second half.
3. Compare both halves.
4. Return maximum sum.

Why Reverse?
After reversing, last node becomes first,
so twin nodes can be compared easily.

Note:
LeetCode 2130 always has an EVEN length list.

Edge Cases:
✔ Empty list
✔ Two nodes
✔ Duplicate values
✔ Large values
✔ Even length list

Time  : O(n)
Space : O(1)

Interview Tip:
Array Solution  → O(n) Space
Reverse Method  → O(1) Space (Preferred)

Remember:

Find Middle
      ↓
Reverse Half
      ↓
Compare Pairs
      ↓
Return Maximum Sum
*/