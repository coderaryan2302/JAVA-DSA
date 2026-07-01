package linkedlist.singleLinkedList;

public class findNthNodeFromTheEnd {

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

    // Approach 1 : Two Traversal
    public static Node nthNode(Node head, int n) {

        if (head == null || n <= 0) return null;

        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next; // Count nodes
        }

        if (n > size) return null;

        int position = size - n + 1;

        temp = head;

        for (int i = 1; i < position; i++)
            temp = temp.next; // Reach required node

        return temp;
    }

    // Approach 2 : One Traversal (Optimized)
    public static Node nthNodeOptimized(Node head, int n) {

        if (head == null || n <= 0) return null;

        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {

            if (fast == null) return null;

            fast = fast.next; // Move fast n steps
        }

        while (fast != null) {

            slow = slow.next; // Move slow
            fast = fast.next; // Move fast
        }

        return slow;
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

        System.out.println("Linked List");
        display(first);

        int n = 3;

        Node ans1 = nthNode(first, n);

        if (ans1 != null)
            System.out.println("\nApproach 1 : " + ans1.data);
        else
            System.out.println("\nInvalid Value of n");

        Node ans2 = nthNodeOptimized(first, n);

        if (ans2 != null)
            System.out.println("Approach 2 : " + ans2.data);
        else
            System.out.println("Invalid Value of n");
    }
}

/*
Find Nth Node From End

Approach 1 : Two Traversal
1. Count total nodes.
2. Find position from start.
3. Traverse again.

Formula:
Position = Size - N + 1

Approach 2 : One Traversal
1. Move fast pointer n steps.
2. Move slow & fast together.
3. When fast becomes null, slow is the answer.

Example:

100 -> 13 -> 4 -> 5 -> 12 -> 10

n = 3

Answer = 5

Why Fast Moves First?
It creates a gap of n nodes between
slow and fast.

Edge Cases:
✔ Empty list
✔ Single node
✔ n = 1
✔ n = Size
✔ n > Size
✔ Invalid n

Time:
Two Traversal : O(n)
One Traversal : O(n)

Space:
O(1)

Interview Tip:
Two Traversal → Easy
One Traversal → Optimized & Preferred

Remember:

Two Traversal
Count → Position → Traverse

One Traversal
Fast n Steps → Move Both → Slow = Answer
*/