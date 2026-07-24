package stack;

import java.util.Scanner;
import java.util.Stack;

public class celebrityProblem {

    // Find Celebrity
    public static int celebrity(int[][] matrix, int n) {

        Stack<Integer> stack = new Stack<>();

        // Push all Persons
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Eliminate Non-Celebrities
        while (stack.size() > 1) {

            int person1 = stack.pop();
            int person2 = stack.pop();

            if (matrix[person1][person2] == 0) {
                stack.push(person1);
            } else {
                stack.push(person2);
            }
        }

        if (stack.isEmpty()) {
            return -1;
        }

        int candidate = stack.pop();

        // Candidate should not know anyone
        for (int j = 0; j < n; j++) {

            if (matrix[candidate][j] == 1) {
                return -1;
            }
        }

        // Everyone should know candidate
        for (int i = 0; i < n; i++) {

            if (i != candidate && matrix[i][candidate] == 0) {
                return -1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Persons : ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("\nEnter Relationship Matrix (0 or 1) :");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int answer = celebrity(matrix, n);

        if (answer == -1) {
            System.out.println("\nCelebrity Not Found");
        } else {
            System.out.println("\nCelebrity Index : " + answer);
        }

        sc.close();
    }
}

/*

Celebrity Problem

Definition

• Celebrity wo Person hota hai jise sab log jaante hain, lekin wo kisi ko nahi jaanta.
• Agar aisa Person na ho to -1 Return karte hain.

Concept Used

• Stack
• Candidate Elimination

Main Logic

• Sabhi Persons ko Stack me Push karo.
• Har baar Top ke 2 Persons Compare karo.
• Jo Person kisi ko jaanta hai, wo Celebrity nahi ho sakta.
• Ek Candidate bachne tak Process Repeat karo.
• Last Candidate ko Verify karo.
• Candidate kisi ko na jaanta ho aur sab log Candidate ko jaante hon.

Example

Input

0 1 0

0 0 0

0 1 0

Output

Celebrity Index : 1

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Efficient Linear Time Solution.
• Har Comparison me ek Non-Celebrity Remove ho jata hai.
• Verification sirf ek Candidate ke liye hoti hai.

Disadvantages

• Extra Stack ki Need hoti hai.
• Final Verification Mandatory hoti hai.
• Two Pointer Approach se Space aur kam ho sakti hai.

Applications

• Celebrity Problem
• Candidate Elimination
• Stack Problems
• Competitive Programming
• Interview Questions

*/