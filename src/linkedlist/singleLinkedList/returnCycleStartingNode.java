package linkedlist.singleLinkedList;

public class returnCycleStartingNode {

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    static class Solution {

        public ListNode detectCycle(ListNode head) {

            if (head == null || head.next == null) return null;

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;      // Move 1 step
                fast = fast.next.next; // Move 2 steps

                if (slow == fast) {

                    ListNode temp = head;

                    while (temp != slow) {
                        temp = temp.next; // Move from head
                        slow = slow.next; // Move from meeting point
                    }

                    return temp; // Cycle starts here
                }
            }

            return null; // No cycle
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Cycle Present
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        fifth.next = second;

        ListNode ans = obj.detectCycle(first);

        if (ans != null)
            System.out.println("Cycle Starts At : " + ans.value);
        else
            System.out.println("Cycle Not Present");

        System.out.println();

        // No Cycle
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;

        ans = obj.detectCycle(a);

        if (ans != null)
            System.out.println("Cycle Starts At : " + ans.value);
        else
            System.out.println("Cycle Not Present");
    }
}

/*
Return Starting Node of Cycle
(LeetCode 142)

Goal:
- Return the node where the cycle starts.
- If no cycle exists, return null.

Example:

10 -> 20 -> 30 -> 40 -> 50
      ^                 |
      |_________________|

Cycle Start = 20

Idea:
1. Detect cycle using Slow & Fast pointers.
2. If they meet, create temp = head.
3. Move temp and slow one step at a time.
4. Their meeting point is the cycle start.

Why Does It Work?

Suppose:
x = Head → Cycle Start
y = Cycle Start → Meeting Point
z = Meeting Point → Cycle Start

From Floyd's proof:

x = z

So moving one pointer from head and
another from the meeting point makes
them meet at the cycle start.

Important:
- Compare node references, not values.

Correct:
temp == slow

Wrong:
temp.value == slow.value

Edge Cases:
✔ Empty list
✔ Single node
✔ Self cycle
✔ Two nodes
✔ Cycle at head
✔ Cycle in middle
✔ No cycle

Time  : O(n)
Space : O(1)

Interview Tip:
LeetCode 141 → Detect Cycle (true/false)

LeetCode 142 → Detect Cycle + Return Starting Node

Remember:

Slow + Fast
      ↓
    Meet
      ↓
temp = head
      ↓
Move Both
      ↓
Meet Again
      ↓
Cycle Start

 */