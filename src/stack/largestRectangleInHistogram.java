package stack;

import java.util.Scanner;
import java.util.Stack;

public class largestRectangleInHistogram {

    public static int largestRectangle(int[] heights) {

        int n = heights.length;

        int[] nse = new int[n];     // Next Smaller Element
        int[] pse = new int[n];     // Previous Smaller Element

        Stack<Integer> stack = new Stack<>();

        // Next Smaller Element
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nse[i] = n;
            } else {
                nse[i] = stack.peek();
            }

            stack.push(i);
        }

        stack.clear();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = stack.peek();
            }

            stack.push(i);
        }

        int maxArea = 0;

        // Calculate Maximum Area
        for (int i = 0; i < n; i++) {

            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Bars : ");
        int n = sc.nextInt();

        int[] heights = new int[n];

        System.out.print("Enter Heights : ");

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int answer = largestRectangle(heights);

        System.out.println("\nLargest Rectangle Area : " + answer);

        sc.close();
    }
}

/*

Largest Rectangle in Histogram

Definition

• Histogram me Maximum Rectangular Area Find karna hota hai.
• Har Bar ki Width = 1 hoti hai.

Concept Used

• Stack
• Previous Smaller Element (PSE)
• Next Smaller Element (NSE)

Main Logic

• Har Bar ke liye Previous Smaller aur Next Smaller Element Find karo.
• Width = NSE - PSE - 1
• Area = Height × Width
• Sabhi Bars ka Area Calculate karke Maximum Area Return karo.

Formula

Width = NSE - PSE - 1

Area = Height × Width

Example

Input

2 1 5 6 2 3

Output

10

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Efficient Linear Time Solution.
• PSE aur NSE ek hi Traversal me Find ho jate hain.
• Nested Loop ki Need nahi hoti.

Disadvantages

• Extra Stack aur Arrays ki Need hoti hai.
• Formula yaad rakhna zaroori hai.

Applications

• Histogram Problems
• Monotonic Stack
• Maximal Rectangle Problem
• Competitive Programming
• Interview Questions

*/