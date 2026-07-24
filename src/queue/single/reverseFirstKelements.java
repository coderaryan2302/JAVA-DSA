package queue.single;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstKelements {

    public static void reverseFirstK(Queue<Integer> queue, int k) {

        if (queue.isEmpty() || k <= 0 || k > queue.size()) {

            System.out.println("Invalid Value of K");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1 : Move first K elements to Stack
        for (int i = 1; i <= k; i++) {
            stack.push(queue.remove());
        }

        // Step 2 : Move Stack back to Queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3 : Move remaining elements to Rear
        int remaining = queue.size() - k;

        for (int i = 1; i <= remaining; i++) {
            queue.add(queue.remove());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);

        System.out.println("Original Queue : " + queue);

        reverseFirstK(queue, 4);

        System.out.println("After Reverse : " + queue);
    }
}

/*

Reverse First K Elements of Queue

Definition

• Queue ke First K Elements ko Reverse karna hota hai.
• Remaining Elements ka Order Same rehta hai.

Example

Input

10 20 30 40 50 60 70

K = 4

Output

40 30 20 10 50 60 70

Concept Used

• Queue
• Stack

Main Logic

• First K Elements ko Stack me store karo.
• Stack ke Elements Queue me wapas add karo.
• Remaining Elements ko Rear me rotate karo.
• Isse Reverse kiye hue Elements Front par aa jate hain.

Time Complexity

• O(n)

Space Complexity

• O(k)

Advantages

• Simple Implementation
• Efficient Linear Time Solution
• Sirf K Elements ke liye Extra Space lagti hai.

Disadvantages

• Extra Stack ki Need hoti hai.
• Invalid K ko Handle karna padta hai.

Applications

• Queue Manipulation
• Data Reordering
• Interview Questions

*/