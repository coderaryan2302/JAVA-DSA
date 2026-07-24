package queue.circular;

public class arrayImplementation {

    static class CircularQueue {

        private int[] arr;
        private int front;
        private int rear;
        private int size;

        // Constructor
        public CircularQueue(int capacity) {

            arr = new int[capacity];
            front = -1;
            rear = -1;
            size = 0;
        }

        // Add
        public void add(int value) {

            if (size == arr.length) {

                System.out.println("Queue Overflow");
                return;
            }

            if (size == 0) {

                front = rear = 0;

            } else {

                rear = (rear + 1) % arr.length;
            }

            arr[rear] = value;
            size++;
        }

        // Remove
        public int remove() {

            if (size == 0) {

                System.out.println("Queue Underflow");
                return -1;
            }

            int value = arr[front];

            if (size == 1) {

                front = rear = -1;

            } else {

                front = (front + 1) % arr.length;
            }

            size--;

            return value;
        }

        // Peek
        public int peek() {

            if (size == 0) {

                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
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

            if (size == 0) {

                System.out.println("Queue is Empty!");
                return;
            }

            int index = front;

            for (int i = 0; i < size; i++) {

                System.out.print(arr[index] + " ");
                index = (index + 1) % arr.length;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(5);

        queue.display();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.display();

        queue.remove();

        queue.display();

        queue.add(5);

        queue.display();

        queue.add(6);

        queue.display();

        queue.add(7);      // Overflow
    }
}

/*

Circular Queue Using Array

Definition

• Circular Queue ek Queue hai jo Circular Array ka use karti hai.
• Last Index ke baad fir se First Index par aa jati hai.
• FIFO (First In First Out) follow karti hai.

Why Circular Queue?

• Linear Queue me Front ke khali indexes reuse nahi hote.
• Circular Queue unhi empty positions ko dobara use karti hai.
• Isliye Memory Waste nahi hoti.

Data Members

• arr[] → Queue Elements
• front → First Element
• rear → Last Element
• size → Current Number of Elements

Operations

• add(value) → Rear par Insert
• remove() → Front se Delete
• peek() → Front Element Return
• size() → Queue Size
• isEmpty() → Queue Empty Check
• display() → Queue Print

Main Logic

Insertion

rear = (rear + 1) % arr.length

Deletion

front = (front + 1) % arr.length

Empty Condition

size == 0

Full Condition

size == arr.length

Why Modulo (%)?

• Last Index ke baad First Index par wapas lane ke liye.

Example

Capacity = 5

Rear = 4

Next Rear

(4 + 1) % 5 = 0

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

• No Memory Wastage
• Efficient Space Usage
• Fast Insertion
• Fast Deletion
• Better than Linear Queue

Disadvantages

• Fixed Size
• Circular Logic thoda Complex hota hai.
• Modulo Calculation sahi hona chahiye.

Applications

• CPU Scheduling
• Circular Buffer
• Printer Queue
• Network Buffer
• Streaming Data
• Traffic Signal Systems

*/