package queue.single;

import java.util.Stack;

public class implementQueueUsingStack {

    static class Queue {

        private Stack<Integer> stack = new Stack<>();
        private Stack<Integer> helper = new Stack<>();

        // Push
        public void push(int value) {
            stack.push(value);
        }

        // Pop
        public int pop() {

            if (empty()) {

                System.out.println("Queue is Empty");
                return -1;
            }

            while (stack.size() > 1) {
                helper.push(stack.pop());
            }

            int value = stack.pop();

            while (!helper.isEmpty()) {
                stack.push(helper.pop());
            }

            return value;
        }

        // Peek
        public int peek() {

            if (empty()) {

                System.out.println("Queue is Empty");
                return -1;
            }

            while (stack.size() > 1) {
                helper.push(stack.pop());
            }

            int value = stack.peek();

            while (!helper.isEmpty()) {
                stack.push(helper.pop());
            }

            return value;
        }

        // Empty Check
        public boolean empty() {
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println("Front : " + queue.peek());

        System.out.println("Removed : " + queue.pop());

        System.out.println("Front : " + queue.peek());

        System.out.println("Is Empty : " + queue.empty());
    }
}

/*

Implement Queue using Stack

Definition

• Do Stacks ka use karke Queue implement ki jaati hai.
• Queue FIFO (First In First Out) follow karti hai.

Concept Used

• Stack
• Two Stack Technique

Data Members

• stack → Main Stack
• helper → Temporary Stack

Operations

• push() → Queue me Insert
• pop() → Front Element Remove
• peek() → Front Element Return
• empty() → Queue Empty Check

Main Logic

Push

• Element directly Main Stack me add hota hai.

Pop / Peek

• Last Element ko chhodkar sabhi Elements Helper Stack me move karo.
• Front Element ko Remove ya Return karo.
• Helper Stack ke Elements wapas Main Stack me restore karo.

Time Complexity

• push() → O(1)
• pop() → O(n)
• peek() → O(n)
• empty() → O(1)

Space Complexity

• O(n)

Advantages

• Queue ko Stack se implement kar sakte hain.
• Push Operation Fast hota hai.
• FIFO Order Maintain rehta hai.

Disadvantages

• Pop aur Peek Slow hote hain.
• Extra Stack ki Need hoti hai.

Applications

• Stack Based Queue Problems
• Interview Questions
• Data Structure Conversion
• LeetCode 232

*/