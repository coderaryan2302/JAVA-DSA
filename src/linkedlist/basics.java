package linkedlist;
public class basics {

    // Node Class
    static class Node {
        int data;          // Store value
        Node next;         // Store address of next node

        Node(int data) {
            this.data = data;
            this.next = null;     // Initially next is null
        }
    }


    // Display Linked List
    public static void display(Node head) {
        Node temp = head;                        // Temporary node for traversal
        while (temp != null) {
            System.out.print(temp.data + " ");   // Print current node
            temp = temp.next;                    // Move to next node
        }
        System.out.println();                    // New line after output
    }


    // Find Length of Linked List
    public static int length(Node head) {
        int count = 0;                          // Node counter
        while (head != null) {
            count++;                            // Increase count
            head = head.next;                   // Move forward
        }
        return count;                           // Return total nodes
    }


    // Insert Node at End
    public static void insertAtEnd(Node head, int data) {
        if (head == null) {                     // Safety check
            return;
        }
        Node newNode = new Node(data);          // Create new node
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;                   // Reach last node
        }
        temp.next = newNode;                    // Attach new node
    }


    // Display Using Recursion (Forward)
    public static void displayForward(Node head) {
        if (head == null) {
            return;                             // Base condition
        }
        System.out.print(head.data + " ");      // Print current node
        displayForward(head.next);              // Recursive call
    }


    // Display Using Recursion (Reverse)
    public static void displayReverse(Node head) {
        if (head == null) {
            return;                             // Base condition
        }
        displayReverse(head.next);              // Go till last node
        System.out.print(head.data + " ");      // Print while returning
    }


    // Main Method
    public static void main(String[] args) {

        // Creating Nodes
        Node a = new Node(5);      // Head Node
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);     // Tail Node

        // Connecting Nodes
        a.next = b;                // 5 -> 10
        b.next = c;                // 10 -> 15
        c.next = d;                // 15 -> 20
        d.next = e;                // 20 -> 25

        // Original Linked List
        System.out.println("Original Linked List :");     // Output Heading
        display(a);

        // Length of Linked List
        System.out.println("Length : " + length(a));      // Output: 5

        // Display Using Recursion (Forward)
        System.out.println("Display By Recursion (Forward) :");
        displayForward(a);
        System.out.println();

        // Display Using Recursion (Reverse)
        System.out.println("Display By Recursion (Reverse) :");
        displayReverse(a);
        System.out.println();

        // Insert At End
        insertAtEnd(a, 87);
        System.out.println("After Inserting 87 At End :"); // Output Heading
        display(a);                                        // Output: 5 10 15 20 25 87
    }
}

/*

LINKED LIST - BASIC NOTES

Definition:
Linked List ek linear data structure hai jisme
nodes aapas me address ke through connected hote hain.

Each Node Contains:
1. Data
2. Address (Reference) of Next Node

Example:
5 -> 10 -> 15 -> 20 -> 25 -> null

Head:
Pehle node ko Head bolte hain.
Tail:
Last node ko Tail bolte hain.


TYPES OF LINKED LIST
1. Singly Linked List
   Data + Next
2. Doubly Linked List
   Previous + Data + Next
3. Circular Linked List
   Last node first node ko point karta hai.

ADVANTAGES
✔ Dynamic Size
✔ Easy Insertion
✔ Easy Deletion
✔ Memory Requirement ke according grow karta hai

DISADVANTAGES
✘ Random Access nahi hota
✘ Extra memory next reference ke liye lagti hai
✘ Traversal slow hota hai compared to Array

TIME COMPLEXITY
Display Traversal      : O(n)
Length Calculation     : O(n)
Insert At End          : O(n)
Insert At Beginning    : O(1)
Delete At Beginning    : O(1)
Search Element         : O(n)

SPACE COMPLEXITY
Normal Traversal       : O(1)
Recursion Traversal    : O(n)
(Call Stack use hota hai)

IMPORTANT INTERVIEW POINTS
1. Head first node ko point karta hai.
2. Tail ki next value always null hoti hai.
3. Linked List continuous memory me store nahi hoti.
4. Node = Data + Next Address
5. Recursion se reverse order print kar sakte hain
   bina linked list ko reverse kiye.

*/