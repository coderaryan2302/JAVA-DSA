package stack;

import java.util.Scanner;
import java.util.Stack;

public class postfixExpression {

    // Evaluate Postfix Expression
    public static int evaluate(String expression) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isDigit(ch)) {

                stack.push(ch - '0');

            } else {

                int value2 = stack.pop();
                int value1 = stack.pop();

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

        System.out.print("Enter Postfix Expression : ");
        String expression = sc.nextLine();

        int answer = evaluate(expression);

        System.out.println("\nAnswer : " + answer);

        sc.close();
    }
}

/*

Postfix Expression Evaluation

Definition

• Postfix Expression ka Result Stack ki madad se Evaluate kiya jata hai.
• Postfix me Operands pehle aur Operator baad me aata hai.

Concept Used

• Stack
• Expression Evaluation
• Left to Right Traversal

Main Logic

• Expression ko Left se Right Traverse karo.
• Operand mile to Stack me Push karo.
• Operator mile to Top ke 2 Operands Pop karo.
• value1 operator value2 Calculate karo.
• Result ko Stack me Push karo.
• Last me Stack ka Top hi Final Answer hota hai.

Example

Input

23*5+

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
• Valid Postfix Expression hona zaroori hai.
• Ye Code Single Digit Operands ke liye hai.

Applications

• Expression Evaluation
• Compiler Design
• Calculator Programs
• Expression Parsing
• Interview Questions

*/