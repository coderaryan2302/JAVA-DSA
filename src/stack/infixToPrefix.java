package stack;

import java.util.Scanner;
import java.util.Stack;

public class infixToPrefix {

    // Return Operator Precedence
    public static int precedence(char op) {

        if (op == '+' || op == '-') {
            return 1;
        }

        return 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Infix Expression : ");
        String expression = sc.nextLine();

        Stack<String> value = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isLetterOrDigit(ch)) {

                value.push(ch + "");

            } else {

                while (!operator.isEmpty()
                        && precedence(operator.peek()) >= precedence(ch)) {

                    String value2 = value.pop();
                    String value1 = value.pop();

                    char op = operator.pop();

                    value.push(op + value1 + value2);
                }

                operator.push(ch);
            }
        }

        while (!operator.isEmpty()) {

            String value2 = value.pop();
            String value1 = value.pop();

            char op = operator.pop();

            value.push(op + value1 + value2);
        }

        System.out.println("\nPrefix Expression : " + value.peek());

        sc.close();
    }
}

/*

Infix to Prefix

Definition

• Infix Expression ko Prefix Expression me Convert karna hota hai.
• Conversion ke liye Value Stack aur Operator Stack ka use kiya jata hai.

Concept Used

• Stack
• Expression Conversion
• Operator Precedence

Main Logic

• Expression ko Left se Right Traverse karo.
• Operand mile to Value Stack me Push karo.
• Operator mile to Higher ya Equal Precedence wale Operators ko Process karo.
• value1 aur value2 ko Pop karke Prefix Expression = operator + value1 + value2 banao.
• New Expression ko Value Stack me Push karo.
• Last me Value Stack ka Top hi Final Prefix Expression hota hai.

Example

Input

a+b*c

Output

+a*bc

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Simple Stack Based Solution.
• Operator Precedence Automatically Handle ho jati hai.
• Single Traversal me Conversion ho jata hai.

Disadvantages

• Extra Stacks ki Need hoti hai.
• Ye Code Brackets `()` Handle nahi karta.
• Valid Infix Expression hona zaroori hai.

Applications

• Expression Conversion
• Compiler Design
• Expression Evaluation
• Calculator Programs
• Interview Questions

*/