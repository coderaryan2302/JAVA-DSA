package linkedlist.singleLinkedList;

public class cycleInLL {

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    static class Solution {

        public boolean hasCycle(ListNode head) {

            if (head == null || head.next == null) return false;

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;          // Move 1 step
                fast = fast.next.next;     // Move 2 steps

                if (slow == fast) return true; // Cycle found
            }

            return false; // No cycle
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Without Cycle
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        first.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Without Cycle : " + obj.hasCycle(first));

        // With Cycle
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        five.next = two; // Create cycle

        System.out.println("With Cycle : " + obj.hasCycle(one));
    }
}

/*
Detect Cycle (Floyd's Algorithm)

Cycle:
Last node points to any previous node instead of null.

Example:

Without Cycle
10 -> 20 -> 30 -> 40 -> null

With Cycle
1 -> 2 -> 3 -> 4 -> 5
     ^              |
     |______________|

Idea:
1. Slow moves 1 step.
2. Fast moves 2 steps.
3. If slow == fast → Cycle Present.
4. If fast reaches null → No Cycle.

Why?
Fast pointer eventually catches slow inside the cycle.

Edge Cases:
✔ Empty list
✔ Single node
✔ Two nodes
✔ Self loop
✔ Cycle at head
✔ Cycle in middle
✔ No cycle

Time  : O(n)
Space : O(1)

Shortcut:
Slow + Fast → Meet = Cycle
Fast reaches null → No Cycle
*/