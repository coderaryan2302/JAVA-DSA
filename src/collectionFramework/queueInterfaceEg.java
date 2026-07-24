package collectionFramework;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueInterfaceEg {

    // Queue using LinkedList
    static void linkedListExample() {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);

        System.out.println(queue.peek());      // Front Element

        System.out.println(queue.poll());      // Remove Front

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.size());

        System.out.println(queue.isEmpty());
    }

    // Min Priority Queue
    static void minPriorityQueueExample() {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(5);
        pq.offer(7);
        pq.offer(2);

        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());
    }

    // Max Priority Queue
    static void maxPriorityQueueExample() {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(10);
        pq.offer(5);
        pq.offer(7);
        pq.offer(2);

        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());
    }

    // Deque Example
    static void dequeExample() {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);

        System.out.println(deque);

        System.out.println(deque.peekFirst());

        System.out.println(deque.peekLast());

        System.out.println(deque.pollFirst());

        System.out.println(deque.pollLast());

        System.out.println(deque);
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("----- Queue (LinkedList) -----");
        linkedListExample();

        System.out.println("\n----- Min Priority Queue -----");
        minPriorityQueueExample();

        System.out.println("\n----- Max Priority Queue -----");
        maxPriorityQueueExample();

        System.out.println("\n----- Deque -----");
        dequeExample();
    }
}

/*

Queue Interface

Definition

• Queue Java Collection Framework ka Interface hai.
• FIFO (First In First Out) principle follow karta hai.

Characteristics

• FIFO
• Insertion Rear se hota hai.
• Deletion Front se hota hai.
• Dynamic Size

Implementations

• LinkedList
• PriorityQueue
• ArrayDeque

LinkedList Queue

• FIFO follow karta hai.
• Insertion Order maintain karta hai.
• Null values allow karta hai.

PriorityQueue

• Elements Priority ke according store hote hain.
• By default Min Heap hota hai.

Min Priority Queue

• Smallest element ki highest priority hoti hai.

Max Priority Queue

• Comparator.reverseOrder() use hota hai.
• Largest element ki highest priority hoti hai.

Deque

• Double Ended Queue
• Front aur Rear dono side insertion aur deletion possible hai.

Common Queue Methods

• offer() → Insert Element
• poll() → Remove Front Element
• peek() → Front Element
• size() → Total Elements
• isEmpty() → Check Empty

Deque Methods

• addFirst()
• addLast()
• peekFirst()
• peekLast()
• pollFirst()
• pollLast()

Time Complexity

Queue (LinkedList)

• offer() → O(1)
• poll() → O(1)
• peek() → O(1)

PriorityQueue

• offer() → O(log n)
• poll() → O(log n)
• peek() → O(1)

Deque (ArrayDeque)

• addFirst() → O(1)
• addLast() → O(1)
• pollFirst() → O(1)
• pollLast() → O(1)

Space Complexity

• O(n)

Advantages

• Fast Insertion and Deletion.
• FIFO Processing.
• Priority Handling.
• Dynamic Size.

Disadvantages

• Random Access possible nahi hai.
• PriorityQueue insertion order maintain nahi karta.

Applications

• CPU Scheduling
• Printer Queue
• Ticket Booking
• BFS Traversal
• Task Scheduling
• Hospital Queue
• Job Scheduling

*/