package queue.single;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reorderQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);

        System.out.println("Original Queue : " + queue);

        Stack<Integer> stack = new Stack<>();

        int n = queue.size();

        // Step 1 : Move first half to Stack
        for (int i = 1; i <= n / 2; i++) {
            stack.push(queue.remove());
        }

        // Step 2 : Move Stack back to Queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3 : Move first half again to Stack
        for (int i = 1; i <= n / 2; i++) {
            stack.push(queue.remove());
        }

        // Step 4 : Interleave Queue
        while (!stack.isEmpty()) {

            queue.add(stack.pop());
            queue.add(queue.remove());
        }

        System.out.println("Reordered Queue : " + queue);
    }
}

/*

Reorder Queue

Definition

• Queue ke First Half ko Second Half ke saath Alternate (Interleave) karna hota hai.

Example

Input

1 2 3 4 5 6 7 8

Output

1 5 2 6 3 7 4 8

Concept Used

• Queue
• Stack
• Interleaving

Main Logic

• First Half ko Stack me store karo.
• Stack ke Elements Queue me wapas add karo.
• First Half ko dobara Stack me move karo.
• Ek Element Stack se aur ek Queue se add karke Final Queue banao.

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Simple Implementation
• Efficient Linear Time Solution

Disadvantages

• Extra Stack ki Need hoti hai.
• Even Size Queue ke liye Suitable hai.

Applications

• Queue Rearrangement
• Data Reordering
• Interview Questions

*/