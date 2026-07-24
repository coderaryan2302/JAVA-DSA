package stack;

import java.util.Scanner;
import java.util.Stack;

public class postfixToPrefix {

    // Convert Postfix to Prefix
    public static String convert(String postfix) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {

            char ch = postfix.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isLetterOrDigit(ch)) {

                stack.push(ch + "");

            } else {

                String value2 = stack.pop();
                String value1 = stack.pop();

                stack.push(ch + value1 + value2);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Postfix Expression : ");
        String postfix = sc.nextLine();

        String prefix = convert(postfix);

        System.out.println("\nPrefix Expression : " + prefix);

        sc.close();
    }
}

/*

Postfix to Prefix

Definition

• Postfix Expression ko Prefix Expression me Convert karna hota hai.
• Stack ka use karke Conversion ki jaati hai.

Concept Used

• Stack
• Expression Conversion
• Left to Right Traversal

Main Logic

• Postfix Expression ko Left se Right Traverse karo.
• Operand mile to Stack me Push karo.
• Operator mile to Top ke 2 Expressions Pop karo.
• New Expression = operator + value1 + value2.
• New Expression ko Stack me Push karo.
• Last me Stack ka Top hi Final Prefix Expression hota hai.

Example

Input

ab+c*

Output

*+abc

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Simple Stack Based Solution.
• Single Traversal me Conversion ho jata hai.
• Variables aur Digits dono ko Support karta hai.

Disadvantages

• Extra Stack ki Need hoti hai.
• Valid Postfix Expression hona zaroori hai.

Applications

• Expression Conversion
• Compiler Design
• Expression Evaluation
• Calculator Programs
• Interview Questions

*/