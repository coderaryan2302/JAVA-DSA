package queue.single;

public class arrayImplementation {

    static class QueueArray {

        private int[] arr;
        private int front;
        private int rear;
        private int size;

        // Constructor
        public QueueArray(int capacity) {

            arr = new int[capacity];
            front = -1;
            rear = -1;
            size = 0;
        }

        // Add
        public void add(int value) {

            if (rear == arr.length - 1) {

                System.out.println("Queue Overflow");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            arr[++rear] = value;
            size++;
        }

        // Remove
        public int remove() {

            if (isEmpty()) {

                System.out.println("Queue Underflow");
                return -1;
            }

            int value = arr[front];

            front++;
            size--;

            if (size == 0) {
                front = rear = -1;
            }

            return value;
        }

        // Peek
        public int peek() {

            if (isEmpty()) {

                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }

        // Empty Check
        public boolean isEmpty() {
            return size == 0;
        }

        // Size
        public int size() {
            return size;
        }

        // Display
        public void display() {

            if (isEmpty()) {

                System.out.println("Queue is Empty");
                return;
            }

            System.out.print("Queue : ");

            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        QueueArray queue = new QueueArray(10);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.display();

        System.out.println("Removed : " + queue.remove());

        queue.display();

        System.out.println("Front : " + queue.peek());
        System.out.println("Size : " + queue.size());
        System.out.println("Is Empty : " + queue.isEmpty());
    }
}

/*

Queue using Array

Definition

• Queue ek Linear Data Structure hai.
• FIFO (First In First Out) follow karti hai.
• Array ka use karke Queue implement ki gayi hai.

Concept Used

• Array
• FIFO

Data Members

• arr[] → Store Elements
• front → First Element
• rear → Last Element
• size → Current Number of Elements

Operations

• add() → Rear par Insert
• remove() → Front se Delete
• peek() → Front Element
• size() → Queue Size
• isEmpty() → Empty Check
• display() → Print Queue

Main Logic

Insertion

• Element Rear par add hota hai.

Deletion

• Front Element remove hota hai.
• Front next position par move ho jata hai.

Empty Condition

size == 0

Overflow Condition

rear == arr.length - 1

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

• Simple Implementation
• Fast Insert
• Fast Delete
• FIFO Order

Disadvantages

• Fixed Size
• Memory Wastage
• Removed Space Reuse nahi hota.

Applications

• Printer Queue
• Ticket Booking
• CPU Scheduling
• BFS
• Task Scheduling

*/