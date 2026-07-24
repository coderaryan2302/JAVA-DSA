package queue.single;

import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsingQueue {

    static class Stack {

        private Queue<Integer> queue = new LinkedList<>();

        // Push
        public void push(int value) {
            queue.add(value);
        }

        // Pop
        public int pop() {

            if (empty()) {

                System.out.println("Stack is Empty");
                return -1;
            }

            int size = queue.size();

            for (int i = 1; i < size; i++) {
                queue.add(queue.remove());
            }

            return queue.remove();
        }

        // Top
        public int top() {

            if (empty()) {

                System.out.println("Stack is Empty");
                return -1;
            }

            int size = queue.size();

            for (int i = 1; i < size; i++) {
                queue.add(queue.remove());
            }

            int value = queue.peek();

            queue.add(queue.remove()); // Restore Queue

            return value;
        }

        // Empty Check
        public boolean empty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top : " + stack.top());

        System.out.println("Removed : " + stack.pop());

        System.out.println("Top : " + stack.top());

        System.out.println("Is Empty : " + stack.empty());
    }
}

/*

Implement Stack using Queue

Definition

• Ek Queue ka use karke Stack implement ki jaati hai.
• Stack LIFO (Last In First Out) follow karta hai.

Concept Used

• Queue
• Queue Rotation

Data Members

• queue → Store Stack Elements

Operations

• push() → Element Insert
• pop() → Top Element Remove
• top() → Top Element Return
• empty() → Stack Empty Check

Main Logic

Push

• Element directly Queue me add hota hai.

Pop / Top

• Queue ke First (size - 1) Elements ko Rear me rotate karo.
• Last Inserted Element Front par aa jata hai.
• Pop me Remove karo, Top me Return karke Queue Restore karo.

Time Complexity

• push() → O(1)
• pop() → O(n)
• top() → O(n)
• empty() → O(1)

Space Complexity

• O(n)

Advantages

• Single Queue se Stack implement hota hai.
• Push Operation Fast hoti hai.
• LIFO Order Maintain rehta hai.

Disadvantages

• Pop aur Top Slow hote hain.
• Queue Rotation karni padti hai.

Applications

• Queue Based Stack Problems
• Interview Questions
• Data Structure Conversion
• LeetCode 225

*/