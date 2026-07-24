package queue.single;

import java.util.LinkedList;
import java.util.Queue;

public class firstNegativeIntegerInEveryWindowOfSizeK {

    /*
        Given an array and window size K,
        return the first negative integer
        in every window.
    */

    public long[] printFirstNegativeInteger(long[] arr, int n, int k) {

        long[] result = new long[n - k + 1];

        Queue<Integer> queue = new LinkedList<>();

        // Store indices of negative numbers
        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {
                queue.add(i);
            }
        }

        // Process every window
        for (int i = 0; i <= n - k; i++) {

            // Remove indices outside current window
            while (!queue.isEmpty() && queue.peek() < i) {
                queue.remove();
            }

            // First negative element
            if (!queue.isEmpty() && queue.peek() <= i + k - 1) {
                result[i] = arr[queue.peek()];
            } else {
                result[i] = 0;
            }
        }

        return result;
    }
}

/*

First Negative Integer in Every Window of Size K

Definition

• Har Window of Size K ke liye First Negative Element find karna hota hai.
• Queue me Negative Elements ke Indices store kiye jate hain.

Concept Used

• Sliding Window
• Queue
• Store Indices

Main Logic

• Pehle sabhi Negative Elements ke Indices Queue me store karo.
• Window ke bahar wale Indices remove karo.
• Queue ka Front hamesha Current Window ka First Negative Element hota hai.
• Agar Queue Empty ho to Answer 0 hota hai.

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Linear Time Solution
• Efficient for Large Arrays
• Queue ka Efficient Use

Disadvantages

• Extra Space lagti hai.
• Indices ko Manage karna padta hai.

Applications

• Sliding Window Problems
• Streaming Data
• Real-Time Data Processing
• Window Based Queries

*/