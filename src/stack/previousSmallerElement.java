package stack;

import java.util.Arrays;
import java.util.Stack;

public class previousSmallerElement {

    public static int[] previousSmaller(int[] arr) {

        int[] answer = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {4, 8, 5, 2, 25};

        System.out.println("Array : " + Arrays.toString(arr));

        int[] answer = previousSmaller(arr);

        System.out.println("Previous Smaller Element : "
                + Arrays.toString(answer));
    }
}

/*

Previous Smaller Element

Definition

• Har Element ke Left Side ka pehla Smaller Element Find karna hota hai.
• Agar Smaller Element na mile to -1 Return karte hain.

Concept Used

• Stack
• Monotonic Increasing Stack

Main Logic

• Array ko Left se Right Traverse karo.
• Current Element se Bade ya Equal Elements ko Stack se Remove karo.
• Agar Stack Empty ho to Answer = -1.
• Warna Stack Top hi Previous Smaller Element hai.
• Current Element ko Stack me Push karo.

Example

Input

4 8 5 2 25

Output

-1 4 4 -1 2

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Efficient Linear Time Solution.
• Har Element Maximum ek baar Push aur Pop hota hai.
• Nested Loop ki Need nahi hoti.

Disadvantages

• Extra Stack ki Need hoti hai.
• Monotonic Stack Concept samajhna zaroori hai.

Applications

• Monotonic Stack Problems
• Histogram Problems
• Nearest Smaller Element
• Range Queries
• Interview Questions

*/