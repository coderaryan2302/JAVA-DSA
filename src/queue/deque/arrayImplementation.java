package queue.deque;

public class arrayImplementation {

    static class DequeArray {

        private int[] arr;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        // Constructor
        public DequeArray(int capacity) {

            this.capacity = capacity;
            arr = new int[capacity];

            front = -1;
            rear = -1;
            size = 0;
        }

        // Empty Check
        public boolean isEmpty() {
            return size == 0;
        }

        // Full Check
        public boolean isFull() {
            return size == capacity;
        }

        // Add First
        public void addFirst(int value) {

            if (isFull()) {

                System.out.println("Deque Overflow");
                return;
            }

            if (isEmpty()) {

                front = rear = 0;

            } else {

                front = (front - 1 + capacity) % capacity;
            }

            arr[front] = value;
            size++;
        }

        // Add Last
        public void addLast(int value) {

            if (isFull()) {

                System.out.println("Deque Overflow");
                return;
            }

            if (isEmpty()) {

                front = rear = 0;

            } else {

                rear = (rear + 1) % capacity;
            }

            arr[rear] = value;
            size++;
        }

        // Remove First
        public int removeFirst() {

            if (isEmpty()) {

                System.out.println("Deque Underflow");
                return -1;
            }

            int value = arr[front];

            if (size == 1) {

                front = rear = -1;

            } else {

                front = (front + 1) % capacity;
            }

            size--;

            return value;
        }

        // Remove Last
        public int removeLast() {

            if (isEmpty()) {

                System.out.println("Deque Underflow");
                return -1;
            }

            int value = arr[rear];

            if (size == 1) {

                front = rear = -1;

            } else {

                rear = (rear - 1 + capacity) % capacity;
            }

            size--;

            return value;
        }

        // Get First
        public int getFirst() {

            if (isEmpty()) {

                System.out.println("Deque is Empty");
                return -1;
            }

            return arr[front];
        }

        // Get Last
        public int getLast() {

            if (isEmpty()) {

                System.out.println("Deque is Empty");
                return -1;
            }

            return arr[rear];
        }

        // Display
        public void display() {

            if (isEmpty()) {

                System.out.println("Deque is Empty");
                return;
            }

            System.out.print("Deque : ");

            int index = front;

            for (int i = 0; i < size; i++) {

                System.out.print(arr[index] + " ");
                index = (index + 1) % capacity;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        DequeArray deque = new DequeArray(5);

        deque.addLast(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);
        deque.addFirst(1);

        deque.display();

        System.out.println("First : " + deque.getFirst());
        System.out.println("Last : " + deque.getLast());

        System.out.println("Removed First : " + deque.removeFirst());
        System.out.println("Removed Last : " + deque.removeLast());

        deque.display();
    }
}

/*

Deque using Array

Definition

• Deque (Double Ended Queue) me Insertion aur Deletion dono ends
  (Front aur Rear) se ho sakte hain.
• Circular Array ka use kiya gaya hai.

Concept Used

• Circular Array
• Modulo (%)

Data Members

• arr[] → Store Elements
• front → First Element
• rear → Last Element
• size → Current Number of Elements
• capacity → Maximum Size

Operations

• addFirst() → Front par Insert
• addLast() → Rear par Insert
• removeFirst() → Front se Delete
• removeLast() → Rear se Delete
• getFirst() → Front Element
• getLast() → Rear Element
• isEmpty() → Empty Check
• isFull() → Full Check

Main Logic

Front Update

(front - 1 + capacity) % capacity

Rear Update

(rear + 1) % capacity

Empty Condition

size == 0

Full Condition

size == capacity

Time Complexity

• addFirst() → O(1)
• addLast() → O(1)
• removeFirst() → O(1)
• removeLast() → O(1)
• getFirst() → O(1)
• getLast() → O(1)
• display() → O(n)

Space Complexity

• O(n)

Advantages

• Insert from Both Ends
• Delete from Both Ends
• Fast O(1) Operations
• Better than Normal Queue

Disadvantages

• Fixed Size
• Circular Logic thoda Complex hota hai.

Applications

• Browser History
• Undo / Redo
• Sliding Window
• LRU Cache
• Task Scheduling
• Palindrome Checking

*/