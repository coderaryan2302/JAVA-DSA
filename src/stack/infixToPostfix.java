package stack;

import java.util.Scanner;
import java.util.Stack;

public class infixToPostfix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Infix Expression : ");
        String infix = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {

            char ch = infix.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isLetterOrDigit(ch)) {

                postfix += ch;

            } else if (ch == '(') {

                stack.push(ch);

            } else if (ch == ')') {

                while (stack.peek() != '(') {
                    postfix += stack.pop();
                }

                stack.pop();

            } else {

                while (!stack.isEmpty()) {

                    char top = stack.peek();

                    if (top == '(') {
                        break;
                    }

                    if ((ch == '+' || ch == '-') ||
                            ((ch == '*' || ch == '/') &&
                                    (top == '*' || top == '/'))) {

                        postfix += stack.pop();

                    } else {
                        break;
                    }
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        System.out.println("\nPostfix Expression : " + postfix);

        sc.close();
    }
}

/*

Infix to Postfix

Definition

• Infix Expression ko Postfix Expression me Convert karna hota hai.
• Conversion ke liye Stack aur Operator Precedence ka use kiya jata hai.

Concept Used

• Stack
• Expression Conversion
• Operator Precedence
• Parentheses Handling

Main Logic

• Expression ko Left se Right Traverse karo.
• Operand mile to Direct Output me Add karo.
• '(' mile to Stack me Push karo.
• ')' mile to '(' tak sab Operators Pop karo.
• Operator mile to Higher ya Equal Precedence wale Operators ko Pop karo.
• Current Operator ko Stack me Push karo.
• Last me Stack ke Remaining Operators ko Output me Add karo.

Example

Input

a+b*c

Output

abc*+

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Efficient Linear Time Solution.
• Operator Precedence aur Parentheses Automatically Handle ho jate hain.
• Compiler aur Expression Conversion me bahut Use hota hai.

Disadvantages

• Extra Stack ki Need hoti hai.
• Valid Infix Expression hona zaroori hai.

Applications

• Expression Conversion
• Compiler Design
• Expression Evaluation
• Calculator Programs
• Interview Questions

*/