package linkedlist.singleLinkedList;

public class removeDuplicates {

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

        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) return head;

            ListNode curr = head;

            while (curr != null && curr.next != null) {

                if (curr.value == curr.next.value) {
                    curr.next = curr.next.next; // Remove duplicate
                } else {
                    curr = curr.next; // Move to next node
                }
            }

            return head;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List");
        display(head);

        head = obj.deleteDuplicates(head);

        System.out.println("\nAfter Removing Duplicates");
        display(head);
    }
}

/*
Remove Duplicates from Sorted Linked List
(LeetCode 83)

Important:
- Works only for a SORTED linked list.
- Duplicate values are consecutive.

Example:

Original:
1 -> 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5

Result:
1 -> 2 -> 3 -> 4 -> 5

Idea:
1. Compare current node with next node.
2. If values are same, remove next node.
3. Otherwise, move current forward.

Why Current Doesn't Move After Deletion?
There may be more duplicates.

Example:
1 -> 1 -> 1 -> 2

Delete second 1:
1 -> 1 -> 2

Current stays at first 1 and removes
the remaining duplicate.

Edge Cases:
✔ Empty list
✔ Single node
✔ All nodes same
✔ No duplicates
✔ Duplicate at start
✔ Duplicate at end
✔ Multiple consecutive duplicates

Time  : O(n)
Space : O(1)

Interview Tip:
LeetCode 83 keeps one copy of each value.

LeetCode 82 removes all duplicate values completely.

Remember:

Same Value
→ Delete Next Node

Different Value
→ Move Current

 */