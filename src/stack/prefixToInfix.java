package stack;

import java.util.Scanner;
import java.util.Stack;

public class prefixToInfix {

    // Convert Prefix to Infix
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

                stack.push("(" + value1 + ch + value2 + ")");
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Prefix Expression : ");
        String prefix = sc.nextLine();

        String infix = convert(prefix);

        System.out.println("\nInfix Expression : " + infix);

        sc.close();
    }
}

/*

Prefix to Infix

Definition

• Prefix Expression ko Infix Expression me Convert karna hota hai.
• Stack ka use karke Conversion ki jaati hai.
• Correct Order maintain karne ke liye Brackets use hote hain.

Concept Used

• Stack
• Expression Conversion
• Right to Left Traversal

Main Logic

• Prefix Expression ko Right se Left Traverse karo.
• Operand mile to Stack me Push karo.
• Operator mile to Top ke 2 Operands Pop karo.
• New Expression = (value1 operator value2).
• New Expression ko Stack me Push karo.
• Last me Stack ka Top hi Final Infix Expression hota hai.

Example

Input

*+abc

Output

((a+b)*c)

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Simple Stack Based Solution.
• Single Traversal me Conversion ho jata hai.
• Expression ka Correct Evaluation Order Maintain rehta hai.

Disadvantages

• Extra Stack ki Need hoti hai.
• Valid Prefix Expression hona zaroori hai.
• Brackets ki wajah se Output lamba ho sakta hai.

Applications

• Expression Conversion
• Compiler Design
• Expression Evaluation
• Calculator Programs
• Interview Questions

*/