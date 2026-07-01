package linkedlist.doublyLinkedList;

public class basic {

    /* Doubly Linked List Node */

    static class Node {

        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    /* Display from head to tail */

    public static void displayForward(Node head) {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.value);

            if (temp.next != null)
                System.out.print(" <-> ");

            temp = temp.next;          // Move forward
        }

        System.out.println();
    }

    /* Display from tail to head */

    public static void displayReverse(Node tail) {

        if (tail == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = tail;

        while (temp != null) {

            System.out.print(temp.value);

            if (temp.prev != null)
                System.out.print(" <-> ");

            temp = temp.prev;          // Move backward
        }

        System.out.println();
    }

    /* Display complete list using any node */

    public static void displayFromAnyNode(Node node) {

        if (node == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        while (node.prev != null)
            node = node.prev;          // Reach head

        while (node != null) {

            System.out.print(node.value);

            if (node.next != null)
                System.out.print(" <-> ");

            node = node.next;          // Traverse forward
        }

        System.out.println();
    }

    /* Return tail node */

    public static Node getTail(Node head) {

        if (head == null)
            return null;

        while (head.next != null)
            head = head.next;          // Reach last node

        return head;
    }

    /* Insert at beginning */

    public static Node insertAtHead(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null)
            return newNode;

        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }

    /* Insert at end */

    public static Node insertAtTail(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null)
            return newNode;

        Node tail = getTail(head);

        tail.next = newNode;
        newNode.prev = tail;

        return head;
    }

    /* Insert at given position */

    public static Node insertAtIndex(Node head, int index, int value) {

        if (index <= 1 || head == null)
            return insertAtHead(head, value);

        Node temp = head;
        int pos = 1;

        while (temp.next != null && pos < index - 1) {
            temp = temp.next;
            pos++;
        }

        Node newNode = new Node(value);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;

        return head;
    }

/* Delete first node */

public static Node deleteHead(Node head) {

    if (head == null || head.next == null)
        return null;

    head = head.next;
    head.prev = null;

    return head;
}

/* Delete last node */

public static Node deleteTail(Node head) {

    if (head == null || head.next == null)
        return null;

    Node tail = getTail(head);

    tail.prev.next = null;

    return head;
}

/* Delete node at given position */

public static Node deleteAtIndex(Node head, int index) {

    if (head == null)
        return null;

    if (index <= 1)
        return deleteHead(head);

    Node temp = head;
    int pos = 1;

    while (temp != null && pos < index) {
        temp = temp.next;
        pos++;
    }

    if (temp == null)
        return head;                 // Invalid index

    if (temp.next == null)
        return deleteTail(head);     // Delete last node

    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;

    return head;
}

public static void main(String[] args) {

    Node first = new Node(4);
    Node second = new Node(10);
    Node third = new Node(2);
    Node fourth = new Node(99);
    Node fifth = new Node(13);

    first.next = second;

    second.prev = first;
    second.next = third;

    third.prev = second;
    third.next = fourth;

    fourth.prev = third;
    fourth.next = fifth;

    fifth.prev = fourth;

    System.out.println("Forward Traversal");
    displayForward(first);

    System.out.println("\nReverse Traversal");
    displayReverse(getTail(first));

    System.out.println("\nTraversal From Random Node");
    displayFromAnyNode(third);

        /*
        // Uncomment for testing

        System.out.println("\nInsert At Head");
        first = insertAtHead(first, 100);
        displayForward(first);

        System.out.println("\nInsert At Tail");
        first = insertAtTail(first, 500);
        displayForward(first);

        System.out.println("\nInsert At Index");
        first = insertAtIndex(first, 4, 999);
        displayForward(first);

        System.out.println("\nDelete Head");
        first = deleteHead(first);
        displayForward(first);

        System.out.println("\nDelete Tail");
        first = deleteTail(first);
        displayForward(first);

        System.out.println("\nDelete At Index");
        first = deleteAtIndex(first, 3);
        displayForward(first);
        */
}
}


/*

Doubly Linked List (DLL)

• Each node stores:
  - Data
  - Previous Pointer
  - Next Pointer

Traversal
✔ Forward
✔ Backward

Display
• Forward
• Reverse
• From Any Node

Insertion
• Head
• Tail
• Any Index

Deletion
• Head
• Tail
• Any Index

Advantages
✔ Easy Forward & Backward Traversal
✔ Easy Insert/Delete

Disadvantages
✘ Extra Memory
✘ More Pointer Updates

Time Complexity

Display             O(n)
Insert Head         O(1)
Insert Tail         O(n)  // O(1) with tail
Insert Index        O(n)

Delete Head         O(1)
Delete Tail         O(n)  // O(1) with tail
Delete Index        O(n)

Space Complexity

All Operations      O(1)

Important Formulas

Insert Head
new.next = head;
head.prev = new;
head = new;

Insert Tail
tail.next = new;
new.prev = tail;

Delete Head
head = head.next;
head.prev = null;

Delete Tail
tail.prev.next = null;

Delete Middle
curr.prev.next = curr.next;
curr.next.prev = curr.prev;

Interview Points

✔ Always update both Next and Previous pointers.
✔ Handle Empty List and Single Node separately.
✔ Tail pointer makes tail operations O(1).

*/

/*

============ EXTRA INTERVIEW / MCQ POINTS ============

✔ Array → Contiguous Memory
✔ Linked List → Non-Contiguous Memory

Reason:
Array elements are stored together.
Linked List nodes can be anywhere in memory.

------------------------------------------------

✔ Cache Locality

Array → Better

Reason:
Nearby elements are loaded together into CPU Cache,
so traversal is faster.

Linked List → Poor

Reason:
Nodes are scattered in memory.

------------------------------------------------

✔ Size

Array → Fixed

Reason:
Size is decided during creation.

Linked List → Dynamic

Reason:
Nodes can be added or removed anytime.

------------------------------------------------

✔ Random Access

Array → O(1)

Reason:
Index can be accessed directly.

Linked List → O(n)

Reason:
Traversal from head is required.

------------------------------------------------

✔ Binary Search

✔ Array → Efficient

✘ Linked List → Not Efficient

Reason:
Middle node cannot be accessed directly.

------------------------------------------------

✔ Insertion & Deletion

Array → O(n)

Reason:
Elements need shifting.

Linked List → O(1)
(If node is already known)

Reason:
Only pointer updates are required.

------------------------------------------------

✔ DLL uses Extra Memory

Reason:
Every node stores an extra Previous Pointer.

------------------------------------------------

✔ Tail Pointer

Reason:
Tail Insert and Tail Delete become O(1).

------------------------------------------------

✔ Circular Linked List

Tail.next = Head

Reason:
Maintains the circular structure.

------------------------------------------------

✔ Circular Doubly Linked List

Head.prev = Tail

Reason:
Allows backward traversal from Head.

------------------------------------------------

✔ XOR Linked List

Reason:
Stores Previous XOR Next in one pointer,
saving memory.

Note:
Mostly used in C/C++.
Not practical in Java.

------------------------------------------------

✔ Interview One-Liners

• Arrays are faster for traversal due to better Cache Locality.

• Linked List is better for frequent Insert/Delete.

• DLL supports Forward and Backward Traversal.

• Random Access is not possible in Linked List.

• Binary Search is not suitable for Linked List.

• Circular Linked List has no NULL pointer.

======================================================

*/