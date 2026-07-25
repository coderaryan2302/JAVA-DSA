package patternPrinting;

import java.util.Scanner;

public class leftNumericalTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

/*
Left Numerical Triangle Pattern

Definition
• Left Numerical Triangle Pattern me numbers left side se aligned triangle ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Har row ke shuru me leading spaces print hoti hain.
• Spaces ke baad 1 se current row tak numbers print hote hain.
• Har next row me spaces kam aur numbers zyada hote jate hain.

Key Points
• Har next row me spaces decrease hoti hain.
• Numbers hamesha 1 se start hote hain.
• Har row me numbers increasing order me print hote hain.
• Last row me 1 se rows tak numbers print hote hain.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Spaces ↓
• Numbers ↑
• Numbers Print → 1 to Current Row
• Shape = Left Numerical Triangle
*/