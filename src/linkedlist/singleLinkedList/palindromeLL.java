package linkedlist.singleLinkedList;

public class palindromeLL {

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

        public ListNode reverse(ListNode head) {

            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {

                ListNode next = curr.next;

                curr.next = prev; // Reverse link
                prev = curr;      // Move prev
                curr = next;      // Move curr
            }

            return prev;
        }

        public ListNode copyList(ListNode head) {

            if (head == null) return null;

            ListNode dummy = new ListNode(-1);
            ListNode tail = dummy;

            while (head != null) {

                tail.next = new ListNode(head.value); // Copy node
                tail = tail.next;
                head = head.next;
            }

            return dummy.next;
        }

        // Approach 1 : Copy + Reverse + Compare
        public boolean isPalindromeUsingCopy(ListNode head) {

            if (head == null || head.next == null) return true;

            ListNode copy = copyList(head);
            copy = reverse(copy);

            ListNode first = head;
            ListNode second = copy;

            while (first != null && second != null) {

                if (first.value != second.value)
                    return false;

                first = first.next;
                second = second.next;
            }

            return true;
        }

        // Approach 2 : Reverse Second Half (Optimized)
        public boolean isPalindromeOptimized(ListNode head) {

            if (head == null || head.next == null) return true;

            ListNode slow = head;
            ListNode fast = head;

            while (fast.next != null && fast.next.next != null) {

                slow = slow.next;      // Move 1 step
                fast = fast.next.next; // Move 2 steps
            }

            ListNode secondHalf = reverse(slow.next);
            slow.next = secondHalf;

            ListNode first = head;
            ListNode second = secondHalf;

            while (second != null) {

                if (first.value != second.value) {
                    slow.next = reverse(secondHalf); // Restore list
                    return false;
                }

                first = first.next;
                second = second.next;
            }

            slow.next = reverse(secondHalf); // Restore list

            return true;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Palindrome
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(1);

        System.out.println("Palindrome Linked List");
        display(head1);

        System.out.println("\nApproach 1 : " + obj.isPalindromeUsingCopy(head1));
        System.out.println("Approach 2 : " + obj.isPalindromeOptimized(head1));

        System.out.println();

        // Not Palindrome
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        System.out.println("Non Palindrome Linked List");
        display(head2);

        System.out.println("\nApproach 1 : " + obj.isPalindromeUsingCopy(head2));
        System.out.println("Approach 2 : " + obj.isPalindromeOptimized(head2));
    }
}

/*
Palindrome Linked List

Palindrome:
Forward and Backward traversal
gives the same sequence.

Example:

1 -> 2 -> 3 -> 2 -> 1
Palindrome ✔

1 -> 2 -> 3 -> 4
Not Palindrome ✘

Approach 1 : Copy + Reverse + Compare
1. Create deep copy.
2. Reverse copied list.
3. Compare both lists.

Approach 2 : Reverse Second Half
1. Find middle.
2. Reverse second half.
3. Compare both halves.
4. Restore original list.

Why Restore?
Second half is temporarily reversed.
Restoring keeps the original list unchanged.

Edge Cases:
✔ Empty list
✔ Single node
✔ Two nodes
✔ Odd length
✔ Even length
✔ Duplicate values
✔ All same values

Time  : O(n)

Space:
Copy Method      : O(n)
Optimized Method : O(1)

Interview Tip:
Copy Method      → Easy
Reverse Half     → Most Optimized & Preferred

Remember:

Approach 1
Copy → Reverse → Compare

Approach 2
Middle → Reverse Half
        ↓
     Compare
        ↓
      Restore

 */