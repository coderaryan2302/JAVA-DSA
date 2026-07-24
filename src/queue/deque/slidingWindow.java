package queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class slidingWindow {

    public static void slidingWindowMaximum(int[] arr, int k) {

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove indices outside current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Print maximum
            if (i >= k - 1) {
                System.out.print(arr[deque.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.print("Maximum Elements : ");
        slidingWindowMaximum(arr, k);
    }
}

/*

Sliding Window Maximum (LeetCode 239)

Definition

• Har Window of Size K ka Maximum Element find karna hota hai.
• Deque me Indices store kiye jate hain.

Concept Used

• Sliding Window
• Deque
• Monotonic Queue

Main Logic

• Current Window ke bahar wale Indices remove karo.
• Rear se sabhi chhote Elements remove karo.
• Current Index insert karo.
• Front par hamesha Window ka Maximum Element hota hai.

Time Complexity

• O(n)

Space Complexity

• O(k)

Advantages

• Linear Time Solution
• Better than Brute Force
• Efficient for Large Arrays

Disadvantages

• Logic thodi Complex hoti hai.
• Deque Concept samajhna zaroori hai.

Applications

• Sliding Window Problems
• Stock Price Analysis
• Streaming Data
• Real-Time Monitoring
• LeetCode 239

*/