package stack;

import java.util.Scanner;
import java.util.Stack;

public class prefixExpression {

    // Evaluate Prefix Expression
    public static int evaluate(String expression) {

        Stack<Integer> stack = new Stack<>();

        // Traverse Right to Left
        for (int i = expression.length() - 1; i >= 0; i--) {

            char ch = expression.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isDigit(ch)) {

                stack.push(ch - '0');

            } else {

                int value1 = stack.pop();
                int value2 = stack.pop();

                switch (ch) {

                    case '+':
                        stack.push(value1 + value2);
                        break;

                    case '-':
                        stack.push(value1 - value2);
                        break;

                    case '*':
                        stack.push(value1 * value2);
                        break;

                    case '/':
                        stack.push(value1 / value2);
                        break;
                }
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Prefix Expression : ");
        String expression = sc.nextLine();

        int answer = evaluate(expression);

        System.out.println("\nAnswer : " + answer);

        sc.close();
    }
}

/*

Prefix Expression Evaluation

Definition

• Prefix Expression ka Result Stack ki madad se Evaluate kiya jata hai.
• Prefix me Operator pehle aur Operands baad me aate hain.

Concept Used

• Stack
• Expression Evaluation
• Right to Left Traversal

Main Logic

• Expression ko Right se Left Traverse karo.
• Operand mile to Stack me Push karo.
• Operator mile to Top ke 2 Operands Pop karo.
• value1 operator value2 Calculate karo.
• Result ko Stack me Push karo.
• Last me Stack ka Top hi Final Answer hota hai.

Example

Input

+*235

Output

11

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Simple Stack Based Solution.
• Operator Precedence Handle karne ki Need nahi hoti.
• Single Traversal me Evaluation ho jata hai.

Disadvantages

• Extra Stack ki Need hoti hai.
• Valid Prefix Expression hona zaroori hai.
• Ye Code Single Digit Operands ke liye hai.

Applications

• Expression Evaluation
• Compiler Design
• Calculator Programs
• Expression Parsing
• Interview Questions

*/