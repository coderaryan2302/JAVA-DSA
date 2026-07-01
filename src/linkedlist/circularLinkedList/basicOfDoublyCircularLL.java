package linkedlist.circularLinkedList;

public class basicOfDoublyCircularLL {

    /* Doubly Circular Linked List Node */

    static class Node {

        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    /* Display forward */

    public static void displayForward(Node head) {

        if (head == null)
            return;

        Node temp = head;

        do {
            System.out.print(temp.value);

            if (temp.next != head)
                System.out.print(" <-> ");

            temp = temp.next;          // Move ahead

        } while (temp != head);

        System.out.println();
    }

    /* Display reverse */

    public static void displayReverse(Node head) {

        if (head == null)
            return;

        Node tail = head.prev;
        Node temp = tail;

        do {
            System.out.print(temp.value);

            if (temp.prev != tail)
                System.out.print(" <-> ");

            temp = temp.prev;          // Move backward

        } while (temp != tail);

        System.out.println();
    }

    /* Insert at head */

    public static Node insertAtHead(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null) {

            newNode.next = newNode;
            newNode.prev = newNode;

            return newNode;
        }

        Node tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;

        tail.next = newNode;
        head.prev = newNode;

        return newNode;
    }

    /* Insert at tail */

    public static Node insertAtTail(Node head, int value) {

        if (head == null)
            return insertAtHead(null, value);

        Node newNode = new Node(value);
        Node tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;

        tail.next = newNode;
        head.prev = newNode;

        return head;
    }

    /* Delete head */

    public static Node deleteHead(Node head) {

        if (head == null || head.next == head)
            return null;

        Node tail = head.prev;

        head = head.next;

        tail.next = head;
        head.prev = tail;

        return head;
    }

    /* Delete tail */

    public static Node deleteTail(Node head) {

        if (head == null || head.next == head)
            return null;

        Node tail = head.prev;
        Node newTail = tail.prev;

        newTail.next = head;
        head.prev = newTail;

        return head;
    }

    public static void main(String[] args) {

        Node head = null;

        head = insertAtHead(head, 20);
        head = insertAtHead(head, 10);

        head = insertAtTail(head, 30);
        head = insertAtTail(head, 40);

        System.out.println("Forward");
        displayForward(head);

        System.out.println("\nReverse");
        displayReverse(head);

        head = deleteHead(head);

        System.out.println("\nAfter Delete Head");
        displayForward(head);

        head = deleteTail(head);

        System.out.println("\nAfter Delete Tail");
        displayForward(head);
    }
}

/*

Doubly Circular Linked List

• Last.next points to Head.
• Head.prev points to Tail.
• No pointer is null.

Structure

Prev <-> Data <-> Next

Traversal

✔ Forward  → next
✔ Backward → prev

Operations

Insert Head
1. Create node
2. Connect with Head & Tail
3. Update Head

Insert Tail
1. Connect after Tail
2. Update Tail links

Delete Head
1. Head = Head.next
2. Connect Head & Tail

Delete Tail
1. Tail = Tail.prev
2. Connect Tail & Head

Edge Cases

✔ Empty List
✔ Single Node
✔ Multiple Nodes

Time Complexity

Display        O(n)
Insert Head    O(1)
Insert Tail    O(1)
Delete Head    O(1)
Delete Tail    O(1)

Interview Point

✔ Head.prev always points to Tail.
✔ Tail.next always points to Head.
✔ Never break the circular links.

*/