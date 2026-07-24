package stack;

import java.util.Scanner;
import java.util.Stack;

public class prefixToPostfix {

    // Convert Prefix to Postfix
    public static String convert(String prefix) {

        Stack<String> stack = new Stack<>();

        // Traverse Right to Left
        for (int i = prefix.length() - 1; i >= 0; i--) {

            char ch = prefix.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isLetterOrDigit(ch)) {

                stack.push(ch + "");

            } else {

                String value1 = stack.pop();
                String value2 = stack.pop();

                stack.push(value1 + value2 + ch);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Prefix Expression : ");
        String prefix = sc.nextLine();

        String postfix = convert(prefix);

        System.out.println("\nPostfix Expression : " + postfix);

        sc.close();
    }
}

/*

Prefix to Postfix

Definition

• Prefix Expression ko Postfix Expression me Convert karna hota hai.
• Stack ka use karke Conversion ki jaati hai.

Concept Used

• Stack
• Expression Conversion
• Right to Left Traversal

Main Logic

• Prefix Expression ko Right se Left Traverse karo.
• Operand mile to Stack me Push karo.
• Operator mile to Top ke 2 Operands Pop karo.
• New Expression = value1 + value2 + operator.
• New Expression ko wapas Stack me Push karo.
• Last me Stack ka Top hi Final Postfix Expression hota hai.

Example

Input

*+abc

Output

ab+c*

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
• Valid Prefix Expression hona zaroori hai.

Applications

• Expression Conversion
• Compiler Design
• Expression Evaluation
• Calculator Programs
• Interview Questions

*/