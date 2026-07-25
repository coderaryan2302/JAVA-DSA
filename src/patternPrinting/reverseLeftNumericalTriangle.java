package patternPrinting;

import java.util.Scanner;

public class reverseLeftNumericalTriangle {

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

            // Print numbers
            for (int j = rows; j >= i; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

/*
Reverse Left Numerical Triangle Pattern

Definition
• Reverse Left Numerical Triangle Pattern me numbers ulte left-aligned triangle ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Har next row me leading spaces ek badh jati hain.
• Numbers rows se current row tak descending order me print hote hain.
• Har next row me ek number kam print hota hai.

Key Points
• Har next row me spaces increase hoti hain.
• Numbers descending order me print hote hain.
• Har next row me ek number kam hota hai.
• Ye nested loops ka basic pattern hai.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Spaces ↑
• Numbers ↓
• Shape = Reverse Left Numerical Triangle
*/