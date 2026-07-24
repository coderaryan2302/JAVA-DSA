package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class maximumSlidingWindow {

    // Find Maximum in Every Window
    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Calculate Next Greater Element
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nge[i] = n;
            } else {
                nge[i] = stack.peek();
            }

            stack.push(i);
        }

        int[] answer = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {

            int j = i;

            while (nge[j] < i + k) {
                j = nge[j];
            }

            answer[i] = nums[j];
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter Array Elements : ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter Window Size : ");
        int k = sc.nextInt();

        int[] answer = maxSlidingWindow(nums, k);

        System.out.println("\nMaximum Elements : "
                + Arrays.toString(answer));

        sc.close();
    }
}

/*

Maximum Sliding Window

Definition

• Har Window of Size k ka Maximum Element Find karna hota hai.
• Is Solution me Next Greater Element (NGE) aur Stack ka use kiya gaya hai.

Concept Used

• Stack
• Next Greater Element (NGE)
• Sliding Window

Main Logic

• Pehle Stack ki madad se har Element ka Next Greater Element Find karo.
• Har Window ke First Element se Start karo.
• NGE ki Help se Next Greater Element par Jump karte raho.
• Jab Jump Window ke Bahar chala jaye, Current Element hi Maximum hoga.

Example

Input

Array = 1 3 -1 -3 5 3 6 7

k = 3

Output

3 3 5 5 6 7

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Linear Time Solution.
• NGE ki wajah se Unnecessary Comparisons nahi hote.
• Large Arrays ke liye Efficient hai.

Disadvantages

• Extra NGE Array aur Stack ki Need hoti hai.
• Deque Solution ke Comparison me kam Popular hai.

Applications

• Sliding Window Problems
• Next Greater Element
• Monotonic Stack
• Competitive Programming
• Interview Questions

*/