package queue.circular;

public class linkedlistImplementation {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class CircularQueue {

        private Node front;
        private Node rear;
        private int size;

        // Add
        public void add(int value) {

            Node newNode = new Node(value);

            if (isEmpty()) {

                front = rear = newNode;
                rear.next = front;

            } else {

                rear.next = newNode;
                rear = newNode;
                rear.next = front;
            }

            size++;
        }

        // Remove
        public int remove() {

            if (isEmpty()) {

                System.out.println("Queue Underflow");
                return -1;
            }

            int value = front.data;

            if (size == 1) {

                front = rear = null;

            } else {

                front = front.next;
                rear.next = front;
            }

            size--;

            return value;
        }

        // Peek
        public int peek() {

            if (isEmpty()) {

                System.out.println("Queue is Empty");
                return -1;
            }

            return front.data;
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

            Node temp = front;

            while (true) {

                System.out.print(temp.data + " ");

                if (temp == rear)
                    break;

                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();

        queue.display();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        queue.display();

        System.out.println("Removed : " + queue.remove());

        queue.display();

        queue.add(50);

        queue.display();

        System.out.println("Front : " + queue.peek());
        System.out.println("Size : " + queue.size());
        System.out.println("Is Empty : " + queue.isEmpty());
    }
}

/*

Circular Queue using Linked List

Definition

• Circular Queue me Last Node, First Node se connected hota hai.
• FIFO (First In First Out) follow karti hai.
• Linked List ki wajah se Queue Dynamic Size ki hoti hai.

Concept Used

• Circular Linked List

Data Members

• Node → data, next
• front → First Node
• rear → Last Node
• size → Current Number of Elements

Operations

• add() → Rear par Insert
• remove() → Front se Delete
• peek() → Front Element Return
• size() → Queue Size
• isEmpty() → Queue Empty Check
• display() → Queue Print

Main Logic

Insertion

• New Node Rear ke baad add hota hai.
• rear.next hamesha front ko point karta hai.

Deletion

• Front Node remove hota hai.
• Front ko next Node par move kar dete hain.
• rear.next ko naye Front se connect kar dete hain.

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
• Fast Insertion
• Fast Deletion

Disadvantages

• Extra Memory for Nodes
• Pointer Handling thodi Complex hoti hai.

Applications

• CPU Scheduling
• Circular Buffer
• Music Playlist
• Round Robin Scheduling
• Printer Queue
• Network Buffer

*/