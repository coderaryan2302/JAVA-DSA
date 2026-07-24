package queue.single;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {

    public static void reverseQueue(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();

        // Step 1 : Move Queue to Stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Step 2 : Move Stack back to Queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Original Queue : " + queue);

        reverseQueue(queue);

        System.out.println("Reversed Queue : " + queue);
    }
}

/*

Reverse Queue

Definition

• Queue ke sabhi Elements ko Reverse karna hota hai.
• Stack ki LIFO Property ka use kiya jata hai.

Example

Input

10 20 30 40 50

Output

50 40 30 20 10

Concept Used

• Queue
• Stack
• LIFO

Main Logic

• Queue ke sabhi Elements Stack me move karo.
• Stack ke Elements wapas Queue me add karo.
• LIFO ki wajah se Queue Reverse ho jaati hai.

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Simple Implementation
• Easy to Understand
• Efficient Linear Time Solution

Disadvantages

• Extra Stack ki Need hoti hai.
• Additional Space lagti hai.

Applications

• Queue Manipulation
• Data Reversal
• Interview Questions

*/