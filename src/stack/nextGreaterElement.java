package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {

    // Brute Force Approach
    public static int[] bruteForce(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            result[i] = -1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }

        return result;
    }

    // Stack Approach
    public static int[] stackMethod(int[] arr) {

        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array Elements : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nBrute Force : "
                + Arrays.toString(bruteForce(arr)));

        System.out.println("Stack Method : "
                + Arrays.toString(stackMethod(arr)));

        sc.close();
    }
}

/*

Next Greater Element

Definition

• Har Element ke Right Side ka pehla Greater Element Find karna hota hai.
• Agar Greater Element na mile to -1 Return karte hain.

Concept Used

• Stack
• Monotonic Decreasing Stack

Main Logic

Brute Force

• Har Element ke Right Side me Search karo.
• Pehla Greater Element milte hi Store kar do.

Stack Method

• Array ko Right se Left Traverse karo.
• Current Element se Chhote ya Equal Elements ko Stack se Remove karo.
• Agar Stack Empty ho to Answer = -1.
• Warna Stack Top hi Next Greater Element hai.
• Current Element ko Stack me Push karo.

Example

Input

4 5 2 10

Output

5 10 10 -1

Time Complexity

Brute Force

• O(n²)

Stack Method

• O(n)

Space Complexity

Brute Force

• O(1)

Stack Method

• O(n)

Advantages

• Stack Method bahut Efficient hai.
• Har Element Maximum ek baar Push aur Pop hota hai.
• Nested Loop ki Need nahi hoti.

Disadvantages

• Stack Method me Extra Stack ki Need hoti hai.
• Monotonic Stack Concept samajhna zaroori hai.

Applications

• Monotonic Stack Problems
• Stock Span Problem
• Histogram Problems
• Nearest Greater Element
• Interview Questions

*/