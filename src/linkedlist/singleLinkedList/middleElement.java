package linkedlist.singleLinkedList;

public class middleElement {

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

        // Right Middle (LeetCode 876)
        public ListNode rightMiddle(ListNode head) {

            if (head == null) return null;

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;      // Move 1 step
                fast = fast.next.next; // Move 2 steps
            }

            return slow;
        }

        // Left Middle
        public ListNode leftMiddle(ListNode head) {

            if (head == null) return null;

            ListNode slow = head;
            ListNode fast = head.next;

            while (fast != null && fast.next != null) {

                slow = slow.next;      // Move 1 step
                fast = fast.next.next; // Move 2 steps
            }

            return slow;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Odd Length
        ListNode odd = new ListNode(10);
        odd.next = new ListNode(20);
        odd.next.next = new ListNode(30);
        odd.next.next.next = new ListNode(40);
        odd.next.next.next.next = new ListNode(50);

        System.out.println("Odd Length");
        display(odd);

        System.out.println("\nRight Middle : " + obj.rightMiddle(odd).value);
        System.out.println("Left Middle  : " + obj.leftMiddle(odd).value);

        System.out.println();

        // Even Length
        ListNode even = new ListNode(1);
        even.next = new ListNode(2);
        even.next.next = new ListNode(3);
        even.next.next.next = new ListNode(4);

        System.out.println("Even Length");
        display(even);

        System.out.println("\nRight Middle : " + obj.rightMiddle(even).value);
        System.out.println("Left Middle  : " + obj.leftMiddle(even).value);
    }
}

/*
Find Middle Node

Uses:
- Slow & Fast Pointer
- Also called Two Pointer Technique.

Middle:
- Odd Length  -> One middle node.
- Even Length -> Left & Right middle.

Example:

Odd:
10 -> 20 -> 30 -> 40 -> 50

Left Middle  = 30
Right Middle = 30

Even:
1 -> 2 -> 3 -> 4

Left Middle  = 2
Right Middle = 3

Right Middle:
slow = head
fast = head

Left Middle:
slow = head
fast = head.next

Logic:
- Slow moves 1 step.
- Fast moves 2 steps.
- When fast reaches end, slow is at the middle.

Edge Cases:
✔ Empty list
✔ Single node
✔ Two nodes
✔ Odd length
✔ Even length

Time  : O(n)
Space : O(1)

Interview Tip:
LeetCode 876 returns the Right Middle.

Remember:

fast = head
→ Right Middle

fast = head.next
→ Left Middle

Note:
Odd Length  -> Left = Right
Even Length -> Left ≠ Right

 */