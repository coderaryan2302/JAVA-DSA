package linkedlist.singleLinkedList;

public class deleteANodeGivenTheNodeItselfAsParameter {

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    static class Solution {

        public void deleteNode(ListNode node) {

            if (node == null) {
                System.out.println("Node does not exist.");
                return;
            }

            if (node.next == null) {
                System.out.println("Last node cannot be deleted.");
                return;
            }

            node.value = node.next.value; // Copy next node value
            node.next = node.next.next;   // Remove next node
        }
    }
}

/*
Delete Node (Only Node is Given)

Concept:
- Head is not given.
- Only the node to delete is provided.

Idea:
- Copy next node's value.
- Skip the next node.

Example:

10 -> 20 -> 30 -> 40

Delete 20

Step 1:
10 -> 30 -> 30 -> 40

Step 2:
10 -> 30 -> 40

Limitation:
- Last node cannot be deleted because there is no next node.

Edge Cases:
✔ Node = null
✔ Last node
✔ Middle node
✔ First node (if head isn't needed)

Time  : O(1)
Space : O(1)

Formula:
node.value = node.next.value;
node.next = node.next.next;

Shortcut:
Copy Next → Skip Next
*/