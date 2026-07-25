package patternPrinting;

import java.util.Scanner;

public class reverseLeftTriangular {

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
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
Reverse Left Triangle Pattern

Definition
• Reverse Left Triangle Pattern me stars ulte left-aligned triangle ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Har next row me leading spaces ek badh jati hain.
• Stars ki sankhya har row me ek kam hoti jati hai.
• Isse reverse left triangle ki shape banti hai.

Key Points
• Har next row me spaces increase hoti hain.
• Har next row me stars decrease hote hain.
• First row me sabse zyada stars hote hain.
• Last row me sirf ek star hota hai.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Spaces ↑
• Stars ↓
• Shape = Reverse Left Triangle
*/