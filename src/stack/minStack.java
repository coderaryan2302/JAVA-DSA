package stack;

import java.util.Scanner;
import java.util.Stack;

public class minStack {

    private final Stack<Long> stack = new Stack<>();
    private long min;

    // Push Element
    public void push(int value) {

        if (stack.isEmpty()) {

            stack.push((long) value);
            min = value;

        } else {

            if (value >= min) {

                stack.push((long) value);

            } else {

                stack.push(2L * value - min);   // Store Encoded Value
                min = value;
            }
        }
    }

    // Remove Top Element
    public void pop() {

        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        long top = stack.pop();

        if (top < min) {
            min = 2 * min - top;               // Restore Previous Minimum
        }
    }

    // Get Top Element
    public int top() {

        if (stack.isEmpty()) {
            return -1;
        }

        long top = stack.peek();

        if (top >= min) {
            return (int) top;
        }

        return (int) min;
    }

    // Get Minimum Element
    public int getMin() {

        if (stack.isEmpty()) {
            return -1;
        }

        return (int) min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        minStack stack = new minStack();

        while (true) {

            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Get Minimum");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Value : ");
                    stack.push(sc.nextInt());
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    System.out.println("Top Element : " + stack.top());
                    break;

                case 4:
                    System.out.println("Minimum Element : " + stack.getMin());
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

/*

Min Stack

Definition

• Aisa Stack jo Push, Pop, Top aur Get Minimum ko O(1) Time me Perform karta hai.
• Is Solution me sirf ek Stack aur ek Minimum Variable ka use hota hai.

Concept Used

• Stack
• Encoding Technique

Main Logic

• Stack Empty ho to Value ko Push karke Minimum Update karo.
• Agar New Value Minimum se Badi ya Equal ho to Normally Push karo.
• Agar New Value Chhoti ho to Encoded Value Push karo aur Minimum Update karo.
• Pop ke time Encoded Value mile to Previous Minimum Restore karo.
• Top ke time Encoded Value ho to Current Minimum Return karo.

Encoding Formula

Encoded Value = 2 × NewMinimum − OldMinimum

Decoding Formula

OldMinimum = 2 × CurrentMinimum − EncodedValue

Example

Push : 5

Min = 5

Push : 2

Encoded = -1

Min = 2

Pop

Restore Min = 5

Time Complexity

• Push    : O(1)
• Pop     : O(1)
• Top     : O(1)
• GetMin  : O(1)

Space Complexity

• O(n)

Extra Space

• O(1)

Advantages

• Sabhi Operations O(1) Time me hote hain.
• Extra Stack ki Need nahi hoti.
• Space Efficient Solution hai.

Disadvantages

• Encoding Logic thoda Difficult hai.
• Overflow se bachne ke liye long use karna padta hai.

Applications

• Min Stack Problems
• Competitive Programming
• Interview Questions
• Space Optimized Stack Design

*/