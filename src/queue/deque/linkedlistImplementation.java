package queue.deque;

public class linkedlistImplementation {

    static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Deque {

        private Node front;
        private Node rear;
        private int size;

        // Empty Check
        public boolean isEmpty() {
            return size == 0;
        }

        // Size
        public int size() {
            return size;
        }

        // Add First
        public void addFirst(int value) {

            Node newNode = new Node(value);

            if (isEmpty()) {

                front = rear = newNode;

            } else {

                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }

            size++;
        }

        // Add Last
        public void addLast(int value) {

            Node newNode = new Node(value);

            if (isEmpty()) {

                front = rear = newNode;

            } else {

                rear.next = newNode;
                newNode.prev = rear;
                rear = newNode;
            }

            size++;
        }

        // Remove First
        public int removeFirst() {

            if (isEmpty()) {

                System.out.println("Deque Underflow");
                return -1;
            }

            int value = front.data;

            if (front == rear) {

                front = rear = null;

            } else {

                front = front.next;
                front.prev = null;
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

            int value = rear.data;

            if (front == rear) {

                front = rear = null;

            } else {

                rear = rear.prev;
                rear.next = null;
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

            return front.data;
        }

        // Get Last
        public int getLast() {

            if (isEmpty()) {

                System.out.println("Deque is Empty");
                return -1;
            }

            return rear.data;
        }

        // Display
        public void display() {

            if (isEmpty()) {

                System.out.println("Deque is Empty");
                return;
            }

            System.out.print("Deque : ");

            Node temp = front;

            while (temp != null) {

                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Deque deque = new Deque();

        deque.addFirst(20);
        deque.addFirst(10);
        deque.addLast(30);
        deque.addLast(40);

        deque.display();

        System.out.println("First : " + deque.getFirst());
        System.out.println("Last : " + deque.getLast());

        System.out.println("Removed First : " + deque.removeFirst());
        System.out.println("Removed Last : " + deque.removeLast());

        deque.display();

        System.out.println("Size : " + deque.size());
    }
}

/*

Deque using Linked List

Definition

• Deque (Double Ended Queue) me Front aur Rear dono se
  Insertion aur Deletion ho sakta hai.
• Is implementation me Doubly Linked List use hui hai.

Concept Used

• Doubly Linked List

Data Members

• Node → data, prev, next
• front → First Node
• rear → Last Node
• size → Current Number of Elements

Operations

• addFirst() → Front par Insert
• addLast() → Rear par Insert
• removeFirst() → Front se Delete
• removeLast() → Rear se Delete
• getFirst() → Front Element
• getLast() → Rear Element
• size() → Total Elements
• isEmpty() → Empty Check
• display() → Print Deque

Main Logic

Insertion

• Front ya Rear par New Node add hota hai.
• prev aur next pointers update hote hain.

Deletion

• Front ya Rear Node remove hota hai.
• Remaining Nodes ke pointers update kiye jate hain.

Empty Condition

size == 0

Time Complexity

• addFirst() → O(1)
• addLast() → O(1)
• removeFirst() → O(1)
• removeLast() → O(1)
• getFirst() → O(1)
• getLast() → O(1)
• size() → O(1)
• isEmpty() → O(1)
• display() → O(n)

Space Complexity

• O(n)

Advantages

• Dynamic Size
• No Fixed Capacity
• Fast Insert/Delete from Both Ends
• No Memory Wastage

Disadvantages

• Extra Memory for prev Pointer
• More Memory than Array Implementation

Applications

• Browser History
• Undo / Redo
• LRU Cache
• Sliding Window
• Task Scheduling
• Palindrome Checking

*/