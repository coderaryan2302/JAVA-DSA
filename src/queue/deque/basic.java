package queue.deque;

import java.util.Deque;
import java.util.LinkedList;

public class basic {

    public static void main(String[] args) {

        // Deque Declaration
        Deque<Integer> deque = new LinkedList<>();

        // Add
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(1);
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);

        System.out.println("Deque : " + deque);

        deque.addFirst(5);
        System.out.println("After addFirst : " + deque);

        deque.add(6); // Same as addLast()
        System.out.println("After add : " + deque);

        // Remove
        deque.removeLast();
        System.out.println("After removeLast : " + deque);

        deque.removeFirst();
        System.out.println("After removeFirst : " + deque);

        deque.remove(); // Same as removeFirst()
        System.out.println("After remove : " + deque);

        // Remove Occurrence
        deque.removeFirstOccurrence(2);
        System.out.println("After removeFirstOccurrence : " + deque);

        deque.removeLastOccurrence(1);
        System.out.println("After removeLastOccurrence : " + deque);

        // Access
        System.out.println("First Element : " + deque.getFirst());
        System.out.println("Last Element : " + deque.getLast());

        // Implementation Class
        System.out.println("Implementation : " + deque.getClass());

        // Clear
        deque.clear();
        System.out.println("After clear : " + deque);
    }
}

/*

Deque Basics

Definition

• Deque (Double Ended Queue) me Insertion aur Deletion
  Front aur Rear dono taraf se ho sakta hai.
• FIFO aur LIFO dono tarah use kiya ja sakta hai.

Declaration

Deque<Integer> deque = new LinkedList<>();

Concept Used

• Deque Interface
• LinkedList Implementation

Operations

Insertion

• addFirst() → Front par Insert
• addLast() → Rear par Insert
• add() → Rear par Insert

Deletion

• removeFirst() → Front se Delete
• removeLast() → Rear se Delete
• remove() → Front se Delete

Occurrence

• removeFirstOccurrence()
• removeLastOccurrence()

Access

• getFirst() → First Element
• getLast() → Last Element

Utility

• clear() → Sabhi Elements Delete

Time Complexity

• addFirst() → O(1)
• addLast() → O(1)
• removeFirst() → O(1)
• removeLast() → O(1)
• getFirst() → O(1)
• getLast() → O(1)
• removeOccurrence() → O(n)
• clear() → O(n)

Space Complexity

• O(n)

Advantages

• Insert/Delete from Both Ends
• Fast O(1) Operations
• Flexible (Queue + Stack)
• Dynamic Size

Disadvantages

• Random Access Available nahi hota.
• removeOccurrence() Linear Time leta hai.

Applications

• Sliding Window
• LRU Cache
• Undo / Redo
• Browser History
• BFS
• Palindrome Checking

*/