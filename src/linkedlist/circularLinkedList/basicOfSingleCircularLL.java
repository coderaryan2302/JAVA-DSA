package linkedlist.circularLinkedList;

public class basicOfSingleCircularLL {

    /* Singly Circular Linked List Node */

    static class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    /* Display list */

    public static void display(Node head) {

        if (head == null)
            return;

        Node temp = head;

        do {

            System.out.print(temp.value);

            if (temp.next != head)
                System.out.print(" -> ");

            temp = temp.next;          // Move ahead

        } while (temp != head);

        System.out.println();
    }

    /* Insert at head */

    public static Node insertAtHead(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node tail = head;

        while (tail.next != head)
            tail = tail.next;          // Reach tail

        newNode.next = head;
        tail.next = newNode;

        return newNode;
    }

    /* Insert at tail */

    public static Node insertAtTail(Node head, int value) {

        if (head == null)
            return insertAtHead(null, value);

        Node newNode = new Node(value);
        Node tail = head;

        while (tail.next != head)
            tail = tail.next;          // Reach tail

        tail.next = newNode;
        newNode.next = head;

        return head;
    }

    /* Delete head */

    public static Node deleteHead(Node head) {

        if (head == null || head.next == head)
            return null;

        Node tail = head;

        while (tail.next != head)
            tail = tail.next;          // Reach tail

        head = head.next;
        tail.next = head;              // Maintain circle

        return head;
    }

    public static void main(String[] args) {

        Node head = null;

        head = insertAtHead(head, 20);
        head = insertAtHead(head, 10);

        head = insertAtTail(head, 30);
        head = insertAtTail(head, 40);

        System.out.println("Circular Linked List");
        display(head);

        head = deleteHead(head);

        System.out.println("\nAfter Deleting Head");
        display(head);
    }
}

/*

Singly Circular Linked List

• Last node points back to Head.
• No node points to null.

Example

10 -> 20 -> 30 -> 40
^                 |
|_________________|

Operations

Insert Head
1. Reach tail
2. New.next = Head
3. Tail.next = New
4. Head = New

Insert Tail
1. Reach tail
2. Tail.next = New
3. New.next = Head

Delete Head
1. Reach tail
2. Head = Head.next
3. Tail.next = Head

Edge Cases

✔ Empty List
✔ Single Node
✔ Multiple Nodes

Time Complexity

Display      O(n)
Insert Head  O(n)
Insert Tail  O(n)
Delete Head  O(n)

Interview Point

✔ Tail.next must always point to Head.
✔ This is the most important property of a Circular Linked List.

*/