package queue.single;

public class linkedlistImplementation {

    // Node
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Queue
    static class QueueLL {

        private Node head;
        private Node tail;
        private int size;

        // Add
        public void add(int value) {

            Node newNode = new Node(value);

            if (isEmpty()) {

                head = tail = newNode;

            } else {

                tail.next = newNode;
                tail = newNode;
            }

            size++;
        }

        // Remove
        public int remove() {

            if (isEmpty()) {

                System.out.println("Queue is Empty");
                return -1;
            }

            int value = head.data;

            head = head.next;
            size--;

            if (head == null) {
                tail = null;
            }

            return value;
        }

        // Peek
        public int peek() {

            if (isEmpty()) {

                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;
        }

        // Size
        public int size() {
            return size;
        }

        // Empty Check
        public boolean isEmpty() {
            return size == 0;
        }

        // Display
        public void display() {

            if (isEmpty()) {

                System.out.println("Queue is Empty");
                return;
            }

            System.out.print("Queue : ");

            Node temp = head;

            while (temp != null) {

                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        QueueLL queue = new QueueLL();

        queue.display();

        System.out.println("Is Empty : " + queue.isEmpty());

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.display();

        System.out.println("Front : " + queue.peek());

        System.out.println("Removed : " + queue.remove());

        queue.display();

        System.out.println("Size : " + queue.size());

        System.out.println("Is Empty : " + queue.isEmpty());
    }
}

/*

Queue using Linked List

Definition

• Queue ko Singly Linked List se implement kiya ja sakta hai.
• FIFO (First In First Out) follow karti hai.
• Dynamic Size hoti hai.

Concept Used

• Singly Linked List
• FIFO

Data Members

• Node → data, next
• head → First Node
• tail → Last Node
• size → Current Number of Elements

Operations

• add() → Tail par Insert
• remove() → Head se Delete
• peek() → Front Element
• size() → Queue Size
• isEmpty() → Empty Check
• display() → Print Queue

Main Logic

Insertion

• New Node Tail ke baad add hota hai.
• Tail ko New Node par update kar dete hain.

Deletion

• Head Node remove hota hai.
• Head ko Next Node par move kar dete hain.
• Agar Queue Empty ho jaye to Tail bhi null kar dete hain.

Empty Condition

size == 0

Time Complexity

• add() → O(1)
• remove() → O(1)
• peek() → O(1)
• size() → O(1)
• isEmpty() → O(1)
• display() → O(n)

Space Complexity

• O(n)

Advantages

• Dynamic Size
• No Fixed Capacity
• No Memory Wastage
• Fast Insert/Delete

Disadvantages

• Extra Memory for Node
• Array Queue se thodi Slow hoti hai.

Applications

• Printer Queue
• CPU Scheduling
• BFS
• Task Scheduling
• Message Queue

*/