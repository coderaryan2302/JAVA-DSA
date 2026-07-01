package linkedlist.singleLinkedList;

public class findIntersectionOfTwoLL {

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
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

        public ListNode getIntersectionByLength(ListNode headA, ListNode headB) {

            if (headA == null || headB == null) return null;

            int lenA = 0, lenB = 0;

            ListNode tempA = headA;
            ListNode tempB = headB;

            while (tempA != null) {
                lenA++;
                tempA = tempA.next; // Count length of A
            }

            while (tempB != null) {
                lenB++;
                tempB = tempB.next; // Count length of B
            }

            tempA = headA;
            tempB = headB;

            while (lenA > lenB) {
                tempA = tempA.next; // Move longer list
                lenA--;
            }

            while (lenB > lenA) {
                tempB = tempB.next; // Move longer list
                lenB--;
            }

            while (tempA != null && tempB != null) {

                if (tempA == tempB) return tempA; // Intersection found

                tempA = tempA.next;
                tempB = tempB.next;
            }

            return null; // No intersection
        }

        public ListNode getIntersectionBySwitching(ListNode headA, ListNode headB) {

            if (headA == null || headB == null) return null;

            ListNode ptrA = headA;
            ListNode ptrB = headB;

            while (ptrA != ptrB) {

                ptrA = (ptrA == null) ? headB : ptrA.next; // Switch list
                ptrB = (ptrB == null) ? headA : ptrB.next; // Switch list
            }

            return ptrA; // Intersection or null
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Common Part
        ListNode common1 = new ListNode(30);
        ListNode common2 = new ListNode(40);
        ListNode common3 = new ListNode(50);

        common1.next = common2;
        common2.next = common3;

        // List A
        ListNode headA = new ListNode(10);
        headA.next = new ListNode(20);
        headA.next.next = common1;

        // List B
        ListNode headB = new ListNode(15);
        headB.next = common1;

        System.out.println("Linked List A");
        display(headA);

        System.out.println("\nLinked List B");
        display(headB);

        ListNode ans1 = obj.getIntersectionByLength(headA, headB);

        if (ans1 != null)
            System.out.println("\nIntersection (Length Method) : " + ans1.value);
        else
            System.out.println("\nNo Intersection");

        ListNode ans2 = obj.getIntersectionBySwitching(headA, headB);

        if (ans2 != null)
            System.out.println("Intersection (Switching Method) : " + ans2.value);
        else
            System.out.println("No Intersection");
    }
}

/*
Find Intersection of Two Linked Lists

Intersection:
- Both lists share the same node.
- Compare node reference, not value.

Correct:
tempA == tempB

Wrong:
tempA.value == tempB.value

Example:

List A:
10 -> 20 -> 30 -> 40 -> 50

List B:
15 ------> 30 -> 40 -> 50

Intersection = 30

Approach 1: Length Difference
1. Find length of both lists.
2. Move longer list ahead.
3. Compare both nodes together.

Formula:
Difference = |lenA - lenB|

Approach 2: Pointer Switching
1. Start one pointer from each list.
2. When pointer reaches null, switch to other list.
3. They will meet at intersection or null.

Why Switching Works?
Both pointers travel the same total distance
(lenA + lenB).

Edge Cases:
✔ Empty list
✔ One list empty
✔ No intersection
✔ Same head
✔ Different lengths
✔ Single node list

Time:
Length Method     : O(n + m)
Switching Method  : O(n + m)

Space:
O(1)

Interview Tip:
Length Method    → Easy for beginners.
Switching Method → Shortest & most asked.

Remember:

Length Method
Find Length → Move Longer → Compare

Switching Method
Switch Head → Meet Automatically

 */