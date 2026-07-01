package linkedlist.singleLinkedList;

public class merge2SortedLL {

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

        // Approach 1 : Extra Space
        public ListNode mergeUsingExtraSpace(ListNode list1, ListNode list2) {

            ListNode dummy = new ListNode(-1);
            ListNode tail = dummy;

            while (list1 != null && list2 != null) {

                if (list1.value <= list2.value) {
                    tail.next = new ListNode(list1.value); // Copy node
                    list1 = list1.next;
                } else {
                    tail.next = new ListNode(list2.value); // Copy node
                    list2 = list2.next;
                }

                tail = tail.next;
            }

            while (list1 != null) {
                tail.next = new ListNode(list1.value); // Copy remaining nodes
                tail = tail.next;
                list1 = list1.next;
            }

            while (list2 != null) {
                tail.next = new ListNode(list2.value); // Copy remaining nodes
                tail = tail.next;
                list2 = list2.next;
            }

            return dummy.next;
        }

        // Approach 2 : In-Place (Optimized)
        public ListNode mergeInPlace(ListNode list1, ListNode list2) {

            if (list1 == null) return list2;
            if (list2 == null) return list1;

            ListNode dummy = new ListNode(-1);
            ListNode tail = dummy;

            while (list1 != null && list2 != null) {

                if (list1.value <= list2.value) {
                    tail.next = list1; // Attach node from list1
                    list1 = list1.next;
                } else {
                    tail.next = list2; // Attach node from list2
                    list2 = list2.next;
                }

                tail = tail.next;
            }

            tail.next = (list1 != null) ? list1 : list2; // Attach remaining list

            return dummy.next;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Linked List 1
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        list1.next.next.next = new ListNode(7);

        // Linked List 2
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        list2.next.next.next = new ListNode(8);

        System.out.println("Linked List 1");
        display(list1);

        System.out.println("\nLinked List 2");
        display(list2);

        ListNode merged1 = obj.mergeUsingExtraSpace(list1, list2);

        System.out.println("\nMerged List (Extra Space)");
        display(merged1);

        // Recreate lists (In-Place modifies original lists)
        list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        list1.next.next.next = new ListNode(7);

        list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        list2.next.next.next = new ListNode(8);

        ListNode merged2 = obj.mergeInPlace(list1, list2);

        System.out.println("\nMerged List (In-Place)");
        display(merged2);
    }
}

/*
Merge Two Sorted Linked Lists

Approach 1 : Extra Space
- Create a new merged list.
- Copy values into new nodes.

Approach 2 : In-Place (Optimized)
- Reuse existing nodes.
- No new nodes are created.

Example:

List 1:
1 -> 3 -> 5 -> 7

List 2:
2 -> 4 -> 6 -> 8

Merged:
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8

Idea:
1. Compare both nodes.
2. Attach the smaller node.
3. Move its pointer.
4. Repeat until one list ends.
5. Attach the remaining list.

Edge Cases:
✔ First list empty
✔ Second list empty
✔ Both lists empty
✔ Different sizes
✔ Duplicate values

Time  : O(n + m)

Space:
Extra Space : O(n + m)
In-Place    : O(1)

Interview Tip:
Extra Space → Easy to understand
In-Place    → Most optimized & Preferred

Remember:

Extra Space
Copy Nodes → Merge

In-Place
Reuse Nodes → Merge

 */