package linkedlist;
public class implementation {

    static class Node {
        int data;      // Store value
        Node next;     // Address of next node
        Node(int data) {
            this.data = data;
        }
    }


    static class LinkedList {
        Node head;     // First node
        Node tail;     // Last node
        int size;      // Total nodes

        void insertAtEnd(int data) {
            Node newNode = new Node(data);   // Create new node
            if (head == null) {              // Empty list
                head = tail = newNode;
            } else {
                tail.next = newNode;         // Connect node at end
                tail = newNode;              // Update tail
            }
            size++;
        }


        void insertAtHead(int data) {
            Node newNode = new Node(data);   // Create new node
            if (head == null) {              // Empty list
                head = tail = newNode;
                size++;
                return;
            }
            newNode.next = head;             // New node points to old head
            head = newNode;                  // Update head
            size++;
        }

        void insertAtIndex(int index, int data) {
            if (index < 0 || index > size) { // Invalid index
                System.out.println("Wrong Index");
                return;
            }

            if (index == 0) {                // Insert at beginning
                insertAtHead(data);
                return;
            }

            if (index == size) {             // Insert at end
                insertAtEnd(data);
                return;
            }

            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;            // Reach previous node
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;        // Connect next part
            temp.next = newNode;             // Connect previous part
            size++;
        }


        int getAt(int index) {
            if (index < 0 || index >= size) { // Invalid index
                System.out.println("Wrong Index");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;            // Move to required index
            }
            return temp.data;
        }


        void deleteAt(int index) {
            if (index < 0 || index >= size) { // Invalid index
                System.out.println("Wrong Index");
                return;
            }
            if (index == 0) {                // Delete first node
                head = head.next;
                if (head == null) {          // List became empty
                    tail = null;
                }
                size--;
                return;
            }

            Node temp = head;

            for (int i = 1; i < index; i++) {
                temp = temp.next;            // Reach previous node
            }
            if (temp.next == tail) {         // Deleting last node
                tail = temp;
            }
            temp.next = temp.next.next;      // Remove node
            size--;
        }
        

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " "); // Print node
                temp = temp.next;                 // Move ahead
            }
            System.out.println();
        }
        int size() {
            return size;                     // O(1) size access
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.insertAtEnd(1);
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);

        ll.insertAtHead(13);

        ll.insertAtIndex(4, 20);             // Insert at end
        ll.display();                        // Output: 13 1 5 12 20

        ll.insertAtIndex(0, 100);            // Insert at head
        ll.display();                        // Output: 100 13 1 5 12 20

        ll.deleteAt(4);                      // Delete index 4
        ll.display();                        // Output: 100 13 1 5 20

        System.out.println("Tail = " + ll.tail.data); // Output: Tail = 20

        System.out.println("Element = " + ll.getAt(3)); // Output: Element = 5

        System.out.println("Size = " + ll.size()); // Output: Size = 5
    }
}

/*
Linked List Implementation:

head -> First node
tail -> Last node
size -> Number of nodes

Operations:
insertAtHead()  -> O(1)
insertAtEnd()   -> O(1)
insertAtIndex() -> O(n)
getAt()         -> O(n)
deleteAt()      -> O(n)
display()       -> O(n)

Important Fixes:
- insertAtHead() size bug fixed
- insertAtIndex() traversal bug fixed
- getAt() index validation fixed
- deleteAt() tail update bug fixed
- Empty list cases handled

Interview Point:
Maintaining tail makes insertAtEnd() O(1).
Maintaining size variable makes size() O(1).
*/