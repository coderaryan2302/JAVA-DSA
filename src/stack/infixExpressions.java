package stack;

import java.util.Scanner;
import java.util.Stack;

public class infixExpressions {

    // Perform Calculation
    public static void calculate(Stack<Integer> value, Stack<Character> operator) {

        int value2 = value.pop();
        int value1 = value.pop();
        char op = operator.pop();

        switch (op) {

            case '+':
                value.push(value1 + value2);
                break;

            case '-':
                value.push(value1 - value2);
                break;

            case '*':
                value.push(value1 * value2);
                break;

            case '/':
                value.push(value1 / value2);
                break;
        }
    }

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

        Stack<Integer> value = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isDigit(ch)) {

                value.push(ch - '0');

            } else {

                while (!operator.isEmpty()
                        && precedence(operator.peek()) >= precedence(ch)) {

                    calculate(value, operator);
                }

                operator.push(ch);
            }
        }

        while (!operator.isEmpty()) {
            calculate(value, operator);
        }

        System.out.println("\nAnswer : " + value.peek());

        sc.close();
    }
}

/*

Infix Expression Evaluation

Definition

• Infix Expression ka Result Stack ki madad se Evaluate kiya jata hai.
• Isme Operator Precedence ka dhyan rakha jata hai.

Concept Used

• Two Stacks
• Operator Precedence
• Expression Evaluation

Main Logic

• Expression ko Left se Right Traverse karo.
• Digit mile to Value Stack me Push karo.
• Operator mile to Higher ya Equal Precedence wale Operators ko Pehle Calculate karo.
• Current Operator ko Operator Stack me Push karo.
• Traversal ke baad Remaining Operators ko Calculate karo.
• Last me Value Stack ka Top hi Final Answer hota hai.

Operator Precedence

High

*  /

Low

+  -

Example

Input

2+3*4

Output

14

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Operator Precedence Automatically Handle hoti hai.
• Efficient Linear Time Solution.
• Infix Expression ko Direct Evaluate karta hai.

Disadvantages

• Do Stacks ki Need hoti hai.
• Ye Code Sirf Single Digit Operands ko Support karta hai.
• Parentheses `()` Handle nahi karta.

Applications

• Expression Evaluation
• Compiler Design
• Calculator Programs
• Expression Parsing
• Interview Questions

*/