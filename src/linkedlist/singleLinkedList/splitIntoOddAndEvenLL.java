package linkedlist.singleLinkedList;
public class splitIntoOddAndEvenLL {

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

    static class Result {
        ListNode oddHead;
        ListNode evenHead;

        Result(ListNode oddHead, ListNode evenHead) {
            this.oddHead = oddHead;
            this.evenHead = evenHead;
        }
    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.value);

            if (head.next != null) {
                System.out.print(" -> ");
                head = head.next; // Move to next node
            }
            System.out.println();
        }
    }

    static class Solution {

        // Approach 1 : Extra Space
        public Result splitUsingExtraSpace(ListNode head) {

            ListNode oddDummy = new ListNode(-1);
            ListNode evenDummy = new ListNode(-1);

            ListNode oddTail = oddDummy;
            ListNode evenTail = evenDummy;

            int pos = 1;

            while (head != null) {
                if (pos % 2 == 1) {
                    oddTail.next = new ListNode(head.value); // Copy odd node
                    oddTail = oddTail.next;
                }
                else {
                    evenTail.next = new ListNode(head.value); // Copy even node
                    evenTail = evenTail.next;
                }
                head = head.next;
                pos++;
            }
            return new Result(oddDummy.next, evenDummy.next);
        }

        // Approach 2 : Without Extra Space
        public Result splitWithoutExtraSpace(ListNode head) {

            if (head == null) {
                return new Result(null, null);
            }

            ListNode oddHead = head;
            ListNode evenHead = head.next;

            ListNode odd = oddHead;
            ListNode even = evenHead;

            while (even != null && even.next != null) {

                odd.next = even.next; // Connect odd nodes
                odd = odd.next;

                even.next = odd.next; // Connect even nodes
                even = even.next;
            }

            odd.next = null; // End odd list

            return new Result(oddHead, evenHead);
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Original List
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println("Original Linked List");
        display(head);

        Result ans1 = obj.splitUsingExtraSpace(head);

        System.out.println("\nOdd List (Extra Space)");
        display(ans1.oddHead);

        System.out.println("Even List (Extra Space)");
        display(ans1.evenHead);

        // Recreate List
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        Result ans2 = obj.splitWithoutExtraSpace(head);

        System.out.println("\nOdd List (Without Extra Space)");
        display(ans2.oddHead);

        System.out.println("Even List (Without Extra Space)");
        display(ans2.evenHead);
    }
}

/*
Split Linked List into Odd & Even Lists

Important:
Split is based on node position,
not node value.

Example:

Original:
1 -> 2 -> 3 -> 4 -> 5 -> 6

Odd List:
1 -> 3 -> 5

Even List:
2 -> 4 -> 6

Approach 1 : Extra Space
1. Create two new lists.
2. Copy odd position nodes.
3. Copy even position nodes.

Approach 2 : Without Extra Space
1. Reuse existing nodes.
2. Connect odd nodes together.
3. Connect even nodes together.
4. Return both lists.

Edge Cases:
✔ Empty list
✔ Single node
✔ Two nodes
✔ Odd length
✔ Even length
✔ Duplicate values

Time:
Both Approaches : O(n)

Space:
Extra Space : O(n)
Optimized   : O(1)

Interview Tip:
Extra Space → Original list remains unchanged.
Optimized   → Reuses existing nodes (Preferred).

Remember:

Extra Space
Copy Nodes
      ↓
Odd & Even Lists

Without Extra Space
Reuse Nodes
      ↓
Odd List + Even List

 */