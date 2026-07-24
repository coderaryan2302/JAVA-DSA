package stack;

import java.util.Scanner;
import java.util.Stack;

public class stockSpanProblem {

    // Calculate Stock Span
    public static int[] stockSpan(int[] price) {

        int n = price.length;

        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {

            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Days : ");
        int n = sc.nextInt();

        int[] price = new int[n];

        System.out.print("Enter Stock Prices : ");

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int[] span = stockSpan(price);

        System.out.print("\nStock Span : ");

        for (int value : span) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}

/*

Stock Span Problem

Definition

• Har Day ke liye Span Find karna hota hai.
• Span = Aaj ke Din se pichhe tak lagatar jitne Days ki Price
  Aaj ki Price se Less Than ya Equal ho.

Concept Used

• Stack
• Previous Greater Element
• Index Based Traversal

Main Logic

• Stack me Indices Store karo.
• Current Price se Chhoti ya Equal Prices ko Pop karo.
• Agar Stack Empty ho to Span = i + 1.
• Warna Span = i - Previous Greater Index.
• Current Index ko Stack me Push karo.

Formula

• Stack Empty  → Span = i + 1
• Otherwise    → Span = i - stack.peek()

Example

Input

100 80 60 70 60 75 85

Output

1 1 1 2 1 4 6

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
• Indices Store karne padte hain.

Applications

• Stock Market Analysis
• Previous Greater Element
• Financial Data Processing
• Interview Questions

*/