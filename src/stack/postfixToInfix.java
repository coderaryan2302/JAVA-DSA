package stack;

import java.util.Scanner;
import java.util.Stack;

public class postfixToInfix {

    // Convert Postfix to Infix
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

                stack.push("(" + value1 + ch + value2 + ")");
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Postfix Expression : ");
        String postfix = sc.nextLine();

        String infix = convert(postfix);

        System.out.println("\nInfix Expression : " + infix);

        sc.close();
    }
}

/*

Postfix to Infix

Definition

• Postfix Expression ko Infix Expression me Convert karna hota hai.
• Stack ka use karke Conversion ki jaati hai.
• Correct Order maintain karne ke liye Brackets use hote hain.

Concept Used

• Stack
• Expression Conversion
• Left to Right Traversal

Main Logic

• Postfix Expression ko Left se Right Traverse karo.
• Operand mile to Stack me Push karo.
• Operator mile to Top ke 2 Expressions Pop karo.
• New Expression = (value1 operator value2).
• New Expression ko Stack me Push karo.
• Last me Stack ka Top hi Final Infix Expression hota hai.

Example

Input

ab+c*

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
• Valid Postfix Expression hona zaroori hai.
• Brackets ki wajah se Output lamba ho sakta hai.

Applications

• Expression Conversion
• Compiler Design
• Expression Evaluation
• Calculator Programs
• Interview Questions

*/