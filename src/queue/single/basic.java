package queue.single;

import java.util.LinkedList;
import java.util.Queue;

public class basic {

    public static void main(String[] args) {

        // Queue Declaration
        Queue<Integer> queue = new LinkedList<>();

        // Empty Check
        System.out.println("Is Queue Empty : " + queue.isEmpty());

        // Add
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("\nQueue : " + queue);

        // Size
        System.out.println("Queue Size : " + queue.size());

        // Remove
        System.out.println("\nRemoved : " + queue.remove());
        System.out.println("Queue : " + queue);

        // Poll
        System.out.println("\nRemoved : " + queue.poll());
        System.out.println("Queue : " + queue);

        // Front Element
        System.out.println("\nFront Element : " + queue.element());
        System.out.println("Front Element : " + queue.peek());

        // Empty Check
        System.out.println("\nIs Queue Empty : " + queue.isEmpty());
        System.out.println("Queue Size : " + queue.size());
    }
}

/*

Queue Basics

Definition

• Queue ek Linear Data Structure hai.
• FIFO (First In First Out) follow karti hai.
• Pehla Inserted Element sabse pehle Remove hota hai.

Declaration

Queue<Integer> queue = new LinkedList<>();

Concept Used

• Queue Interface
• LinkedList Implementation

Operations

Insertion

• add() → Rear par Insert

Deletion

• remove() → Front se Delete
• poll() → Front se Delete (Safe)

Access

• element() → Front Element
• peek() → Front Element (Safe)

Utility

• size() → Queue Size
• isEmpty() → Empty Check

Difference

add() vs offer()

• add() → Failure par Exception
• offer() → Failure par false

remove() vs poll()

• remove() → Empty Queue par Exception
• poll() → Empty Queue par null

element() vs peek()

• element() → Empty Queue par Exception
• peek() → Empty Queue par null

Time Complexity

• add() → O(1)
• remove() → O(1)
• poll() → O(1)
• element() → O(1)
• peek() → O(1)
• size() → O(1)
• isEmpty() → O(1)

Space Complexity

• O(n)

Advantages

• FIFO Order
• Simple to Use
• Dynamic Size
• Fast Insert/Delete

Disadvantages

• Random Access Available nahi hota.
• Middle Element Direct Access possible nahi hai.

Applications

• Printer Queue
• CPU Scheduling
• BFS
• Task Scheduling
• Ticket Booking

*/