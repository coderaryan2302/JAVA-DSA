package queue.circular;

import java.util.ArrayDeque;
import java.util.Queue;

public class basic {

    public static void main(String[] args) {

        // Circular Queue Declaration
        Queue<Integer> queue = new ArrayDeque<>();

        // Enqueue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue : " + queue);

        // Dequeue
        int removed = queue.remove();

        System.out.println("Removed : " + removed);
        System.out.println("Queue : " + queue);

        // Peek
        System.out.println("Front Element : " + queue.peek());

        // Size
        System.out.println("Size : " + queue.size());

        // Empty Check
        System.out.println("Is Empty : " + queue.isEmpty());

        // Add More Elements
        queue.add(50);
        queue.add(60);

        System.out.println("Queue : " + queue);

        // Implementation Class
        System.out.println("Implementation : " + queue.getClass());
    }
}

/*

Circular Queue (Basic)

Definition

• Circular Queue ek Queue hai jisme Last Position First Position se connected hoti hai.
• FIFO (First In First Out) follow karti hai.
• Java me ArrayDeque Circular Queue ki tarah kaam karta hai.

Declaration

Queue<Integer> queue = new ArrayDeque<>();

Common Operations

• add() → Rear par Insert
• remove() → Front se Delete
• peek() → Front Element Return
• size() → Queue Size
• isEmpty() → Queue Empty Check

Main Logic

• Front se Element remove hota hai.
• Rear par naya Element add hota hai.
• ArrayDeque internally Circular Array use karta hai.

Formula

Next Rear

(rear + 1) % capacity

Next Front

(front + 1) % capacity

Time Complexity

• add() → O(1)
• remove() → O(1)
• peek() → O(1)
• size() → O(1)
• isEmpty() → O(1)

Space Complexity

• O(n)

Advantages

• No Memory Wastage
• Fast Insertion
• Fast Deletion
• Efficient Space Usage
• Simple Implementation using ArrayDeque

Disadvantages

• Circular Logic samajhna thoda difficult ho sakta hai.
• ArrayDeque null values allow nahi karta.

Applications

• CPU Scheduling
• Circular Buffer
• Printer Queue
• Keyboard Buffer
• Network Buffer
• Streaming Data

*/