package patternPrinting;

import java.util.Scanner;

public class reversePyramidNumerical {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = rows; i >= 1; i--) {

            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

/*
Reverse Pyramid Numerical Pattern

Definition
• Reverse Pyramid Numerical Pattern me numbers reverse pyramid ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Har next row me leading spaces ek badh jati hain.
• Pehle increasing order me numbers print hote hain.
• Fir decreasing order me numbers print hote hain.
• Har next row me pyramid ki width kam hoti jati hai.

Key Points
• Pattern vertically symmetric hota hai.
• Pehle increasing numbers print hote hain.
• Fir decreasing numbers print hote hain.
• Har next row me spaces increase aur numbers decrease hote hain.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Spaces ↑
• Increasing Numbers
• Decreasing Numbers
• Shape = Reverse Pyramid
*/