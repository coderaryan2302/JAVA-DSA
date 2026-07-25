package patternPrinting;

import java.util.Scanner;

public class leftTriangularPattern {

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

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
Left Triangle Pattern

Definition
• Left Triangle Pattern me stars left side se aligned right triangle ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Har row ke shuru me leading spaces print hoti hain.
• Spaces ke baad current row ke according stars print hote hain.
• Har next row me spaces kam aur stars zyada hote jate hain.

Key Points
• Har next row me spaces decrease hoti hain.
• Har next row me stars increase hote hain.
• First row me ek star hota hai.
• Last row me rows ke barabar stars hote hain.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Spaces ↓
• Stars ↑
• Shape = Left Triangle
*/