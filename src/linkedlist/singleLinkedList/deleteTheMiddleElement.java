package linkedlist.singleLinkedList;

public class deleteTheMiddleElement {

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

        public ListNode deleteRightMiddle(ListNode head) {

            if (head == null || head.next == null) return null;

            ListNode prev = null;
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {

                prev = slow;          // Previous node
                slow = slow.next;     // Move 1 step
                fast = fast.next.next;// Move 2 steps
            }

            prev.next = slow.next;    // Delete right middle

            return head;
        }

        public ListNode deleteLeftMiddle(ListNode head) {

            if (head == null || head.next == null) return null;

            ListNode prev = null;
            ListNode slow = head;
            ListNode fast = head.next;

            while (fast != null && fast.next != null) {

                prev = slow;          // Previous node
                slow = slow.next;     // Move 1 step
                fast = fast.next.next;// Move 2 steps
            }

            if (prev == null) return head.next; // Two-node case

            prev.next = slow.next; // Delete left middle

            return head;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Right Middle
        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(3);
        first.next.next.next = new ListNode(4);

        System.out.println("Original List (Right Middle)");
        display(first);

        first = obj.deleteRightMiddle(first);

        System.out.println("After Deleting Right Middle");
        display(first);

        System.out.println();

        // Left Middle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original List (Left Middle)");
        display(head);

        head = obj.deleteLeftMiddle(head);

        System.out.println("After Deleting Left Middle");
        display(head);

        System.out.println();

        // Odd Length
        ListNode odd = new ListNode(10);
        odd.next = new ListNode(20);
        odd.next.next = new ListNode(30);
        odd.next.next.next = new ListNode(40);
        odd.next.next.next.next = new ListNode(50);

        System.out.println("Original Odd Length List");
        display(odd);

        odd = obj.deleteRightMiddle(odd);

        System.out.println("After Deleting Middle");
        display(odd);
    }
}

/*
Delete Middle Node

Two Approaches:
1. Delete Right Middle
2. Delete Left Middle

Odd Length:
- Both delete the same middle node.

Even Length:
- Right Middle → fast = head
- Left Middle  → fast = head.next

Examples:

Odd:
10 -> 20 -> 30 -> 40 -> 50
Delete → 30
Result : 10 -> 20 -> 40 -> 50

Even:
1 -> 2 -> 3 -> 4

Left Middle  = 2
Right Middle = 3

Delete Left  : 1 -> 3 -> 4
Delete Right : 1 -> 2 -> 4

Logic:

Right Middle:
slow = head
fast = head

Left Middle:
slow = head
fast = head.next

Move:
slow = slow.next
fast = fast.next.next

When loop ends:
slow = Middle Node
prev = Node before Middle

Delete:
prev.next = slow.next

Special Case:
Two nodes + Left Middle
return head.next;

Edge Cases:
✔ Empty list
✔ Single node
✔ Two nodes
✔ Odd length
✔ Even length

Time  : O(n)
Space : O(1)

Remember:

fast = head
→ Delete Right Middle

fast = head.next
→ Delete Left Middle

 */