package queue.circular;

public class designCircularQueue {

    static class MyCircularQueue {

        int[] queue;
        int front;
        int rear;
        int size;
        int capacity;

        public MyCircularQueue(int k) {

            capacity = k;
            queue = new int[k];
            front = 0;
            rear = -1;
            size = 0;
        }

        // Insert
        public boolean enQueue(int value) {

            if (isFull())
                return false;

            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;

            return true;
        }

        // Delete
        public boolean deQueue() {

            if (isEmpty())
                return false;

            front = (front + 1) % capacity;
            size--;

            return true;
        }

        // Front Element
        public int Front() {

            if (isEmpty())
                return -1;

            return queue[front];
        }

        // Rear Element
        public int Rear() {

            if (isEmpty())
                return -1;

            return queue[rear];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        // Display
        public void display() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }

            int index = front;

            for (int i = 0; i < size; i++) {
                System.out.print(queue[index] + " ");
                index = (index + 1) % capacity;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        MyCircularQueue queue = new MyCircularQueue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        queue.display();

        System.out.println("Front : " + queue.Front());
        System.out.println("Rear  : " + queue.Rear());

        queue.deQueue();

        queue.display();

        queue.enQueue(50);
        queue.enQueue(60);

        queue.display();

        System.out.println("Is Full : " + queue.isFull());
    }
}

/*

Design Circular Queue (LeetCode 622)

Definition

• Circular Queue ek Fixed Size Queue hai.
• Front aur Rear Circular way me move karte hain.
• FIFO (First In First Out) follow karti hai.

Concept Used

• Circular Array
• Modulo (%)

Data Members

• queue[] → Queue Elements
• front → First Element
• rear → Last Element
• size → Current Elements
• capacity → Maximum Capacity

Operations

• enQueue() → Rear par Insert
• deQueue() → Front se Delete
• Front() → First Element Return
• Rear() → Last Element Return
• isEmpty() → Queue Empty Check
• isFull() → Queue Full Check

Main Logic

Insertion

rear = (rear + 1) % capacity

Deletion

front = (front + 1) % capacity

Empty Condition

size == 0

Full Condition

size == capacity

Why Modulo (%)?

• Last Index ke baad First Index par wapas aane ke liye.
• Empty Positions ko dobara use karta hai.

Time Complexity

• enQueue() → O(1)
• deQueue() → O(1)
• Front() → O(1)
• Rear() → O(1)
• isEmpty() → O(1)
• isFull() → O(1)

Space Complexity

• O(n)

Advantages

• No Memory Wastage
• Fast Insert & Delete
• Fixed Size Queue
• Interview Favourite

Disadvantages

• Fixed Capacity
• Circular Logic thoda Complex hota hai.
• Size limit cross nahi kar sakte.

Applications

• CPU Scheduling
• Round Robin Scheduling
• Circular Buffer
• Streaming Data
• Network Buffer
• Printer Queue

*/