package patternPrinting;

import java.util.Scanner;

public class pyramidNumerical {

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
Pyramid Numerical Pattern

Definition
• Pyramid Numerical Pattern me numbers pyramid ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Har row ke shuru me leading spaces print hoti hain.
• Pehle increasing order me numbers print hote hain.
• Fir decreasing order me numbers print hote hain.
• Har next row me numbers badhte aur spaces kam hoti jati hain.

Key Points
• Pattern vertically symmetric hota hai.
• Har next row me spaces decrease hoti hain.
• Pehle increasing numbers print hote hain.
• Fir decreasing numbers print hote hain.
• Total numbers in each row = (2 × Row Number - 1)

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Spaces ↓
• Increasing Numbers
• Decreasing Numbers
• Shape = Pyramid
*/