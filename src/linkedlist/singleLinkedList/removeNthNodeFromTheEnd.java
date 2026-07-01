package linkedlist.singleLinkedList;

public class removeNthNodeFromTheEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next; // Move to next node
        }
        System.out.println();
    }

    public static Node delete(Node head, int n) {
        if (head == null || n <= 0) return head;

        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {

            if (fast == null) return head;

            fast = fast.next; // Create gap of n nodes
        }

        if (fast == null) return head.next; // Delete first node

        while (fast.next != null) {

            slow = slow.next; // Move slow
            fast = fast.next; // Move fast
        }

        slow.next = slow.next.next; // Delete target node

        return head;
    }

    public static void main(String[] args) {

        Node first = new Node(100);
        Node second = new Node(13);
        Node third = new Node(4);
        Node fourth = new Node(5);
        Node fifth = new Node(12);
        Node sixth = new Node(10);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        System.out.println("Original Linked List");
        display(first);

        int n = 6;

        first = delete(first, n);

        System.out.println("\nAfter Deleting " + n + "th Node From End");
        display(first);
    }
}

/*
Remove Nth Node From End (LeetCode 19)

Goal:
Delete the nth node from the end
and return the updated head.

Example:
100 -> 13 -> 4 -> 5 -> 12 -> 10

n = 3

Result:
100 -> 13 -> 4 -> 12 -> 10

Idea:
1. Move fast pointer n steps.
2. Move slow & fast together.
3. When fast reaches last node,
   slow reaches previous of target.
4. Delete slow.next.

Special Case:
If fast becomes null after moving n steps,
delete the first node.

Example:

10 -> 20 -> 30

n = 3

Result:
20 -> 30

Why Move Fast First?
It creates a gap of n nodes between
slow and fast.

Edge Cases:
✔ Empty list
✔ Single node
✔ Delete first node
✔ Delete last node
✔ Delete middle node
✔ n = Size
✔ n > Size
✔ Invalid n

Time  : O(n)
Space : O(1)

Interview Tip:
Size Method       → Two Traversals
Fast & Slow       → One Traversal (Preferred)

Remember:

Fast n Steps
      ↓
Move Both
      ↓
Fast at Last
      ↓
Delete slow.next

 */