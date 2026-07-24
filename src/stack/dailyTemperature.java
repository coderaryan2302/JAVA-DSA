package stack;

import java.util.Arrays;
import java.util.Stack;

public class dailyTemperature {

    public static int[] dailyTemperatures(int[] temperature) {

        int[] answer = new int[temperature.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = temperature.length - 1; i >= 0; i--) {

            while (!stack.isEmpty()
                    && temperature[stack.peek()] <= temperature[i]) {

                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] temperature = {73, 74, 75, 71, 69, 72, 76, 73};

        System.out.println("Temperature : "
                + Arrays.toString(temperature));

        int[] answer = dailyTemperatures(temperature);

        System.out.println("Answer      : "
                + Arrays.toString(answer));
    }
}

/*

Daily Temperatures

Definition

• Har Day ke liye agle Warmer Temperature tak kitne Din Wait karna padega, ye Find karna hota hai.
• Agar Future me Warmer Temperature na mile to Answer = 0.

Concept Used

• Stack
• Monotonic Decreasing Stack
• Next Greater Element

Main Logic

• Array ko Right se Left Traverse karo.
• Current Temperature se Chhote ya Equal Temperatures ko Stack se Remove karo.
• Agar Stack Empty ho to Answer = 0.
• Warna Stack Top ka Index - Current Index hi Waiting Days hai.
• Current Index ko Stack me Push karo.

Example

Input

73 74 75 71 69 72 76 73

Output

1 1 4 2 1 1 0 0

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Efficient Linear Time Solution.
• Har Index Maximum ek baar Push aur Pop hota hai.
• Nested Loop ki Need nahi hoti.

Disadvantages

• Extra Stack ki Need hoti hai.
• Index Store karna zaroori hota hai.

Applications

• Daily Temperatures Problem
• Next Greater Element
• Monotonic Stack Problems
• Weather Analysis
• Interview Questions

*/