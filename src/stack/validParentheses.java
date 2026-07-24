package stack;

import java.util.Scanner;
import java.util.Stack;

public class validParentheses {

    // Check Valid Parentheses
    public static boolean isValid(String expression) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            // Opening Brackets
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                if (ch == ')' && stack.peek() != '(') {
                    return false;
                }

                if (ch == '}' && stack.peek() != '{') {
                    return false;
                }

                if (ch == ']' && stack.peek() != '[') {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Expression : ");
        String expression = sc.nextLine();

        if (isValid(expression)) {
            System.out.println("\nValid Parentheses");
        } else {
            System.out.println("\nInvalid Parentheses");
        }

        sc.close();
    }
}

/*

Valid Parentheses

Definition

• Check karna hota hai ki diya gaya Parentheses Expression Valid hai ya nahi.
• Har Opening Bracket ka Matching Closing Bracket hona chahiye.
• Brackets ka Order bhi Correct hona chahiye.

LeetCode

• 20 - Valid Parentheses

Concept Used

• Stack
• LIFO (Last In First Out)

Main Logic

• Opening Bracket mile to Stack me Push karo.
• Closing Bracket mile to Stack ka Top Check karo.
• Agar Match kare to Pop karo.
• Agar Match na kare ya Stack Empty ho to Invalid hai.
• End me Stack Empty ho to Expression Valid hai.

Rules

• ( ↔ )
• { ↔ }
• [ ↔ ]

Example

Input

({[]})

Output

Valid

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Simple aur Efficient Solution.
• Nested aur Mixed Brackets ko Easily Handle karta hai.
• Single Traversal me Problem Solve hoti hai.

Disadvantages

• Extra Stack ki Need hoti hai.
• Sirf Balanced Brackets Validation ke liye Useful hai.

Applications

• Expression Evaluation
• Compiler Syntax Checking
• HTML/XML Tag Validation
• Balanced Brackets Problems
• Parsing Algorithms

*/