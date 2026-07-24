package queue.deque;

public class designDeque {

    static class MyCircularDeque {

        private int[] deque;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public MyCircularDeque(int capacity) {

            this.capacity = capacity;
            deque = new int[capacity];

            front = 0;
            rear = -1;
            size = 0;
        }

        // Insert at Front
        public boolean insertFront(int value) {

            if (isFull()) {
                return false;
            }

            if (isEmpty()) {

                front = rear = 0;

            } else {

                front = (front - 1 + capacity) % capacity;
            }

            deque[front] = value;
            size++;

            return true;
        }

        // Insert at Rear
        public boolean insertLast(int value) {

            if (isFull()) {
                return false;
            }

            if (isEmpty()) {

                front = rear = 0;

            } else {

                rear = (rear + 1) % capacity;
            }

            deque[rear] = value;
            size++;

            return true;
        }

        // Delete Front
        public boolean deleteFront() {

            if (isEmpty()) {
                return false;
            }

            if (size == 1) {

                front = 0;
                rear = -1;

            } else {

                front = (front + 1) % capacity;
            }

            size--;

            return true;
        }

        // Delete Rear
        public boolean deleteLast() {

            if (isEmpty()) {
                return false;
            }

            if (size == 1) {

                front = 0;
                rear = -1;

            } else {

                rear = (rear - 1 + capacity) % capacity;
            }

            size--;

            return true;
        }

        // Get Front
        public int getFront() {

            if (isEmpty()) {
                return -1;
            }

            return deque[front];
        }

        // Get Rear
        public int getRear() {

            if (isEmpty()) {
                return -1;
            }

            return deque[rear];
        }

        // Empty Check
        public boolean isEmpty() {
            return size == 0;
        }

        // Full Check
        public boolean isFull() {
            return size == capacity;
        }

        // Display
        public void display() {

            if (isEmpty()) {

                System.out.println("Deque is Empty");
                return;
            }

            int index = front;

            for (int i = 0; i < size; i++) {

                System.out.print(deque[index] + " ");
                index = (index + 1) % capacity;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        MyCircularDeque deque = new MyCircularDeque(5);

        deque.insertLast(20);
        deque.insertLast(30);

        deque.insertFront(10);
        deque.insertFront(5);

        deque.display();

        System.out.println("Front : " + deque.getFront());
        System.out.println("Rear : " + deque.getRear());

        deque.deleteFront();
        deque.deleteLast();

        deque.display();

        System.out.println("Is Empty : " + deque.isEmpty());
        System.out.println("Is Full : " + deque.isFull());
    }
}

/*

Design Circular Deque (LeetCode 641)

Definition

• Circular Deque ek Double Ended Queue hai jisme
  Front aur Rear dono se Insert aur Delete kar sakte hain.
• Circular Array ka use karke Empty Space reuse hoti hai.

Concept Used

• Circular Array
• Deque
• Modulo (%)

Operations

• insertFront() → Front par Insert
• insertLast() → Rear par Insert
• deleteFront() → Front se Delete
• deleteLast() → Rear se Delete
• getFront() → Front Element
• getRear() → Rear Element
• isEmpty() → Empty Check
• isFull() → Full Check

Main Logic

Front Update

(front - 1 + capacity) % capacity

Rear Update

(rear + 1) % capacity

Delete Front

(front + 1) % capacity

Delete Rear

(rear - 1 + capacity) % capacity

Empty Condition

size == 0

Full Condition

size == capacity

Time Complexity

• insertFront() → O(1)
• insertLast() → O(1)
• deleteFront() → O(1)
• deleteLast() → O(1)
• getFront() → O(1)
• getRear() → O(1)
• isEmpty() → O(1)
• isFull() → O(1)

Space Complexity

• O(n)

Advantages

• Insert/Delete from Both Ends
• O(1) Operations
• Efficient Memory Usage
• Empty Space Reuse

Disadvantages

• Fixed Size
• Circular Index Handling thodi Complex hoti hai.

Applications

• Browser History
• Undo / Redo
• LRU Cache
• Sliding Window
• Task Scheduling
• LeetCode 641

*/