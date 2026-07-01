package linkedlist.singleLinkedList;

public class copyListWithRandomPointer {

    static class Node {
        int data;
        Node next, random;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node copyRandomList(Node head) {

        if (head == null) return null;

        Node curr = head;

        while (curr != null) {
            Node copy = new Node(curr.data);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next; // Move to next original node
        }

        curr = head;

        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next; // Copy random pointer

            curr = curr.next.next; // Skip copied node
        }

        Node dummy = new Node(-1);
        Node tail = dummy;
        curr = head;

        while (curr != null) {

            Node copy = curr.next;

            curr.next = copy.next; // Restore original list
            tail.next = copy;       // Attach copied node
            tail = copy;            // Move copied tail

            curr = curr.next;       // Move to next original node
        }

        return dummy.next;
    }

    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            int random = (temp.random == null) ? -1 : temp.random.data;
            System.out.println("Node : " + temp.data + " | Random : " + random);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.next = third;
        third.next = fourth;

        first.random = third;
        second.random = first;
        third.random = fourth;
        fourth.random = second;

        System.out.println("Original Linked List");
        display(first);

        Node copyHead = copyRandomList(first);

        System.out.println("\nCopied Linked List");
        display(copyHead);
    }
}

/*
Deep Copy with Random Pointer

Deep Copy:
- New nodes are created.
- Original & copied lists are independent.

Idea:
1. Insert copied node after every original node.
2. Copy random pointers.
3. Separate copied list & restore original list.

Formula:
copy.random = original.random.next

Edge Cases:
✔ Empty list
✔ Single node
✔ Random = null
✔ Random points to itself
✔ Random points to any node

Time  : O(n)
Space : O(1)

Shortcut:
Insert → Random → Separate
*/