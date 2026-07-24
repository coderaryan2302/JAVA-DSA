package stack;

import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {

    // Check whether Brackets are Balanced
    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {

                stack.push(ch);

            } else if (ch == ')') {

                if (stack.isEmpty()) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    // Find Minimum Brackets to Remove
    public static int minimumBracketsToRemove(String str) {

        Stack<Character> stack = new Stack<>();
        int extraClosing = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {

                stack.push(ch);

            } else if (ch == ')') {

                if (stack.isEmpty()) {
                    extraClosing++;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.size() + extraClosing;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bracket Sequence : ");
        String str = sc.nextLine();

        System.out.println();

        if (isBalanced(str)) {
            System.out.println("Balanced Brackets : Yes");
        } else {
            System.out.println("Balanced Brackets : No");
        }

        System.out.println("Minimum Brackets To Remove : "
                + minimumBracketsToRemove(str));

        sc.close();
    }
}

/*

Balanced Brackets

Definition

• Check karna hota hai ki Brackets Properly Balanced hain ya nahi.
• Agar Balanced na hon to Minimum Brackets Remove karke Sequence ko Balanced banana hota hai.

Concept Used

• Stack
• LIFO (Last In First Out)

Main Logic

Balanced Check

• '(' mile to Stack me Push karo.
• ')' mile to Matching '(' Remove karo.
• Agar Stack Empty ho aur ')' mile to Sequence Unbalanced hai.
• Last me Stack Empty ho to Brackets Balanced hain.

Minimum Brackets to Remove

• Unmatched '(' ko Stack me Store karo.
• Unmatched ')' ko Count karo.
• Answer = Remaining '(' + Extra ')'.

Example

Input

(()))

Output

Balanced Brackets : No

Minimum Brackets To Remove : 1

Time Complexity

• isBalanced() : O(n)
• minimumBracketsToRemove() : O(n)

Space Complexity

• O(n)

Advantages

• Simple Stack Based Solution.
• Efficient Linear Time Solution.
• Empty Stack Exception se bachata hai.

Disadvantages

• Extra Stack ki Need hoti hai.
• Ye Code Sirf '(' aur ')' ko Handle karta hai.

Applications

• Balanced Parentheses
• Expression Validation
• Compiler Design
• Syntax Checking
• Interview Questions

*/